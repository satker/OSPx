package dao;

import java.util.List;
import hiber.UsersEntity;

/**
 * Created by Artem on 13.11.2016.
 */
public interface UsersDao {
    public void addUser(UsersEntity users);

    public List<UsersEntity> listContact();

    public void removeUser(Integer id);
}
