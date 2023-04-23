package com.example.usertest2.Service;

import com.example.usertest2.Dao.UserDaoImpl;
import com.example.usertest2.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }


    public boolean checkUserExist(User name) {
        return userDao.getUserByName(name.getName()) != null;
    }
}

