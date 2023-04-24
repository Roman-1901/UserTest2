package com.example.usertest2.Dao;
import com.example.usertest2.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDaoTest {
    private final UserDaoImpl userDao = new UserDaoImpl();


    public static String name = "Ира";
    User user = new User(name);


    @Test
    void showUser() {
        Assertions.assertNotNull(userDao.getUserByName(name));
        Assertions.assertEquals(user, userDao.getUserByName(name));
    }

    @Test
    public void showUserNUll() {
        name = "Петр";
        Assertions.assertNull(userDao.getUserByName(name));
        Assertions.assertEquals(null, userDao.getUserByName(name));
    }


}