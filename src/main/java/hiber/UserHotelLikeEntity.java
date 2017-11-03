package hiber;

import javax.persistence.*;

/**
 * Created by Artem on 10.12.2016.
 */
@Entity
@Table(name = "user_hotel_like", schema = "public", catalog = "OSP")
@IdClass(UserHotelLikeEntityPK.class)
public class UserHotelLikeEntity {
    private int hotelidint;
    private int id;

    @Id
    @Column(name = "hotelidint", nullable = false, insertable = true, updatable = true)
    public int getHotelidint() {
        return hotelidint;
    }

    public void setHotelidint(int hotelidint) {
        this.hotelidint = hotelidint;
    }

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
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

        UserHotelLikeEntity that = (UserHotelLikeEntity) o;

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
