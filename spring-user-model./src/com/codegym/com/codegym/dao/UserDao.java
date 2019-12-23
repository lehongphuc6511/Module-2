package com.codegym.com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAccount("lehongphuc6511");
        u1.setPassword("LHP28012004bi");
        u1.setName("Le Hong Phuc");
        u1.setEmail("lehongphuc6511@gmail.com");
        u1.setAge(16);
        users.add(u1);

        User u2 = new User();
        u2.setAccount("superstar28r");
        u2.setPassword("LHP28012004bi");
        u2.setName("Le Hong Phuc");
        u2.setEmail("superstar28r@gmail.com");
        u2.setAge(16);
        users.add(u2);
    }

    public static User checkLogin(Login login){
        for (User u: users) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
