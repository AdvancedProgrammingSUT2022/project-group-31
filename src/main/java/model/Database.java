package model;

import Enums.Types.HexTypes;

import java.util.ArrayList;

public class Database {
    private static Database instance = null;

    private Database() {
        hex00 = new Hex(HexTypes.HILL.getName(), HexTypes.HILL.getFood(), HexTypes.HILL.getProduction(), HexTypes.HILL.getGold(), HexTypes.HILL.getBattleEfficacy(), HexTypes.HILL.getMP(), HexTypes.HILL.getColor());
        hex01 = new Hex(HexTypes.DESERT.getName(), HexTypes.DESERT.getFood(), HexTypes.DESERT.getProduction(), HexTypes.DESERT.getGold(), HexTypes.DESERT.getBattleEfficacy(), HexTypes.DESERT.getMP(), HexTypes.DESERT.getColor());
        hex02 = new Hex(HexTypes.PLAIN.getName(), HexTypes.PLAIN.getFood(), HexTypes.PLAIN.getProduction(), HexTypes.PLAIN.getGold(), HexTypes.PLAIN.getBattleEfficacy(), HexTypes.PLAIN.getMP(), HexTypes.PLAIN.getColor());
        hex03 = new Hex(HexTypes.SNOW.getName(), HexTypes.SNOW.getFood(), HexTypes.SNOW.getProduction(), HexTypes.SNOW.getGold(), HexTypes.SNOW.getBattleEfficacy(), HexTypes.SNOW.getMP(), HexTypes.SNOW.getColor());
        hex04 = new Hex(HexTypes.TUNDRA.getName(), HexTypes.TUNDRA.getFood(), HexTypes.TUNDRA.getProduction(), HexTypes.TUNDRA.getGold(), HexTypes.TUNDRA.getBattleEfficacy(), HexTypes.TUNDRA.getMP(), HexTypes.TUNDRA.getColor());
        hex05 = new Hex(HexTypes.HILL.getName(), HexTypes.HILL.getFood(), HexTypes.HILL.getProduction(), HexTypes.HILL.getGold(), HexTypes.HILL.getBattleEfficacy(), HexTypes.HILL.getMP(), HexTypes.HILL.getColor());
        hex10 = new Hex(HexTypes.MEADOW.getName(), HexTypes.MEADOW.getFood(), HexTypes.MEADOW.getProduction(), HexTypes.MEADOW.getGold(), HexTypes.MEADOW.getBattleEfficacy(), HexTypes.MEADOW.getMP(), HexTypes.MEADOW.getColor());
        hex11 = new Hex(HexTypes.OCEAN.getName(), HexTypes.OCEAN.getFood(), HexTypes.OCEAN.getProduction(), HexTypes.OCEAN.getGold(), HexTypes.OCEAN.getBattleEfficacy(), HexTypes.OCEAN.getMP(), HexTypes.OCEAN.getColor());
        hex12 = new Hex(HexTypes.HILL.getName(), HexTypes.HILL.getFood(), HexTypes.HILL.getProduction(), HexTypes.HILL.getGold(), HexTypes.HILL.getBattleEfficacy(), HexTypes.HILL.getMP(), HexTypes.HILL.getColor());
        hex23 = new Hex(HexTypes.DESERT.getName(), HexTypes.DESERT.getFood(), HexTypes.DESERT.getProduction(), HexTypes.DESERT.getGold(), HexTypes.DESERT.getBattleEfficacy(), HexTypes.DESERT.getMP(), HexTypes.DESERT.getColor());
        hex14 = new Hex(HexTypes.PLAIN.getName(), HexTypes.PLAIN.getFood(), HexTypes.PLAIN.getProduction(), HexTypes.PLAIN.getGold(), HexTypes.PLAIN.getBattleEfficacy(), HexTypes.PLAIN.getMP(), HexTypes.PLAIN.getColor());
        hex15 = new Hex(HexTypes.SNOW.getName(), HexTypes.SNOW.getFood(), HexTypes.SNOW.getProduction(), HexTypes.SNOW.getGold(), HexTypes.SNOW.getBattleEfficacy(), HexTypes.SNOW.getMP(), HexTypes.SNOW.getColor());
        hex20 = new Hex(HexTypes.TUNDRA.getName(), HexTypes.TUNDRA.getFood(), HexTypes.TUNDRA.getProduction(), HexTypes.TUNDRA.getGold(), HexTypes.TUNDRA.getBattleEfficacy(), HexTypes.TUNDRA.getMP(), HexTypes.TUNDRA.getColor());
        hex21 = new Hex(HexTypes.PLAIN.getName(), HexTypes.PLAIN.getFood(), HexTypes.PLAIN.getProduction(), HexTypes.PLAIN.getGold(), HexTypes.PLAIN.getBattleEfficacy(), HexTypes.PLAIN.getMP(), HexTypes.PLAIN.getColor());
        hex22 = new Hex(HexTypes.PLAIN.getName(), HexTypes.PLAIN.getFood(), HexTypes.PLAIN.getProduction(), HexTypes.PLAIN.getGold(), HexTypes.PLAIN.getBattleEfficacy(), HexTypes.PLAIN.getMP(), HexTypes.PLAIN.getColor());
        hex13 = new Hex(HexTypes.MOUNTAIN.getName(), HexTypes.MOUNTAIN.getFood(), HexTypes.MOUNTAIN.getProduction(), HexTypes.MOUNTAIN.getGold(), HexTypes.MOUNTAIN.getBattleEfficacy(), HexTypes.MOUNTAIN.getMP(), HexTypes.MOUNTAIN.getColor());
        hex24 = new Hex(HexTypes.HILL.getName(), HexTypes.HILL.getFood(), HexTypes.HILL.getProduction(), HexTypes.HILL.getGold(), HexTypes.HILL.getBattleEfficacy(), HexTypes.HILL.getMP(), HexTypes.HILL.getColor());
        hex25 = new Hex(HexTypes.MEADOW.getName(), HexTypes.MEADOW.getFood(), HexTypes.MEADOW.getProduction(), HexTypes.MEADOW.getGold(), HexTypes.MEADOW.getBattleEfficacy(), HexTypes.MEADOW.getMP(), HexTypes.MEADOW.getColor());

    }

