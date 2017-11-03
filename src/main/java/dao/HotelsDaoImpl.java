package dao;

import hiber.HotelsEntity;
import hiber.UsersEntity;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Created by Artem on 26.11.2016.
 */
@Repository
public class HotelsDaoImpl implements HotelsDao{

    @Autowired
    private SessionFactory sessionFactory;



    public void addHotel(HotelsEntity hotels) {

        sessionFactory.getCurrentSession().save(hotels);
    }

    @SuppressWarnings("unchecked")
    public List<HotelsEntity> listHotels() {

        return sessionFactory.getCurrentSession().createQuery("from HotelsEntity order by lowrate")
                .list();

    }

    public void removeHotel(Integer hotelidint) {
        HotelsEntity hotels = (HotelsEntity) sessionFactory.getCurrentSession().load(
                HotelsEntity.class, hotelidint);
        if (null != hotels) {
            sessionFactory.getCurrentSession().delete(hotels);
        }

    }

    public HotelsEntity getHotel(int hotelidint) {
        return  (HotelsEntity) sessionFactory.getCurrentSession().get(
                HotelsEntity.class, hotelidint);
    }

    public void update(HotelsEntity hotel) {
        sessionFactory.getCurrentSession().update(hotel);
    }

    public List<HotelsEntity> listOfFavoriteHotels(UsersEntity user) {
        Criteria query = sessionFactory.getCurrentSession().createCriteria(HotelsEntity.class);
        query.createAlias("usersLiked","usr");
        query.add(Restrictions.eq("usr.id", user.getId()));
        return query.list();
    }

    @Override
    public List<HotelsEntity> listOfBookedHotels(UsersEntity user) {
        Criteria query = sessionFactory.getCurrentSession().createCriteria(HotelsEntity.class);
        query.createAlias("usersBooked","usr");
        query.add(Restrictions.eq("usr.id", user.getId()));
        return query.list();
    }
}
