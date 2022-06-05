package civ.view;

import civ.Enums.Commands;
import civ.model.User;

import java.util.regex.Matcher;

public class PlayGameMenu {
    public static void run(User user) {

        while (true) {

            Matcher matcher;
            String input = LoginMenu.scanner.nextLine();
            if ((matcher = Commands.getMatcher(input, Commands.PLAY_GAME2)).find()) {

            }
        }

    }
}
