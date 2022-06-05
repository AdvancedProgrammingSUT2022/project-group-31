package civ.view;

import civ.Controller.UserController;
import civ.Enums.Commands;
import civ.model.User;

import java.util.regex.Matcher;

public class ProfileMenu {
    public static void run(User user){
        while (true){
            Matcher matcher;
            String input=LoginMenu.scanner.nextLine();
            if ((matcher= Commands.getMatcher(input,Commands.CHANGE_NICKNAME)).find()){
                UserController.changeNickname(matcher,user);
            }else if ((matcher=Commands.getMatcher(input, Commands.CHANGE_PASSWORD)).find()){
                UserController.changePassword(matcher, user);
            }else if ((matcher=Commands.getMatcher(input,Commands.MENU_EXIT)).find()){
                MainMenu.run(user);
            }else if ((matcher=Commands.getMatcher(input, Commands.MENU_SHOW_CURRENT)).find()){
                System.out.println("profile Menu");
            }else{
                System.out.println("INVALID MASSAGE");
            }

            

        }

    }
}
