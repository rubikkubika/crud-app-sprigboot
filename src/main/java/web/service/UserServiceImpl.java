package web.service;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.Dao;
import web.dao.DaoImpl;
import web.dao.Repository;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl {
    private Repository repository;

    @Autowired
    public UserServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Transactional
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @Transactional
    public void saveUser(User user) {
        repository.save(user);
    }

    @Transactional
    public User getUserById(long id) {
        return repository.getById(id);
    }

    @Transactional
    public void update(long id, String name, String surname) {
        repository.update(id, name, surname);
    }

    @Transactional
    public void deleteByID(long id) {
        repository.deleteById(id);
    }
}
