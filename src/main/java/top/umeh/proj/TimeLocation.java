package top.umeh.proj;

import lombok.Data;

import java.util.Objects;

/**
 * @author Box
 */
@Data
public class TimeLocation {
    private Integer id;
    private String data;
    private String time;
    private String location;

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getData () {
        return data;
    }

    public void setData (String data) {
        this.data = data;
    }

    public String getTime () {
        return time;
    }

    public void setTime (String time) {
        this.time = time;
    }

    public String getLocation () {
        return location;
    }

    public void setLocation (String location) {
        this.location = location;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeLocation)) {
            return false;
        }
        TimeLocation that = ( TimeLocation ) o;
        return getId ().equals (that.getId ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getId ());
    }

    @Override
    public String toString () {
        return "TimeLocation{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
