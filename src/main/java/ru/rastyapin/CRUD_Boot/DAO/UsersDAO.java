package ru.rastyapin.CRUD_Boot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rastyapin.CRUD_Boot.models.User;

public interface UsersDAO extends JpaRepository<User, Long> {

    default void update(Long id, User updatedUser) {
        updatedUser.setId(id);
        save(updatedUser);
    }

}
