package web.dao;

import web.model.User;
import java.util.List;


public interface Dao {
    List<User> getAllUser();

    void saveUser(User user);

    User getUserById(long id);

    void update(long id, User user);

    void deleteById(long id);
}
