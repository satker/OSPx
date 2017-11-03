package servis;

import dao.HotelBookDao;
import hiber.UserHotelBookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Artem on 10.12.2016.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private HotelBookDao hotelbookDao;

    @Transactional
    public void addHotelBook(UserHotelBookEntity book) {
        hotelbookDao.addHotelBook(book);
    }
    @Transactional
    public List<UserHotelBookEntity> listBook() {

        return hotelbookDao.listBook();
    }
    @Transactional
    public void removeBook(Integer id) {
        hotelbookDao.removeBook(id);
    }
}
