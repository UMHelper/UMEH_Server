package top.umeh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.umeh.mapper.ProfMapper;
import top.umeh.proj.Prof;
import top.umeh.service.ProfService;

import java.util.List;

/**
 * @author Box
 */
@Service
public class ProfServiceImpl implements ProfService {

    @Autowired
    private ProfMapper profMapper;
    @Override
    public Prof getByName (String name) {
        return profMapper.getByName (name);
    }

    @Override
    public List<Prof> getAll () {
        return profMapper.getAll ();
    }

    @Override
    public void insert (Prof prof) {
        profMapper.insert (prof);
    }

    @Override
    public void delete (Prof prof) {
        profMapper.delete (prof);
    }

    @Override
    public void delete (String name) {
        profMapper.delete (name);
    }
}
