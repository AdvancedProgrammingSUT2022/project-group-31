package Controller;

import model.User;

import java.util.regex.Matcher;

public class UserController {
    static Database database = Database.getInstance();

    public static void logIn(Matcher matcher){
        String username=matcher.group("username");
        String password= matcher.group("password");

        if (User.getUserByUserName(username)!=null && User.getUsernameAndPasswordByUsernameAndPassword(username,password)!=null){
            System.out.println("user logged in successfully!");
            MainMenu.run(User.getUserByUserName(username));
        }else
            System.out.println("Username or password didn't match!");
    }

    public static void signIn(Matcher matcher){
        String username=matcher.group("username");
        String password=matcher.group("password");
        String nickname= matcher.group("nickname");

        if (User.getUserByUserName(username)!=null){
          System.out.println("user with username "+username+" already exists");
      }else if (User.getUserByNickName(nickname)!=null){
            System.out.println("user with nickname "+nickname+" already exists");
        }else {
            User user=new User(username,password,nickname);
            System.out.println("user created successfully!");
            database.

        }

    }

    public static void changePassword(Matcher matcher, User user){
        String newPassword=matcher.group("newPassword");
        String currentPassword=matcher.group("currentPassword");
        if (User.getUsernameAndPasswordByUsernameAndPassword(user.getUsername(),currentPassword)==null){
            System.out.println("current password is invalid");
        }
        else if (newPassword.equals(currentPassword)){
            System.out.println("please enter a new password");
        }else{
            user.setPassword(currentPassword);
            System.out.println("password changed successfully");
        }
}
