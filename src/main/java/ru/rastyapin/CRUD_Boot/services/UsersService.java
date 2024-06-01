package ru.rastyapin.CRUD_Boot.services;

import ru.rastyapin.CRUD_Boot.models.User;

import java.util.List;

public interface UsersService {

    List<User> index();

    void save(User user);

    User getUser(long id);

    void update(long id, User updatedUser);

    void delete(long id);

}
