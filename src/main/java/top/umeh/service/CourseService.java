package top.umeh.service;

import org.springframework.stereotype.Service;
import top.umeh.proj.Course;

import java.util.List;

@Service
public interface CourseService {

    public Course getByNewCode(String newCode);

    public List<Course> getAll();

    public void insert(Course course);

    public void update(Course course);

    public void  delete(String  newCode);

    public void  delete(Course course);
}
