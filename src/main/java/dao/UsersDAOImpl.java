package dao;

import java.util.List;
import hiber.UsersEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 * Created by Artem on 13.11.2016.
 */
@Repository
public class UsersDAOImpl implements UsersDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void addUser(UsersEntity users) {
        sessionFactory.getCurrentSession().save(users);
    }

    @SuppressWarnings("unchecked")
    public List<UsersEntity> listContact() {

        return sessionFactory.getCurrentSession().createQuery("from UsersEntity")
                .list();
    }

    public void removeUser(Integer id) {
        UsersEntity users = (UsersEntity) sessionFactory.getCurrentSession().load(
                UsersEntity.class, id);
        if (null != users) {
            sessionFactory.getCurrentSession().delete(users);
        }

    }
}
