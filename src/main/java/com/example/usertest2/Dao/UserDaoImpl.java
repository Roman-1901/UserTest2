package com.example.usertest2.Dao;
import com.example.usertest2.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{


    private final List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        users.add(new User("Вася"));
        users.add(new User("Дима"));
        users.add(new User("Ира"));
        users.add(new User("Женя"));
        users.add(new User("Саша"));
    }


    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return new User(name);
            }
        }
        return null;
    }


    @Override
    public List<User> findAllUsers() {
        return users;
    }

}
