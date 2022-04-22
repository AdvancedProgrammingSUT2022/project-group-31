package view;

import Controller.UserController;
import Enums.Commands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class LoginMenu {
    public static Scanner scanner= new Scanner(System.in);

    public static void run() {
        while (true) {
            Matcher matcher;
            String input=scanner.nextLine();

            if ((matcher = Commands.getMatcher(input, Commands.USER_LOGIN)).find()) {
                UserController.logIn(matcher);
            } else if ((matcher=Commands.getMatcher(input,Commands.CREATE_USER1)).find()) {
                UserController.signIn(matcher);
            } else if ((matcher=Commands.getMatcher(input,Commands.MENU_ENTER)).find()){
                System.out.println("please login first!");
            } else if ((matcher=Commands.getMatcher(input, Commands.MENU_SHOW_CURRENT)).find()){
                System.out.println("Login Menu");

            } else if ((matcher=Commands.getMatcher(input,Commands.MENU_EXIT)).find()){
                System.exit(0);
            } else {
                System.out.println("INVALID MASSAGE");

            }
          }
       }


    }

