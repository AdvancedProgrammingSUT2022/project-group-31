package view;

import Controller.UserController;
import Enums.Commands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class LoginMenu {
    public static Scanner scanner = new Scanner(System.in);

    public static void run() {
        while (true) {
            Matcher matcher;
            String input = scanner.nextLine();

            if ((matcher = Commands.getMatcher(input, Commands.USER_LOGIN1)).find()) {
                UserController.logIn(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.USER_LOGIN2)).find()) {
                UserController.logIn(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.USER_LOGIN3)).find()) {
                UserController.logIn(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.USER_LOGIN4)).find()) {
                UserController.logIn(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER1)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER2)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER3)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER4)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER5)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER6)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER7)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER8)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER9)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER10)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER11)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.CREATE_USER12)).find()) {
                UserController.signup(matcher);
            } else if ((matcher = Commands.getMatcher(input, Commands.MENU_ENTER)).find()) {
                System.out.println("please login first!");
            } else if ((matcher = Commands.getMatcher(input, Commands.MENU_SHOW_CURRENT)).find()) {
                System.out.println("Login Menu");

            } else if ((matcher = Commands.getMatcher(input, Commands.MENU_EXIT)).find()) {
                System.exit(0);
            } else {
                System.out.println("INVALID MASSAGE");
            }
        }
    }
}

