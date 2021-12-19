package top.umeh.service;

import org.springframework.stereotype.Service;
import top.umeh.proj.Comment;

import java.util.List;

/**
 * @author Box
 */
@Service
public interface CommentService {
    public Comment getById (Long id);

    public List<Comment> getByTeach (Long teach);

    public void insert(Comment comment);

    public void update(Comment comment);

    public void delete(Comment comment);

    public void delete(Long id);
}
