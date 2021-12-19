package top.umeh.mapper;

import org.apache.ibatis.annotations.*;
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

    @Insert ("insert into course(offering_unit, offering_department, new_code, old_code, course_title_eng, course_title_chi, course_duration, medium_of_instruction) " +
            "values (#{offeringUnit}, #{offeringDepartment}, #{newCode}, #{oldCode}, #{courseTitleEng}, #{courseTitleChi}, #{courseDuration}, #{mediumOfInstruction})")
    public void insert(Course course);

    @Update ("update course set offering_unit=#{offeringUnit}, offering_department=#{offeringDepartment},  " +
            "old_code=#{oldCode}, course_title_eng=#{courseTitleEng}, course_title_chi=#{courseTitleChi}, course_duration=#{courseDuration}, " +
            "medium_of_instruction=#{mediumOfInstruction} where new_code=#{newCode}")
    public void update(Course course);

    @Delete ("delete from course where new_code=#{cewCode}")
    public void  delete(String  newCode);

    @Delete ("delete from course where new_code=#{cewCode}")
    public void  delete(Course course);
}
