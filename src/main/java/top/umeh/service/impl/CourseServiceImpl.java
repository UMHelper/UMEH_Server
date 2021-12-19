package top.umeh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.umeh.mapper.CourseMapper;
import top.umeh.proj.Course;
import top.umeh.service.CourseService;

import java.util.List;

/**
 * @author Box
 */
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public Course getByNewCode (String newCode) {
        return courseMapper.getByNewCode (newCode);
    }

    @Override
    public List<Course> getAll () {
        return courseMapper.getAll ();
    }

    @Override
    public void insert (Course course) {
        courseMapper.insert (course);
    }

    @Override
    public void update (Course course) {
        courseMapper.update (course);
    }


    @Override
    public void delete (Course course) {
        courseMapper.delete (course);
    }
}
