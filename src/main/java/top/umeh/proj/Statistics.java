package top.umeh.proj;

import lombok.Data;

import java.util.Objects;

/**
 * @author Box
 */
@Data
public class Statistics {
    private String name;
    private Integer course;
    private Integer comment;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Integer getCourse () {
        return course;
    }

    public void setCourse (Integer course) {
        this.course = course;
    }

    public Integer getComment () {
        return comment;
    }

    public void setComment (Integer comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Statistics)) {
            return false;
        }
        Statistics that = ( Statistics ) o;
        return getName ().equals (that.getName ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getName ());
    }

    @Override
    public String toString () {
        return "Statistics{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", comment=" + comment +
                '}';
    }
}