    public static Database getInstance() {
        if (instance == null) instance = new Database();
        return instance;

    }

    private static ArrayList<User> users;
    private static ArrayList<HexTypes> map;
    private Hex hex00;
    private Hex hex01;
    private Hex hex02;
    private Hex hex03;
    private Hex hex04;
    private Hex hex05;
    private Hex hex10;
    private Hex hex11;
    private Hex hex12;
    private Hex hex13;
    private Hex hex14;
    private Hex hex15;
    private Hex hex20;
    private Hex hex21;
    private Hex hex22;
    private Hex hex23;
    private Hex hex24;
    private Hex hex25;


    public void addUser(User user) {
        users.add(user);
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (username.equals(user.username)) return user;
        }
        return null;
    }

    public User getUsernameByNickname(String nickname) {
        for (User user : users) {
            if (nickname.equals(user.username)) return user;
        }
        return null;
    }

    public User getUserByNickname(String nickname) {
        for (User user : users) {
            if (user.nickname.equals(nickname)) return user;
        }
        return null;
    }

    public void initializeHex() {


    }

    public void changePassword(User user, String newPassword) {
        user.setPassword(newPassword);
    }

    public void changeUsername(User user, String newUsername) {
        user.setUsername(newUsername);
    }

    public void changeNickname(User user, String newNickname) {
        user.setNickname(newNickname);
    }

    public Hex Hex00() {
        return hex00;
    }

    public Hex Hex01() {
        return hex01;
    }

    public Hex Hex02() {
        return hex02;
    }

    public Hex Hex03() {
        return hex03;
    }

    public Hex Hex04() {
        return hex04;
    }

    public Hex Hex05() {
        return hex05;
    }

    public Hex Hex10() {
        return hex10;
    }

    public Hex Hex11() {
        return hex11;
    }

    public Hex Hex12() {
        return hex12;
    }

    public Hex Hex13() {
        return hex13;
    }

    public Hex Hex14() {
        return hex14;
    }

    public Hex Hex15() {
        return hex15;
    }

    public Hex Hex20() {
        return hex20;
    }

    public Hex Hex21() {
        return hex21;
    }

    public Hex Hex22() {
        return hex22;
    }

    public Hex Hex23() {
        return hex23;
    }

    public Hex Hex24() {
        return hex24;
    }

    public Hex Hex25() {
        return hex25;
    }
}
