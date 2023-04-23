package com.example.usertest2.Dao;

import com.example.usertest2.User;

import java.util.List;

public interface UserDao {


 //   void add();

    User getUserByName(String name);

    List<User> findAllUsers();


}
