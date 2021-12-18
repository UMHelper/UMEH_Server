package top.umeh.proj;

import lombok.Data;

import java.util.Objects;

/**
 * @author Box
 */
@Data
public class Prof {
    private String name;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Prof)) {
            return false;
        }
        Prof prof = ( Prof ) o;
        return getName ().equals (prof.getName ());
    }

    @Override
    public int hashCode () {
        return Objects.hash (getName ());
    }

    @Override
    public String toString () {
        return "Prof{" +
                "name='" + name + '\'' +
                '}';
    }
}
