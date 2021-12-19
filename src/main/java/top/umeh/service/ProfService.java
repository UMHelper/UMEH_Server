package top.umeh.service;

import org.springframework.stereotype.Service;
import top.umeh.proj.Prof;

import java.util.List;

/**
 * @author Box
 */
@Service
public interface ProfService {
    public Prof getByName(String name);

    public List<Prof> getAll();

    public void insert(Prof prof);

    public void delete(Prof prof);
    
}
