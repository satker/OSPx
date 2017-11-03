package dao;

import hiber.UserHotelBookEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Artem on 10.12.2016.
 */
@Repository
public class HotelBookDaoImpl implements HotelBookDao{
    @Autowired
    private SessionFactory sessionFactory;



    public void addHotelBook(UserHotelBookEntity book) {

        sessionFactory.getCurrentSession().save(book);
    }

    @SuppressWarnings("unchecked")
    public List<UserHotelBookEntity> listBook() {

        return sessionFactory.getCurrentSession().createQuery("from UserHotelBookEntity")
                .list();

    }

    public void removeBook(Integer id) {
        UserHotelBookEntity book = (UserHotelBookEntity) sessionFactory.getCurrentSession().load(
                UserHotelBookEntity.class, id);
        if (null != book) {
            sessionFactory.getCurrentSession().delete(book);
        }

    }
}
