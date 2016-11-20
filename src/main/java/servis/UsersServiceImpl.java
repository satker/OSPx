package servis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UsersDao;
import hiber.UsersEntity;


/**
 * Created by Artem on 13.11.2016.
 */

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersDao usersDao;

    @Transactional
    public void addUser(UsersEntity users) {
        usersDao.addUser(users);
    }

    @Transactional
    public List<UsersEntity> listContact() {

        return usersDao.listContact();
    }

    @Transactional
    public void removeUser(Integer id) {
        usersDao.removeUser(id);
    }
}
