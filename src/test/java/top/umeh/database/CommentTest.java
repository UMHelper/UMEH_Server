package top.umeh.database;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.umeh.proj.Comment;
import top.umeh.service.CommentService;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class CommentTest {

    @Autowired
    CommentService commentService;

    @Test
    public void insertTest(){
        Comment comment=new Comment ();
        comment.setContent ("Test");
        comment.setAssignment (1);
        comment.setAttendance (2);
        comment.setDownvote (1);
        comment.setGrade (3);
        comment.setHard (3);
        comment.setPubTime (new Date());
        comment.setRecommend (3);
        comment.setReward (3);
        comment.setUpvote (10);
        comment.setPre (2);
        comment.setResult ();
        comment.setTeach (0L);
        commentService.insert (comment);
    }

    @Test
    public void getByIdTest(){
        Comment comment=commentService.getById (2L);
        Assert.assertEquals (0L,(long) comment.getTeach ());
    }

    @Test
    public void getByTeachTest(){
        List<Comment> commentList=commentService.getByTeach (0L);
        System.out.println (commentList);
        Assert.assertNotNull (commentList.size ());
    }
}
