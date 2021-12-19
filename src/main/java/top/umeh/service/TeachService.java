package top.umeh.service;

import org.springframework.stereotype.Service;
import top.umeh.proj.Teach;

import java.util.List;

@Service
public interface TeachService {

    public Teach getById(Long id);

    public List<Teach> getByCourse(String course);

    public List<Teach> getByProf(String prof);

    public Teach getByCourseAndProf(String course, String prof);

    public List<Teach> getAll();

    public void insert(Teach teach);

    public void update(Teach teach);

    public void delete(Teach teach);

}
