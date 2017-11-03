package dao;

import hiber.UserHotelBookEntity;

import java.util.List;

/**
 * Created by Artem on 10.12.2016.
 */
public interface HotelBookDao {
    public void addHotelBook(UserHotelBookEntity book);

    public List<UserHotelBookEntity> listBook();

    public void removeBook(Integer id);

}
