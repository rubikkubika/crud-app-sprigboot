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

public class UserServiceImpl implements UserService {
    private DaoImpl daoImpl;

    @Autowired
    public UserServiceImpl(DaoImpl daoImpl) {
        this.daoImpl = daoImpl;
    }

    public List<User> getAllUser() {
        return daoImpl.getAllUser();
    }
@Transactional
    public void saveUser(User user) {
        daoImpl.saveUser(user);
    }
}
