package view;

import Enums.Types.BonusResources;
import Enums.Types.HexTypes;
import Enums.Types.LuxuryResources;
import Enums.Types.StrategicResources;
import model.Hex;
import model.Player;
import model.User;

public class PrintSingleHex {
    public static final String RESET = "\u001B[0m";
    String BLUE = "\033[44m";
    public static final String THE_BLUE = "\u001B[34m";

    public void run() {
        Hex hex = new Hex(HexTypes.PLAIN, 0, 2, StrategicResources.HORSE, LuxuryResources.SILK, BonusResources.BANANA);
        User user = null;
        Player player = new Player("amin", user);

        //TODO fog of war print hex
        //TODO resource show
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
        System.out.println("hex state is: Visible");
        System.out.println("battle effect: " + hex.getBattleEfficiency());
        System.out.println("Type: " + hex.getFullName());
        System.out.println("Food: " + hex.getFood() + "\nProduction: " + hex.getProduction() + "\nGold: " + hex.getGold());
        System.out.println("owner: " + hex.getOwner());



    }
}
