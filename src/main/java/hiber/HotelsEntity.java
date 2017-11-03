package hiber;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;
import java.util.Set;

/**
 * Created by Artem on 13.11.2016.
 */
@Entity
@Table(name = "hotels")
public class HotelsEntity {
    private int hotelidint;
    private String name;
    private String address;
    private String city;
    private String country;
    private Float lowrate;
    private Float highrate;
    private String propertytype;
    private Integer numberofrooms;
    private String propertydescription;
    private Set<UsersEntity> usersLiked;
    private Set<UsersEntity> usersBooked;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role_like", joinColumns = {
            @JoinColumn(name = "hotelidint", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "id",
                    nullable = false, updatable = false) })
    public Set<UsersEntity> getUsersLiked() {
        return usersLiked;
    }

    public void setUsersBooked(Set<UsersEntity> users) {
        this.usersBooked = users;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role_book", joinColumns = {
            @JoinColumn(name = "hotelidint", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "id",
                    nullable = false, updatable = false) })
    public Set<UsersEntity> getUsersBooked() {
        return usersBooked;
    }

    public void setUsersLiked(Set<UsersEntity> users) {
        this.usersLiked = users;
    }

    @Id
    @Column(name = "hotelidint", nullable = false, insertable = true, updatable = true)
    public int getHotelidint() {
        return hotelidint;
    }

    public void setHotelidint(int hotelidint) {
        this.hotelidint = hotelidint;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Basic
    @Column(name = "address", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "city", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Basic
    @Column(name = "country", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Basic
    @Column(name = "lowrate", nullable = true, insertable = true, updatable = true, precision = 8)
    public Float getLowrate() {
        return lowrate;
    }

    public void setLowrate(Float lowrate) {
        this.lowrate = lowrate;
    }

    @Basic
    @Column(name = "highrate", nullable = true, insertable = true, updatable = true, precision = 8)
    public Float getHighrate() {
        return highrate;
    }

    public void setHighrate(Float highrate) {
        this.highrate = highrate;
    }


    @Basic
    @Column(name = "propertytype", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getPropertytype() {
        return propertytype;
    }

    public void setPropertytype(String propertytype) {
        this.propertytype = propertytype;
    }


    @Basic
    @Column(name = "numberofrooms", nullable = true, insertable = true, updatable = true)
    public Integer getNumberofrooms() {
        return numberofrooms;
    }

    public void setNumberofrooms(Integer numberofrooms) {
        this.numberofrooms = numberofrooms;
    }


    @Basic
    @Column(name = "propertydescription", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getPropertydescription() {
        return propertydescription;
    }

    public void setPropertydescription(String propertydescription) {
        this.propertydescription = propertydescription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelsEntity that = (HotelsEntity) o;

        if (hotelidint != that.hotelidint) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (lowrate != null ? !lowrate.equals(that.lowrate) : that.lowrate != null) return false;
        if (highrate != null ? !highrate.equals(that.highrate) : that.highrate != null) return false;
        if (propertytype != null ? !propertytype.equals(that.propertytype) : that.propertytype != null) return false;
        if (propertydescription != null ? !propertydescription.equals(that.propertydescription) : that.propertydescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hotelidint;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (lowrate != null ? lowrate.hashCode() : 0);
        result = 31 * result + (highrate != null ? highrate.hashCode() : 0);
        result = 31 * result + (propertytype != null ? propertytype.hashCode() : 0);
        result = 31 * result + (numberofrooms != null ? numberofrooms.hashCode() : 0);
        result = 31 * result + (propertydescription != null ? propertydescription.hashCode() : 0);
        return result;
    }
}
