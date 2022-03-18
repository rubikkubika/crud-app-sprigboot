package web.service;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.Dao;
import web.dao.DaoImpl;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl {
    private DaoImpl daoImpl;

    @Autowired
    public UserServiceImpl(DaoImpl daoImpl) {
        this.daoImpl = daoImpl;
    }

    @Transactional
    public List<User> getAllUser() {
        return daoImpl.getAllUser();
    }

    @Transactional
    public void saveUser(User user) {
        daoImpl.saveUser(user);
    }

    @Transactional
    public User getUserById(long id) {
        return daoImpl.getUserById(id);
    }

    @Transactional
    public void update(long id, User user) {
        daoImpl.update(id, user);
    }

    @Transactional
    public void deleteByID(long id) {
        daoImpl.deleteById(id);
    }
}
