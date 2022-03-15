package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.Dao;

@Service
public class UserService {
    private Dao dao;

    @Autowired
    public UserService(Dao dao) {
        this.dao = dao;
    }
/*
    public List<User> getAll() {
        User art = new User("artem","retsko");

        return dao.findAll();
    }

 */
}
