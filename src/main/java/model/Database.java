package model;

import Enums.Types.*;

import java.util.ArrayList;

public class Database {
    private static Database instance = null;

    private Database() {


        map.add(hex00 = new Hex(HexTypes.HILL, 0, 0, null, LuxuryResources.COLOR, BonusResources.SHEEP));
        addFeatureToHex(hex00, LandFeatureType.MASSIVE_FOREST);

        map.add(hex01 = new Hex(HexTypes.DESERT, 0, 1, StrategicResources.IRON, LuxuryResources.COTTON, null));
        addFeatureToHex(hex01, LandFeatureType.OASIS);

        map.add(hex02 = new Hex(HexTypes.PLAIN, 0, 2, StrategicResources.HORSE, LuxuryResources.SILK, BonusResources.BANANA));
        addFeatureToHex(hex02, LandFeatureType.JUNGLE);

        map.add(hex03 = new Hex(HexTypes.SNOW, 0, 3, null, null, null));
        addFeatureToHex(hex04, null);

        map.add(hex04 = new Hex(HexTypes.TUNDRA, 0, 4, StrategicResources.HORSE, LuxuryResources.FUR, BonusResources.GAZELLE));
        addFeatureToHex(hex04, LandFeatureType.JUNGLE);

        map.add(hex05 = new Hex(HexTypes.HILL, 0, 5, StrategicResources.COAL, LuxuryResources.SUGAR, BonusResources.BANANA));
        addFeatureToHex(hex05, LandFeatureType.JUNGLE);

        map.add(hex10 = new Hex(HexTypes.MEADOW, 1, 0, null, LuxuryResources.GEMSTONE, BonusResources.COW));
        addFeatureToHex(hex10, LandFeatureType.LAGOON);

        map.add(hex11 = new Hex(HexTypes.OCEAN, 1, 1, null, null, null));
        addFeatureToHex(hex11, null);

        map.add(hex12 = new Hex(HexTypes.HILL, 1, 2, StrategicResources.IRON, LuxuryResources.GOLD, BonusResources.SHEEP));
        addFeatureToHex(hex12, LandFeatureType.MASSIVE_FOREST);

        map.add(hex13 = new Hex(HexTypes.MOUNTAIN, 1, 3, null, null, null));
        addFeatureToHex(hex12, null);

        map.add(hex14 = new Hex(HexTypes.PLAIN, 1, 4, StrategicResources.COAL, null, BonusResources.SHEEP));
        addFeatureToHex(hex14, LandFeatureType.MASSIVE_FOREST);

        map.add(hex15 = new Hex(HexTypes.SNOW, 1, 5, null, null, null));
        addFeatureToHex(hex15, null);

        map.add(hex20 = new Hex(HexTypes.TUNDRA, 2, 0, StrategicResources.HORSE, null, BonusResources.GAZELLE));
        addFeatureToHex(hex20, LandFeatureType.JUNGLE);

        map.add(hex21 = new Hex(HexTypes.PLAIN, 2, 1, null, LuxuryResources.INCENSE, BonusResources.SHEEP));
        addFeatureToHex(hex21, LandFeatureType.JUNGLE);

        map.add(hex22 = new Hex(HexTypes.PLAIN, 2, 2, StrategicResources.HORSE, LuxuryResources.TUSK, null));
        addFeatureToHex(hex22, LandFeatureType.MASSIVE_FOREST);

        map.add(hex23 = new Hex(HexTypes.DESERT, 2, 3, StrategicResources.IRON, LuxuryResources.GOLD, BonusResources.WHEAT));
        addFeatureToHex(hex23, LandFeatureType.VALLEY);

        map.add(hex24 = new Hex(HexTypes.HILL, 2, 4, StrategicResources.IRON, LuxuryResources.MARBLE, BonusResources.BANANA));
        addFeatureToHex(hex24, LandFeatureType.JUNGLE);

        map.add(hex25 = new Hex(HexTypes.SNOW, 2, 5, null, null, null));
        addFeatureToHex(hex25, null);


        allTechnologies.add(Technology.AGRICULTURE);
        allTechnologies.add(Technology.ANIMAL_HUSBANDRY);
        allTechnologies.add(Technology.ARCHERY);
        allTechnologies.add(Technology.MINING);
        allTechnologies.add(Technology.POTTERY);
        allTechnologies.add(Technology.BRONZE_WORKING);
        allTechnologies.add(Technology.CALENDER);
        allTechnologies.add(Technology.MASONRY);
        allTechnologies.add(Technology.THE_WHEEL);
        allTechnologies.add(Technology.TRAPPING);
        allTechnologies.add(Technology.WRITING);
        allTechnologies.add(Technology.CONSTRUCTION);
        allTechnologies.add(Technology.HORSEBACK_RIDING);
        allTechnologies.add(Technology.IRON_WORKING);
        allTechnologies.add(Technology.MATHEMATICS);
        allTechnologies.add(Technology.PHILOSOPHY);
        allTechnologies.add(Technology.ENGINEERING);
        allTechnologies.add(Technology.CURRENCY);
        allTechnologies.add(Technology.CIVIL_SERVICE);
        allTechnologies.add(Technology.CHIVALRY);
        allTechnologies.add(Technology.METAL_CASTING);
        allTechnologies.add(Technology.STEEL);
        allTechnologies.add(Technology.THEOLOGY);
        allTechnologies.add(Technology.EDUCATION);
        allTechnologies.add(Technology.MACHINERY);
        allTechnologies.add(Technology.PHYSICS);
        allTechnologies.add(Technology.ACOUSTICS);
        allTechnologies.add(Technology.ARCHAEOLOGY);
        allTechnologies.add(Technology.BANKING);
        allTechnologies.add(Technology.GUNPOWDER);
        allTechnologies.add(Technology.METALLURGY);
        allTechnologies.add(Technology.CHEMISTRY);
        allTechnologies.add(Technology.PRINTING_PRESS);
        allTechnologies.add(Technology.ECONOMICS);
        allTechnologies.add(Technology.FERTILIZER);
        allTechnologies.add(Technology.MILITARY_SCIENCE);
        allTechnologies.add(Technology.RIFLING);
        allTechnologies.add(Technology.SCIENTIFIC_THEORY);
        allTechnologies.add(Technology.BIOLOGY);
        allTechnologies.add(Technology.STEAM_POWER);
        allTechnologies.add(Technology.DYNAMITE);
        allTechnologies.add(Technology.RAILROAD);
        allTechnologies.add(Technology.REPLACEABLE_PARTS);
        allTechnologies.add(Technology.ELECTRICITY);
        allTechnologies.add(Technology.RADIO);
        allTechnologies.add(Technology.TELEGRAPH);


    }

