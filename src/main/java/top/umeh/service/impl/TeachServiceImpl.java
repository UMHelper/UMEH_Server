package top.umeh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.umeh.mapper.TeachMapper;
import top.umeh.proj.Teach;
import top.umeh.service.TeachService;

import java.util.List;

/**
 * @author Box
 */
public class TeachServiceImpl implements TeachService {

    @Autowired
    private TeachMapper teachMapper;

    @Override
    public Teach getById (Long id) {
        return teachMapper.getById (id);
    }

    @Override
    public List<Teach> getByCourse (String course) {
        return teachMapper.getByCourse (course);
    }

    @Override
    public List<Teach> getByProf (String prof) {
        return teachMapper.getByProf (prof);
    }

    @Override
    public Teach getByCourseAndProf (String course, String prof) {
        return teachMapper.getByCourseAndProf (course, prof);
    }

    @Override
    public List<Teach> getAll () {
        return teachMapper.getAll ();
    }

    @Override
    public void insert (Teach teach) {
        teachMapper.insert (teach);
    }

    @Override
    public void update (Teach teach) {
        teachMapper.update (teach);
    }

    @Override
    public void delete (Teach teach) {
        teachMapper.delete (teach);
    }

    @Override
    public void delete (Long id) {
        teachMapper.delete (id);
    }
}
