package top.umeh.proj;

import lombok.Data;

import java.util.Objects;

/**
 * @author Box
 */
@Data
public class Teach {
    private Integer id;
    private String course;
    private String prof;
    private double result;
    private double comments;
    private double attendance;
    private double grade;
    private double hard;
    private double reward;

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getCourse () {
        return course;
    }

    public void setCourse (String course) {
        this.course = course;
    }

    public String getProf () {
        return prof;
    }

    public void setProf (String prof) {
        this.prof = prof;
    }

    public double getResult () {
        return result;
    }

    public void setResult (double result) {
        this.result = result;
    }

    public double getComments () {
        return comments;
    }

    public void setComments (double comments) {
        this.comments = comments;
    }

    public double getAttendance () {
        return attendance;
    }

    public void setAttendance (double attendance) {
        this.attendance = attendance;
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

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Teach)) {
            return false;
        }
        Teach teach = ( Teach ) o;
        return getId ().equals (teach.getId ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getId ());
    }

    @Override
    public String toString () {
        return "Teach{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", prof='" + prof + '\'' +
                ", result=" + result +
                ", comments=" + comments +
                ", attendance=" + attendance +
                ", grade=" + grade +
                ", hard=" + hard +
                ", reward=" + reward +
                '}';
    }
}
