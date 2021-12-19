create table if not exists umeh.comment
(
    id         int auto_increment
        constraint `PRIMARY`
        primary key,
    content    longtext      null,
    attendance float         null,
    pre        float         null,
    grade      float         null,
    hard       float         null,
    reward     float         null,
    recommend  float         null,
    assignment float         null,
    result     float         null,
    pub_time   datetime      null,
    upvote     int default 0 null,
    downvote   int default 0 null,
    teach      int           not null,
    constraint comment_id_uindex
        unique (id)
);

create index teaach
    on umeh.comment (teach);

create table if not exists umeh.course
(
    offering_unit         char(255)     null,
    offering_department   char(255)     null,
    new_code              char(255)     not null
        constraint `PRIMARY`
        primary key,
    old_code              char(255)     null,
    course_title_eng      char(255)     null,
    course_title_chi      char(255)     null,
    credits               int default 3 null,
    course_duration       char(255)     null,
    medium_of_instruction char(255)     null,
    constraint course_New_code_uindex
        unique (new_code)
);

create table if not exists umeh.prof
(
    name char(255) not null
        constraint `PRIMARY`
        primary key,
    constraint prof_name_uindex
        unique (name)
);

create table if not exists umeh.schedule
(
    id            int auto_increment
        constraint `PRIMARY`
        primary key,
    teach         int null,
    time_location int null,
    constraint schedule_id_uindex
        unique (id)
);

create index schedule_teach
    on umeh.schedule (teach);

create index schedule_time_location
    on umeh.schedule (time_location);

create table if not exists umeh.statistics
(
    name    char(255) not null
        constraint `PRIMARY`
        primary key,
    course  int       null,
    comment int       null,
    constraint statistics_name_uindex
        unique (name)
);

create table if not exists umeh.teach
(
    id         int auto_increment
        constraint `PRIMARY`
        primary key,
    course     char(255) null,
    prof       char(255) null,
    result     float     null,
    comments   int       null,
    attendance float     null,
    grade      float     null,
    hard       float     null,
    reward     float     null,
    constraint teach_id_uindex
        unique (id)
);

create index course
    on umeh.teach (course);

create index prof
    on umeh.teach (prof);

create table if not exists umeh.time_location
(
    id       int auto_increment
        constraint `PRIMARY`
        primary key,
    date     char(255) null,
    time     char(255) null,
    location char(255) null,
    constraint time_location_id_uindex
        unique (id)
);


