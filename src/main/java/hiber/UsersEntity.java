package hiber;

import hiber.validation.annotation.PasswordMatches;
import hiber.validation.annotation.ValidEmail;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.lang.reflect.Field;
import java.sql.Date;

/**
 * Created by Artem on 13.11.2016.
 */
@Entity
@Table(name = "users")
@PasswordMatches
public class UsersEntity {
    private int id;
    @NotEmpty
    private String username;
    @ValidEmail
    private String mail;
    private Date dateOfBirth;
    private String location;
    private String discription;
    private Integer callNumber;
    @NotEmpty
    private String password;
    private Integer enabled;
    private String rolename;
    private String matchingPassword;


    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "mail", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth", nullable = true, insertable = true, updatable = true)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "location", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "discription", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Basic
    @Column(name = "call_number", nullable = true, insertable = true, updatable = true)
    public Integer getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(Integer callNumber) {
        this.callNumber = callNumber;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "enabled", nullable = false, insertable = true, updatable = true, length = 1)
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "rolename", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != that.id) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (discription != null ? !discription.equals(that.discription) : that.discription != null) return false;
        if (callNumber != null ? !callNumber.equals(that.callNumber) : that.callNumber != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
        if (rolename != null ? !rolename.equals(that.rolename) : that.rolename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (discription != null ? discription.hashCode() : 0);
        result = 31 * result + (callNumber != null ? callNumber.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (rolename != null ? rolename.hashCode() : 0);
        return result;
    }

    public boolean copyNotNullFields(UsersEntity user) {
        try {
            if (user == null) {
                return false;
            }
            for (Field field : this.getClass().getDeclaredFields()) {
                Class type = field.getType();
                Object instanceFieldOne = field.get(user);
                if (type.isPrimitive() && ((Number) instanceFieldOne).intValue() == 0
                        || (!type.isPrimitive() && instanceFieldOne == null)) {
                    continue;
                }
                field.set(this, instanceFieldOne);
            }
            return true;
        } catch (IllegalAccessException ex) {
            return false;
        }
    }
}
