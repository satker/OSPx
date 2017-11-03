package servis;


import hiber.HotelsEntity;

import java.util.List;


/**
 * Created by Artem on 26.11.2016.
 */
public interface HotelsService {
    void addHotel(HotelsEntity hotels);
    List<HotelsEntity> listHotels();
    void removeHotel(Integer hotelidint);
    void bookRoom(HotelsEntity hotel);

    void addToFavorite(HotelsEntity hotel);

    List<HotelsEntity> listOfFavoriteHotels();

    boolean existsInFavoriteList(HotelsEntity hotel);

    boolean existsInBookList(HotelsEntity hotel);
}
