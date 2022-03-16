package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.security.PublicKey;
import java.util.List;

@Repository
public class DaoImpl implements Dao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUser() {
        return entityManager.createQuery("SELECT a FROM User a").getResultList();
    }
    public void saveUser(User user){
        entityManager.persist(user);
    }
}
