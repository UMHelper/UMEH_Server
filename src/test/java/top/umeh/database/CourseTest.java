package top.umeh.database;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.umeh.proj.Course;
import top.umeh.service.CourseService;

import java.util.List;

@SpringBootTest
public class CourseTest {

    @Autowired
    CourseService courseService;

    @Test
    public void insertTest(){
        Course course=new Course ();
        course.setCourseDuration ("Test");
        course.setCourseTitleChi ("Test");
        course.setCourseTitleEng ("Test");
        course.setCredits (3);
        int num=courseService.getAll ().size ()+1000;
        course.setNewCode ("ACCT"+num);
        course.setMediumOfInstruction ("Chinese");
        course.setOfferingDepartment ("CIS");
        course.setOfferingUnit ("FST");
        course.setOldCode ("");
        courseService.insert (course);
    }

    @Test
    public void getByNewCodeTest(){
        Course course=courseService.getByNewCode ("ACCT1000");
        Assert.assertEquals ("ACCT1000",course.getNewCode ());
    }

    @Test
    public void getAllTest(){
        List<Course> courseList=courseService.getAll ();
        Assert.assertNotNull (courseList.size ());
    }

}
