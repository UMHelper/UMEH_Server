package top.umeh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.umeh.mapper.CommentMapper;
import top.umeh.proj.Comment;
import top.umeh.service.CommentService;

import java.util.List;

/**
 * @author Box
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public Comment getById (Long id) {
        return commentMapper.getById (id);
    }

    @Override
    public List<Comment> getByTeach (Long teach) {
        return commentMapper.getByTeach (teach);
    }

    @Override
    public void insert (Comment comment) {
        commentMapper.insert (comment);
    }

    @Override
    public void update (Comment comment) {
        commentMapper.update (comment);
    }

    @Override
    public void delete (Comment comment) {
        commentMapper.delete (comment);
    }


}
