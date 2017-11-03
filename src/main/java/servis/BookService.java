package servis;

import hiber.UserHotelBookEntity;

import java.util.List;

/**
 * Created by Artem on 10.12.2016.
 */
public interface BookService {
    void addHotelBook(UserHotelBookEntity book);
    List<UserHotelBookEntity> listBook();
    void removeBook(Integer id);
}
