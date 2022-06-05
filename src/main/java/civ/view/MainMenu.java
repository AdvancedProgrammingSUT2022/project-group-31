package civ.view;

import civ.Enums.Commands;
import civ.model.User;

import java.util.regex.Matcher;

public class MainMenu {

    public static void run(User user){

        while(true){
            Matcher matcher;
            String input=LoginMenu.scanner.nextLine();

            if ((matcher= Commands.getMatcher(input,Commands.MENU_EXIT)).find()){
                LoginMenu.run();
            } else if ((matcher=Commands.getMatcher(input, Commands.MENU_SHOW_CURRENT)).find()){
                System.out.println("civ.Main Menu");
            } else if ((matcher=Commands.getMatcher(input,Commands.USER_LOGOUT)).find()){
                LoginMenu.run();
            } else if ((matcher=Commands.getMatcher(input, Commands.MENU_ENTER)).find()) {
                String menuName = matcher.group("menuName");
                menuName = menuName.toLowerCase();
                if (menuName.equals("profile menu")) {
                    ProfileMenu.run(user);
                } else if (menuName.equals("play game menu")) {
                    PlayGameMenu.run(user);
                } else {
                    System.out.println("INVALID MASSAGE");
                }
            }else {
                System.out.println("INVALID MASSAGE");
            }




        }


    }


}
