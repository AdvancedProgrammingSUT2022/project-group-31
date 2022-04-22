package model;

import java.util.ArrayList;

public class User {
    String username;
    String password;
    String nickname;
    int score;
    public static ArrayList<User> users = new ArrayList<>();

    public User(String username, String password, String nickname) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.score = 0;

    }




    public static User getUserByUserName(String username) {
        for (User user : users) {
            if (user.username.equals(username)) {
                return user;
            }
        }
return null;
    }

    public static User getUserByNickName(String nickname){
        for (User user: users){
            if (user.nickname.equals(nickname)){
                return user;
            }
        }
        return null;
    }

    public static User getUsernameAndPasswordByUsernameAndPassword(String username, String password){
        for (User user:users) {
            if (user.username.equals(username)&& user.password.equals(password)){
                return user;
            }
        }
        return null;
    }

    public String getUsername() {
        return this.username;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
