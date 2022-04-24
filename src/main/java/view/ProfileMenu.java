package view;

import Controller.UserController;
import Enums.Commands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class ProfileMenu {
    public static Scanner scanner = new Scanner(System.in);
    public void run(){
        Matcher matcher;
        String input  = scanner.nextLine();


        while (true)
        {
            if ((matcher = Commands.getMatcher(input,Commands.CHANGE_PASSWORD)).find())
            {
               // UserController.
            }
            break;
        }
    }
}
