package civ.Enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Commands {
    MENU_ENTER("menu enter (?<menuName>[a-zA-Z]+)"),
    MENU_EXIT("menu exit"),
    MENU_SHOW_CURRENT("menu show-current"),

    CREATE_USER1("user create --nickname (?<nickname>[a-zA-Z]+) --username (?<username>[a-zA-Z]+) --password (?<password>[a-zA-Z]+)"),
    CREATE_USER2("user create --nickname (?<nickname>[a-zA-Z]+) --password (?<password>[a-zA-Z]+) --username (?<username>[a-zA-Z]+)"),
    CREATE_USER3("user create --username (?<username>[a-zA-Z]+) --password (?<password>[a-zA-Z]+) --nickname (?<nickname>[a-zA-Z]+)"),
    CREATE_USER4("user create --username (?<username>[a-zA-Z]+) --nickname (?<nickname>[a-zA-Z]+) --password (?<password>[a-zA-Z]+)"),
    CREATE_USER5("user create --password (?<password>[a-zA-Z]+) --username (?<username>[a-zA-Z]+) --nickname (?<nickname>[a-zA-Z]+)"),
    CREATE_USER6("user create --password (?<password>[a-zA-Z]+) --nickname (?<nickname>[a-zA-Z]+) --username (?<username>[a-zA-Z]+)"),
    CREATE_USER7("user create -n (?<nickname>[a-zA-Z]+) -u (?<username>[a-zA-Z]+) -p (?<password>[a-zA-Z]+)"),
    CREATE_USER8("user create -n (?<nickname>[a-zA-Z]+) -p (?<password>[a-zA-Z]+) -u (?<username>[a-zA-Z]+)"),
    CREATE_USER9("user create -u (?<username>[a-zA-Z]+) -p (?<password>[a-zA-Z]+) -n (?<nickname>[a-zA-Z]+)"),
    CREATE_USER10("user create -u (?<username>[a-zA-Z]+) -n (?<nickname>[a-zA-Z]+) -p (?<password>[a-zA-Z]+)"),
    CREATE_USER11("user create -p (?<password>[a-zA-Z]+) -u (?<username>[a-zA-Z]+) -n (?<nickname>[a-zA-Z]+)"),
    CREATE_USER12("user create -p (?<password>[a-zA-Z]+) -n (?<nickname>[a-zA-Z]+) -u (?<username>[a-zA-Z]+)"),

    USER_LOGIN1("user login --username (?<username>[a-zA-Z]+) --password (?<password>[a-zA-Z]+)"),
    USER_LOGIN2("user login --password (?<password>[a-zA-Z]+) --username (?<username>[a-zA-Z]+)"),
    USER_LOGIN3("user login -p (?<password>[a-zA-Z]+) -u (?<username>[a-zA-Z]+)"),
    USER_LOGIN4("user login -u (?<username>[a-zA-Z]+) -p (?<password>[a-zA-Z]+)"),

    USER_LOGOUT("user logout"),

    PLAY_GAME2("play game --player1 (?<P1Username>[a-zA-Z]+) --player2 (?<P2Username>[a-zA-Z]+)"),
    PLAT_GAME3("play game --player1 (?<P1Username>[a-zA-Z]+) --player2 (?<P2Username>[a-zA-Z]+) --player3 (?<P3Username>[a-zA-Z]+)"),
    PLAT_GAME4("play game --player1 (?<P1Username>[a-zA-Z]+) --player2 (?<P2Username>[a-zA-Z]+) --player3 (?<P3Username>[a-zA-Z]+) --player4 (?<P4Username>[a-zA-Z]+)"),

    CHANGE_NICKNAME("profile change --nickname (?<newNickname>[a-zA-Z]+)"),
    CHANGE_PASSWORD("profile change --password --current (?<currentPassword>[a-zA-Z]+) --new (?<newPassword>[a-zA-Z]+)");


    private final String regex;

    Commands(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return this.regex;
    }

    public static Matcher getMatcher(String input, Commands commands) {
        Pattern pattern = Pattern.compile(commands.regex);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }
}