    private void addFeatureToHex(Hex hex, LandFeatureType landFeatureType) {
        hex.setLandFeatureType(landFeatureType);
    }

    private void setResourceToHex(Hex hex, LuxuryResources luxuryResource, StrategicResources strategicResource, BonusResources bonusResource) {
        hex.setBonusResources(bonusResource);
        hex.setLuxuryResources(luxuryResource);
        hex.setStrategicResources(strategicResource);
    }

    public static Database getInstance() {
        if (instance == null) instance = new Database();
        return instance;

    }

    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Hex> map = new ArrayList<>();
    private static ArrayList<Technology> allTechnologies = new ArrayList<>();

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

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static ArrayList<Hex> getMap() {
        return map;
    }

    public static ArrayList<Technology> getAllTechnologies() {
        return allTechnologies;
    }

    private Hex hex25;


    public void addUser(User user) {
        users.add(user);
    }

    public User getUserByUsername(String username) {
        for (User user : users) {
            if (username.equals(user.getUsername())) return user;
        }
        return null;
    }

    public User getUsernameByNickname(String nickname) {
        for (User user : users) {
            if (nickname.equals(user.getUsername())) return user;
        }
        return null;
    }

    public User getUserByNickname(String nickname) {
        for (User user : users) {
            if (user.getNickname().equals(nickname)) return user;
        }
        return null;
    }

    public void addHex(Hex hex) {
        map.add(hex);
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

    public Hex getHexByPosition(int x, int y) {

        for (Hex hex : map) {
            if (hex.getX() == x && hex.getY() == y) return hex;
        }
        return null;
    }
}
