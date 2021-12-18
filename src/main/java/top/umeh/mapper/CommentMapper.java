package top.umeh.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.umeh.proj.Comment;

import java.util.List;

/**
 * @author Box
 */
@Mapper
public interface CommentMapper {

    /**
     *
     * @param id
     * @return
     */
    @Select ("select * from comment where id=#{id}")
    public Comment getById (Long id);

    /**
     *
     * @param teach
     * @return
     */
    @Select ("select * from comment where teach=#{teach}")
    public List<Comment> getByTeach(Long teach);

    @Select ("select * from comment")
    public List<Comment> getAll();
}
