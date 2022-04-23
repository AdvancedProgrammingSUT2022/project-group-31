package Controller;

import model.Database;
import model.User;

import java.util.regex.Matcher;

public class UserController {
    static Database database = Database.getInstance();

    public static void logIn(Matcher matcher) {

        String username = matcher.group("username");
        String password = matcher.group("password");
        User user;
        if ((user = database.getUserByUsername(username)) != null && user.getPassword().equals(password)) {
            System.out.println("user logged in successfully!");
            //TODO login
        } else System.out.println("Username or password didn't match!");
    }

    public static void signIn(Matcher matcher) {
        String username = matcher.group("username");
        String password = matcher.group("password");
        String nickname = matcher.group("nickname");

        if (database.getUserByUsername(username) != null) {
            System.out.println("user with username " + username + " already exists");
        } else if (database.getUserByNickname(nickname) != null) {
            System.out.println("user with nickname " + nickname + " already exists");
        } else {
            User user = new User(username, password, nickname);
            System.out.println("user created successfully!");
            database.addUser(user);

        }

    }


}
