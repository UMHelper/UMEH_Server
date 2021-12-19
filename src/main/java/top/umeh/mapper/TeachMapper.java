package top.umeh.mapper;

import org.apache.ibatis.annotations.*;
import top.umeh.proj.Teach;

import java.util.List;

@Mapper
public interface TeachMapper {

    @Select ("select * from teach where id=#{id}")
    public Teach getById(Long id);

    @Select ("select * from teach where course=#{course}")
    public List<Teach> getByCourse(String course);

    @Select ("select * from teach where prof=#{prof}")
    public List<Teach> getByProf(String prof);

    @Select ("select * from teach where prof=#{prof} and course=#{course}")
    public Teach getByCourseAndProf(String course, String prof);

    @Select ("select * from teach")
    public List<Teach> getAll();

    @Insert ("insert into teach(id, course, prof, result, comments, attendance, grade, hard, reward) " +
            "values(#{id}, #{course}, #{prof}, #{result}, #{comments}, #{attendance}, #{grade}, #{hard}, #{reward})")
    public void insert(Teach teach);

    @Update ("update teach set course=#{course}, prof=#{prof}, result=#{result}, comments=#{comments}, " +
            "attendance=#{attendance}, grade=#{grade}, hard=#{hard}, reward=#{reward} where id=#{id}")
    public void update(Teach teach);

    @Delete ("delete from teach where id=#{id}")
    public void delete(Teach teach);

}
