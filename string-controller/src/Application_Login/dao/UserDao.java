package Application_Login.dao;

import Application_Login.Model.Login;
import Application_Login.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static List<User> user;
    static {
     user = new ArrayList<>();
     User u1 = new User();
     u1.setAccount("lehongphuc6511");
     u1.setPassword("LHP28012004bi");
     u1.setName("Le Hong Phuc");
     u1.setEmail("lehongphuc6511@gmail.com");
     u1.setAge(16);
     user.add(u1);

    }
    public static User checkLogin(Login login){
        for (User u: user) {
            if(u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
