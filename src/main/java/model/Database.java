package model;

import Enums.HEX;

import java.util.ArrayList;

public class Database {
    private  static  Database instance = null;
    private  Database(){}
    public static Database getInstance(){
        if(instance == null)
            instance = new Database();
        return instance;

    }
    ArrayList<User> users;
    ArrayList<HEX> map;

    void addUser(User user) {
        users.add(user);
    }

    User getUserByUsername(String username)
    {
        for (User user : users) {
            if (username.equals(user.username))
                return user;
        }
        return null;
    }
    User getUsernameByNickname (String nickname )
    {
        for (User user : users) {
            if (nickname.equals(user.username))
                return user;
        }
        return  null;
    }

}
