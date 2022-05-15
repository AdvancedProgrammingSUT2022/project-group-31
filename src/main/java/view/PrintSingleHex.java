package view;

import Enums.Types.*;
import model.Hex;
import model.Player;
import model.User;

public class PrintSingleHex {
    public static final String RESET = "\u001B[0m";
    String BLUE = "\033[44m";
    public static final String THE_BLUE = "\u001B[34m";

    public void run() {
        Hex hex = new Hex(HexTypes.HILL, 0, 2, StrategicResources.HORSE, LuxuryResources.SILK, null);
        hex.setLandFeatureType(LandFeatureType.JUNGLE);
        User user = null;
        Player player = new Player("amin", null);

        //TODO fog of war print hex
        //TODO resource show
        hex.setRiverOnNorthWest(true);
        hex.setRiverOnSouthEast(true);
        hex.setRiverOnSouth(true);
        hex.setRiverOnNorth(true);
        if (true) {
            System.out.println("      _____________");
            System.out.println("     /             \\");
            System.out.println("    /     (" + hex.getX() + "," + hex.getY() + ")     \\");
            System.out.println("   /                 \\");
            System.out.println("   \\                 /");
            System.out.println("    \\               /");
            System.out.println("     \\             /");
            System.out.println("      -------------");
            System.out.println("hex state is: FOG OF WAR");
            System.out.println("you must discover this Hex to see additional information");

        }
        System.out.println("\n\n\n");
        System.out.println("      " + (hex.isRiverOnNorth() ? THE_BLUE : "") + "_____________" + RESET);
        System.out.println("     " + (hex.isRiverOnNorthWest() ? BLUE : "") + "/" + hex.getColor() + "             " + RESET + (hex.isRiverOnNorthEast() ? BLUE : "") + "\\" + RESET);
        System.out.println("    " + (hex.isRiverOnNorthWest() ? BLUE : "") + "/" + hex.getColor() + "     (" + hex.getX() + "," + hex.getY() + ")     " + RESET + (hex.isRiverOnNorthEast() ? BLUE : "") + "\\" + RESET);
        System.out.println("   " + (hex.isRiverOnNorthWest() ? BLUE : "") + "/" + hex.getColor() + "                 " + RESET + (hex.isRiverOnNorthEast() ? BLUE : "") + "\\" + RESET);
        System.out.println("   " + (hex.isRiverOnSouthWest() ? BLUE : "") + "\\" + hex.getColor() + "                 " + RESET + (hex.isRiverOnSouthEast() ? BLUE : "") + "/" + RESET);
        System.out.println("    " + (hex.isRiverOnSouthWest() ? BLUE : "") + "\\" + hex.getColor() + "               " + RESET + (hex.isRiverOnSouthEast() ? BLUE : "") + "/" + RESET);
        System.out.println("     " + (hex.isRiverOnSouthWest() ? BLUE : "") + "\\" + hex.getColor() + "             " + RESET + (hex.isRiverOnSouthEast() ? BLUE : "") + "/" + RESET);
        System.out.println("      " + (hex.isRiverOnNorth() ? THE_BLUE : "") + "-------------" + RESET);
        System.out.println("hex state is: Visible");
        System.out.println("battle effect: " + (hex.getBattleEfficiency() > 0 ? "+" : "") + hex.getBattleEfficiency());
        System.out.println("Type: " + hex.getFullName());
        System.out.println("Feature: " + hex.getLandFeatureType());
        System.out.println("Food: " + hex.getFood() + "\nProduction: " + hex.getProduction() + "\nGold: " + hex.getGold());
        System.out.println("Movement cost: " + hex.getMP());
        System.out.println("Road: " + (hex.isRoadOnHex() ? "Yes" : "No"));
        //     player.addTechnology(hex.getStrategicResources().getNeededTechnology());
        System.out.println("Strategic Resource: " + (hex.getStrategicResources() == null ? "null" : (player.isTechnologyAchieved(hex.getStrategicResources().getNeededTechnology()) ? hex.getStrategicResources() : "Unknown")));
        System.out.println("Luxury Resource: " + hex.getLuxuryResources());
        System.out.println("Bonus Resource: " + hex.getBonusResources());
        System.out.println("owner: " + hex.getOwner());


    }
}
