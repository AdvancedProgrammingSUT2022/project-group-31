package view;

import Controller.UserController;

import javax.print.CancelablePrintJob;
import java.util.Scanner;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginMenu {
    public static Scanner scanner= new Scanner(System.in);

    public static void run() {
        while (true) {
            Matcher matcher;
            String input=scanner.nextLine();

            if ((matcher =Commands.getMatcher(input, Commands.USER_LOGIN)).find()) {
                UserController.logIn(matcher);
            } else if ((matcher=Commands.getMatcher(input,Commands.CREATE_USER1)).find()) {
                UserController.signIn(matcher);
            }else {
                System.out.println("INVALID MASSAGE");

            }
          }
       }

    }
