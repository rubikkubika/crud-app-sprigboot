package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.Dao;

@Service
public class UserServiceImpl implements UserService {
    private Dao dao;

    @Autowired
    public UserServiceImpl(Dao dao) {
        this.dao = dao;
    }
}
