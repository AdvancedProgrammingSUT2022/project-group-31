package view;

import javax.xml.xpath.XPath;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Commands {
    MENU_ENTER("menu enter (?<menuName>[a-zA-Z]+)"),
    MENU_EXIT("menu exit"),
    MENU_SHOW_CURRENT("menu show-current"),
    CREATE_USER1("user create --username (?<username>[a-zA-Z]+) --nickname (?<nickname>[a-zA-Z]+) --password (?<password>[a-zA-Z]+)"),
    //CREATE_USER2("")
    USER_LOGIN("user login --username (?<username>[a-zA-Z]+) --password (?<password>[a-zA-Z]+)"),
    USER_LOGOUT("user logout"),
    PLAY_GAME("play game --player1 (?<P1Username>[a-zA-Z]+) --player2 (?<P2Username>[a-zA-Z]+)"),
    CHANGE_NICKNAME("profile change --nickname (?<newNickname>[a-zA-Z]+)"),
    CHANGE_PASSWORD("profile change --password --current (?<currentPassword>[a-zA-Z]+) --new (?<newPassword>[a-zA-Z]+)");


    private String regex;

    Commands(String regex) {
        this.regex = regex;
    }
    public String getRegex (){
        return this.regex;
    }

    public static Matcher getMatcher(String input, Commands commands) {
       Pattern pattern= Pattern.compile(commands.regex);
       Matcher matcher=pattern.matcher(input);
            return matcher;
    }
}
