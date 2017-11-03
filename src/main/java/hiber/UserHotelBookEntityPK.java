package hiber;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Artem on 10.12.2016.
 */
public class UserHotelBookEntityPK implements Serializable {
    private int hotelidint;
    private int id;

    @Column(name = "hotelidint", nullable = false, insertable = true, updatable = true)
    @Id
    public int getHotelidint() {
        return hotelidint;
    }

    public void setHotelidint(int hotelidint) {
        this.hotelidint = hotelidint;
    }

    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHotelBookEntityPK that = (UserHotelBookEntityPK) o;

        if (hotelidint != that.hotelidint) return false;
        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hotelidint;
        result = 31 * result + id;
        return result;
    }
}
