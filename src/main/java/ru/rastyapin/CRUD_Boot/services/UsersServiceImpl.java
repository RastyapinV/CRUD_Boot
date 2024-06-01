package ru.rastyapin.CRUD_Boot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rastyapin.CRUD_Boot.DAO.UsersDAO;
import ru.rastyapin.CRUD_Boot.models.User;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService{

    private final UsersDAO usersDAO;

    @Override
    public List<User> index() {
        return usersDAO.findAll();
    }

    @Override
    public void save(User user) {
        usersDAO.save(user);
    }

    @Override
    public User getUser(long id) {
        return usersDAO.findById(id).orElse(null);
    }

    @Override
    public void update(long id, User updatedUser) {
        usersDAO.update(id, updatedUser);
    }

    @Override
    public void delete(long id) {
        usersDAO.deleteById(id);
    }
}
