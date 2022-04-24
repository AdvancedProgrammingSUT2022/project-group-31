package Enums;

public enum Message {
    INVALID_COMMAND("Invalid command"),
    INVALID_POSITION("Invalid position"),
    DONT_OWN_THIS_UNIT("you don\'t own this unit"),
    NO_CITY_WITH_THIS_NAME("there os no city with this name"),
    NO_CITY_IN_THIS_POSITION("there is no city in this position");
    //TODO

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
