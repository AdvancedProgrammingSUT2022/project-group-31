package model;

import Enums.Types.HEX;

import java.util.ArrayList;

public class Database {
    private static Database instance = null;

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null)  instance = new Database();
        return instance;

    }

    private static ArrayList<User> users;
    private static ArrayList<HEX> map;

    public void addUser(User user) {
        users.add(user);
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (username.equals(user.username)) return user;
        }
        return null;
    }

    public User getUsernameByNickname(String nickname) {
        for (User user : users) {
            if (nickname.equals(user.username)) return user;
        }
        return null;
    }

    public User getUserByNickname(String nickname) {
        for (User user : users) {
            if (user.nickname.equals(nickname)) return user;
        }
        return null;
    }

    public void changePassword(User user, String newPassword) {
        user.setPassword(newPassword);
    }

    public void changeUsername(User user, String newUsername) {
        user.setUsername(newUsername);
    }

    public void changeNickname(User user, String newNickname) {
        user.setNickname(newNickname);
    }


}
