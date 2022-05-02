package view;

import Enums.Commands;
import model.Hex;
import model.User;

import java.util.regex.Matcher;

public class PlayGameMenu {
    public static void run(User user){
        Hex.printMap();
        while (true) {

            Matcher matcher;
            String input = LoginMenu.scanner.nextLine();
            if((matcher = Commands.getMatcher(input,Commands.PLAY_GAME2)).find())
            {

            }
        }

    }
}
