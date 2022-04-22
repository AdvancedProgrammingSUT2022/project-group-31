package Controller;

import model.User;
import view.MainMenu;

import java.util.regex.Matcher;

public class UserController {

    public static void logIn(Matcher matcher){
        String username=matcher.group("username");
        String password= matcher.group("password");

        if (User.getUserByUserName(username)!=null && User.getUsernameAndPasswordByUsernameAndPassword(username,password)!=null){
            System.out.println("user logged in successfully!");
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
            User.users.add(user);
            MainMenu.run();


        }

    }


}
