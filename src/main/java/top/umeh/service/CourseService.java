package top.umeh.service;

import org.springframework.stereotype.Service;
import top.umeh.proj.Course;

import java.util.List;

@Service
public interface CourseService {

    public Course getByNewCode(String newCode);

    public List<Course> getAll();
}
