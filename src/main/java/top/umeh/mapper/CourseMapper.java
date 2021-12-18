package top.umeh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.umeh.proj.Course;

import java.util.List;

/**
 * @author Box
 */
@Mapper
public interface CourseMapper {

    @Select ("select * from course where new_code=#{newCode}")
    public Course getByNewCode(String newCode);

    @Select ("select * from course")
    public List<Course> getAll();
}
