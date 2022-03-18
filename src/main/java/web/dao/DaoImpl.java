package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class DaoImpl implements Dao {
    @PersistenceContext
    private EntityManager entityManager;


    public List<User> getAllUser() {

        return entityManager.createQuery("SELECT a FROM User a").getResultList();
    }

    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserById(long id) {

        return (User) entityManager
                .createQuery("SELECT a FROM User a WHERE a.id=:id")
                .setParameter("id", id)
                .getResultList()
                .get(0);
    }

    @Override
    public void update(long id, User updatedUser) {
        User userById = getUserById(id);
        userById.setName(updatedUser.getName());
        userById.setSurname(updatedUser.getSurname());
    }

    @Override
    public void deleteById(long id) {
        entityManager
                .createQuery("delete from User a where a.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }
}
