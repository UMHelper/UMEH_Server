package top.umeh.mapper;

import org.apache.ibatis.annotations.*;
import top.umeh.proj.Comment;

import java.util.List;

/**
 * @author Box
 */
@Mapper
public interface CommentMapper {


    @Select ("select * from comment where id=#{id}")
    public Comment getById (Long id);

    @Select ("select * from comment where teach=#{teach}")
    public List<Comment> getByTeach(Long teach);

    @Select ("select * from comment")
    public List<Comment> getAll();

    @Insert ("insert into comment(content, attendance, pre, grade, hard, reward, recommend, assignment, result, pub_time, teach, upvote, downvote) " +
            "values (#{content}, #{attendance}, #{pre}, #{grade}, #{hard}, #{reward}, #{recommend}, #{assignment}, #{result}, #{pubTime}, #{teach}, #{upvote}, #{downvote})")
    public void insert(Comment comment);

    @Update ("update comment set content=#{content}, attendance=#{assignment}, pre=#{pre}, grade=#{grade}, hard=#{hard}, " +
            "reward=#{reward}, recommend=#{recommend}, assignment=#{assignment}, result=#{result}, pub_time=#{pubTime}, teach=#{teach}, upvote=#{upvote}, downvote=#{downvote} " +
            "where id=#{id}")
    public void update(Comment comment);

    @Delete ("delete from comment where id=#{id}")
    public void delete(Comment comment);
}
