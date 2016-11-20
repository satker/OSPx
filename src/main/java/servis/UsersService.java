package servis;

import java.util.List;
import hiber.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Artem on 13.11.2016.
 */
public interface UsersService {
    public void addUser(UsersEntity users);
    public List<UsersEntity> listContact();
    public void removeUser(Integer id);
}
