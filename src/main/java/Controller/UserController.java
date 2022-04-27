package Controller;

import model.Database;
import model.User;
import view.MainMenu;

import java.util.regex.Matcher;

public class UserController {
    static Database database = Database.getInstance();

    public static void logIn(Matcher matcher) {
        String username = matcher.group("username");
        String password = matcher.group("password");
        User user = database.getUserByUsername(username);
        if ((user != null) && (user.getPassword().equals(password))) {
            System.out.println("user logged in successfully!");
            MainMenu.run(user);
        } else System.out.println("Username or password didn't match!");
    }

    public static void signup(Matcher matcher) {
        String username = matcher.group("username");
        String password = matcher.group("password");
        String nickname = matcher.group("nickname");

        if (database.getUserByUsername(username) != null) {
            System.out.println("user with username " + username + " already exists");
        } else if (database.getUserByNickname(nickname) != null) {
            System.out.println("user with nickname " + nickname + " already exists");
        } else {
            User user = new User(username, password, nickname);
            database.addUser(user);
            System.out.println("user created successfully!");


        }

    }

    public static void changePassword(Matcher matcher, User user) {
        String newPassword = matcher.group("newPassword");
        String currentPassword = matcher.group("currentPassword");

        if (!user.getPassword().equals(currentPassword)) {
            System.out.println("current password is invalid");
        } else if (newPassword.equals(currentPassword)) {
            System.out.println("new password is equal to old password");
        } else {
            user.setPassword(newPassword);
            System.out.println("password changed successfully");
        }
    }

    public static void changeNickname(Matcher matcher, User user) {

    }
}
