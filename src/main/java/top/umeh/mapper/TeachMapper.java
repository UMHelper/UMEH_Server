package top.umeh.mapper;

import org.apache.ibatis.annotations.Select;
import top.umeh.proj.Teach;

import java.util.List;

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
}
