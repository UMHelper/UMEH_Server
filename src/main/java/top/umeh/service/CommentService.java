package top.umeh.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Box
 */
@Service
public interface CommentService {
    public top.umeh.proj.Comment getById (Long id);

    public List<top.umeh.proj.Comment> getByTeach (Long teach);

}
