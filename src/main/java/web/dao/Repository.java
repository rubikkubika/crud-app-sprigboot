package web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

public interface Repository extends JpaRepository<User,Long> {
    @Transactional
    @Modifying
    @Query("update User u set u.name = ?2, u.surname = ?2 where u.id = ?1")
    void update(long id, String name, String surname);
}
