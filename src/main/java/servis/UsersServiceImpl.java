package servis;

import dao.UsersDao;
import hiber.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by Artem on 13.11.2016.
 */

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersDao usersDao;

    @Transactional
    public void addUser(UsersEntity users) {
        users.setRolename("ROLE_USER");
        users.setEnabled(1);
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


    @Transactional
    public void updateUserData(UsersEntity user) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();

        UsersEntity oldUserData = getUserByUsername(name);
        if (oldUserData.copyNotNullFields(user)) {
            usersDao.updateUser(oldUserData);
        } else {
            throw new RuntimeException(); // could be thrown something specific if you want
        }
    }

    @Transactional
    public UsersEntity getUserByUsername(String name) {
        return usersDao.getUserByUsername(name);
    }

}
