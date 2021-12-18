package top.umeh.proj;

import lombok.Data;

import java.util.Date;
import java.util.Objects;

/**
 * @author Box
 */
@Data
public class Comment {
    private Long id;
    private String content;
    private double attendance;
    private double pre;
    private double grade;
    private double hard;
    private double reward;
    private double recommend;
    private double assignment;
    private double result;
    private Date pubTime;
    private Integer upvote;
    private Integer downvote;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getContent () {
        return content;
    }

    public void setContent (String content) {
        this.content = content;
    }

    public double getAttendance () {
        return attendance;
    }

    public void setAttendance (double attendance) {
        this.attendance = attendance;
    }

    public double getPre () {
        return pre;
    }

    public void setPre (double pre) {
        this.pre = pre;
    }

    public double getGrade () {
        return grade;
    }

    public void setGrade (double grade) {
        this.grade = grade;
    }

    public double getHard () {
        return hard;
    }

    public void setHard (double hard) {
        this.hard = hard;
    }

    public double getReward () {
        return reward;
    }

    public void setReward (double reward) {
        this.reward = reward;
    }

    public double getRecommend () {
        return recommend;
    }

    public void setRecommend (double recommend) {
        this.recommend = recommend;
    }

    public double getAssignment () {
        return assignment;
    }

    public void setAssignment (double assignment) {
        this.assignment = assignment;
    }

    public double getResult () {
        return result;
    }

    public void setResult (double result) {
        this.result = result;
    }

    public Date getPubTime () {
        return pubTime;
    }

    public void setPubTime (Date pubTime) {
        this.pubTime = pubTime;
    }

    public Integer getUpvote () {
        return upvote;
    }

    public void setUpvote (Integer upvote) {
        this.upvote = upvote;
    }

    public Integer getDownvote () {
        return downvote;
    }

    public void setDownvote (Integer downvote) {
        this.downvote = downvote;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Comment)) {
            return false;
        }
        Comment that = ( Comment ) o;
        return getId ().equals (that.getId ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getId ());
    }

    @Override
    public String toString () {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", attendance=" + attendance +
                ", pre=" + pre +
                ", grade=" + grade +
                ", hard=" + hard +
                ", reward=" + reward +
                ", recommend=" + recommend +
                ", assignment=" + assignment +
                ", result=" + result +
                ", pubTime=" + pubTime +
                ", upvote=" + upvote +
                ", downvote=" + downvote +
                '}';
    }
}
