package top.umeh.proj;

import lombok.Data;

import java.util.Objects;

/**
 * @author Box
 */
@Data
public class Schedule {
    private Integer id;
    private Integer teach;
    private Integer timeLocation;

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public Integer getTeach () {
        return teach;
    }

    public void setTeach (Integer teach) {
        this.teach = teach;
    }

    public Integer getTimeLocation () {
        return timeLocation;
    }

    public void setTimeLocation (Integer timeLocation) {
        this.timeLocation = timeLocation;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Schedule)) {
            return false;
        }
        Schedule that = ( Schedule ) o;
        return getId ().equals (that.getId ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getId ());
    }

    @Override
    public String toString () {
        return "Schedule{" +
                "id=" + id +
                ", teach=" + teach +
                ", timeLocation=" + timeLocation +
                '}';
    }
}
