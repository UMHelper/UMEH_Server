create table if not exists umeh.course
(
    Offering_Unit         char          null,
    Offering_Department   char          null,
    New_code              char          not null
        constraint `PRIMARY`
        primary key,
    Old_code              char          null,
    courseTitleEng        char          null,
    courseTitleChi        char          null,
    Credits               int default 3 null,
    Medium_of_Instruction char          null,
    constraint course_New_code_uindex
        unique (New_code)
);

create table if not exists umeh.prof
(
    name char not null
        constraint `PRIMARY`
        primary key,
    constraint prof_name_uindex
        unique (name)
);

create table if not exists umeh.teach
(
    result     float null,
    comments   int   null,
    attendance float null,
    grade      float null,
    hard       float null,
    reward     float null,
    course     char  null,
    prof       char  null,
    id         int   not null
        constraint `PRIMARY`
        primary key,
    constraint course
        foreign key (course) references umeh.course (New_code)
            on update set null on delete set null,
    constraint prof
        foreign key (prof) references umeh.prof (name)
            on update set null on delete set null
);

create table if not exists umeh.comment
(
    teach      int      null,
    content    longtext null,
    attendance float    null,
    pre        float    null,
    grade      float    null,
    hard       float    null,
    reward     float    null,
    recommend  float    null,
    assignment float    null,
    result     float    null,
    pub_time   datetime null,
    upvote     int      null,
    downvote   int      null,
    id         int auto_increment
        constraint `PRIMARY`
        primary key,
    constraint comment_id_uindex
        unique (id),
    constraint teach
        foreign key (teach) references umeh.teach (id)
            on update set null on delete set null
);


