package dao;
import hiber.HotelsEntity;
import hiber.UsersEntity;

import java.util.List;
/**
 * Created by Artem on 26.11.2016.
 */
public interface HotelsDao {
    void addHotel(HotelsEntity hotels);

    List<HotelsEntity> listHotels();

    void removeHotel(Integer hotelidint);

    HotelsEntity getHotel(int hotelidint);

    void update(HotelsEntity hotel);

    List<HotelsEntity> listOfFavoriteHotels(UsersEntity user);

    List<HotelsEntity> listOfBookedHotels(UsersEntity user);
}
