package servis;

import dao.HotelsDao;
import hiber.HotelsEntity;
import hiber.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Artem on 26.11.2016.
 */
@Service
public class HotelsServiceImpl implements HotelsService {

    @Autowired
    private HotelsDao hotelsDao;

    @Autowired
    private UsersService usersService;

    @Transactional
    public void addHotel(HotelsEntity hotels) {
        hotelsDao.addHotel(hotels);
    }

    @Transactional
    public List<HotelsEntity> listHotels() {

        return hotelsDao.listHotels();
    }

    @Transactional
    public void removeHotel(Integer hotelidint) {
        hotelsDao.removeHotel(hotelidint);
    }

    @Transactional
    public void bookRoom(HotelsEntity hotel) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        UsersEntity user = usersService.getUserByUsername(name);
        hotel = hotelsDao.getHotel(hotel.getHotelidint());
        hotel.getUsersBooked().add(user);
        hotel.setNumberofrooms(hotel.getNumberofrooms() - 1);
        hotelsDao.update(hotel);
    }

    @Transactional
    public void addToFavorite(HotelsEntity hotel) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        UsersEntity user = usersService.getUserByUsername(name);
        hotel = hotelsDao.getHotel(hotel.getHotelidint());

        hotel.getUsersLiked().add(user);
        hotelsDao.update(hotel);
    }

    @Transactional
    public List<HotelsEntity> listOfFavoriteHotels() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        UsersEntity user = usersService.getUserByUsername(name);

        return hotelsDao.listOfFavoriteHotels(user);

    }

    @Transactional
    public boolean existsInFavoriteList(HotelsEntity hotel) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        UsersEntity user = usersService.getUserByUsername(name);
        return hotelsDao.listOfFavoriteHotels(user).stream()
                .mapToInt(HotelsEntity::getHotelidint)
                .anyMatch(o -> o == hotel.getHotelidint());
    }

    @Transactional
    public boolean existsInBookList(HotelsEntity hotel) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        UsersEntity user = usersService.getUserByUsername(name);
        return hotelsDao.listOfBookedHotels(user).stream()
                .mapToInt(HotelsEntity::getHotelidint)
                .anyMatch(o -> o == hotel.getHotelidint());
    }
}
