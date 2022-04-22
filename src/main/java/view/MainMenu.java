package view;

import Enums.Commands;
import model.User;

import java.net.CookieManager;
import java.util.Locale;
import java.util.regex.Matcher;

public class MainMenu {

    public static void run(User user){

        while(true){
            Matcher matcher;
            String input=LoginMenu.scanner.nextLine();

            if ((matcher= Commands.getMatcher(input,Commands.MENU_EXIT)).find()){
                LoginMenu.run();
            } else if ((matcher=Commands.getMatcher(input, Commands.MENU_SHOW_CURRENT)).find()){
                System.out.println("Main Menu");
            } else if ((matcher=Commands.getMatcher(input,Commands.USER_LOGOUT)).find()){
                LoginMenu.run();
            } else if ((matcher=Commands.getMatcher(input, Commands.MENU_ENTER)).find()) {
                String menuName = matcher.group("menuName");
                menuName = menuName.toLowerCase();
                if (menuName.equals("profilemenu")) {
                    ProfileMenu.run(user);
                } else if (menuName.equals("playgamemenu")) {
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
