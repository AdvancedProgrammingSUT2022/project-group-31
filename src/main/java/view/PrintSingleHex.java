package view;

import Enums.Types.HexTypes;
import model.Hex;

public class PrintSingleHex {
    public static final String RESET = "\u001B[0m";
    String BLUE = "\033[44m";
    public static final String THE_BLUE = "\u001B[34m";

    public void run(Hex hex) {

        hex.setRiverOnNorthWest(true);
        hex.setRiverOnSouthEast(true);
        hex.setRiverOnSouth(true);
        hex.setRiverOnNorth(true);
        System.out.println("      " + (hex.isRiverOnNorth() ? THE_BLUE : "") + "_____________" + RESET);
        System.out.println("     " + (hex.isRiverOnNorthWest() ? BLUE : "") + "/" + hex.getColor() + "             " + RESET + (hex.isRiverOnNorthEast() ? BLUE : "") + "\\" + RESET);
        System.out.println("    " + (hex.isRiverOnNorthWest() ? BLUE : "") + "/" + hex.getColor() + "     (" + hex.getX() + "," + hex.getY() + ")     " + RESET + (hex.isRiverOnNorthEast() ? BLUE : "") + "\\" + RESET);
        System.out.println("   " + (hex.isRiverOnNorthWest() ? BLUE : "") + "/" + hex.getColor() + "                 " + RESET + (hex.isRiverOnNorthEast() ? BLUE : "") + "\\" + RESET);
        System.out.println("   " + (hex.isRiverOnSouthWest() ? BLUE : "") + "\\" + hex.getColor() + "                 " + RESET + (hex.isRiverOnSouthEast() ? BLUE : "") + "/" + RESET);
        System.out.println("    " + (hex.isRiverOnSouthWest() ? BLUE : "") + "\\" + hex.getColor() + "               " + RESET + (hex.isRiverOnSouthEast() ? BLUE : "") + "/" + RESET);
        System.out.println("     " + (hex.isRiverOnSouthWest() ? BLUE : "") + "\\" + hex.getColor() + "             " + RESET + (hex.isRiverOnSouthEast() ? BLUE : "") + "/" + RESET);
        System.out.println("      " + (hex.isRiverOnNorth() ? THE_BLUE : "") + "-------------" + RESET);
        System.out.println("hex state is: " + "FOG OF WAR");
        System.out.println("owner: " + hex.getOwner());
        System.out.println("battle effect: " + hex.getBattleEfficiency());
    }
}
