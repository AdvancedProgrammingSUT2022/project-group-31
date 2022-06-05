package civ.Enums;

public class Colors {
    private static Colors instance = null;

    private Colors() {
    }

    public static Colors getInstance() {
        if (instance == null) instance = new Colors();

        return instance;
    }

    public static final String RESET = "\u001B[0m";
    public static final String SANE = "\u001B[0m";

    public static final String HIGH_INTENSITY = "\u001B[1m";
    public static final String LOW_INTENSITY = "\u001B[2m";

    public static final String ITALIC = "\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String BLINK = "\u001B[5m";
    public static final String RAPID_BLINK = "\u001B[6m";
    public static final String REVERSE_VIDEO = "\u001B[7m";
    public static final String INVISIBLE_TEXT = "\u001B[8m";

    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String BACKGROUND_BLACK = "\u001B[40m";
    public static final String BACKGROUND_RED = "\u001B[41m";
    public static final String BACKGROUND_GREEN = "\u001B[42m";
    public static final String BACKGROUND_YELLOW = "\u001B[43m";
    public static final String BACKGROUND_BLUE = "\u001B[44m";
    public static final String BACKGROUND_MAGENTA = "\u001B[45m";
    public static final String BACKGROUND_CYAN = "\u001B[46m";
    public static final String BACKGROUND_WHITE = "\u001B[47m";


    public static final String Background_Bright_Black = "\u001b[40;1m";
    public static final String Background_Bright_Red = "\u001b[41;1m";
    public static final String Background_Bright_Green = "\u001b[42;1m";
    public static final String Background_Bright_Yellow = "\u001b[43;1m";
    public static final String Background_Bright_Blue = "\u001b[44;1m";
    public static final String Background_Bright_Magenta = "\u001b[45;1m";
    public static final String Background_Bright_Cyan = "\u001b[46;1m";
    public static final String Background_Bright_White = "\u001b[47;1m";


}
