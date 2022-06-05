package civ.view;

import civ.model.Database;
import civ.model.Player;

public class PrintMap {
    public static void run(Player player) {

     //   Colors C = Colors.getInstance();
        Database database = Database.getInstance();

        //     String name =  C.BG_BLUE;
        //TODO set rivers
        String GREEN = "\033[42m";
        String RESET = "\033[0m";
        String YELLOW = "\033[43m";
        String RED = "\033[41m";
        String BLUE = "\033[44m";
        int n = 0;
        System.out.println("\n\n\n");
        System.out.println("   _____           _____           _____");
        //line 1
        System.out.print(player.isHexVisible(database.Hex00()) ? ("  /" + database.Hex00().getColor() + "     " + RESET + "\\" + "       ") : "  /     \\       "); //hex(0,0)
        System.out.print(player.isHexVisible(database.Hex02()) ? ("  /" + database.Hex02().getColor() + "     " + RESET + "\\" + "       ") : "  /     \\       "); //hex(0,2)
        System.out.print(player.isHexVisible(database.Hex04()) ? ("  /" + database.Hex04().getColor() + "     " + RESET + "\\" + "       ") : "  /     \\       "); //hex(0,4)
        System.out.println();

        //line 2
        System.out.print(player.isHexVisible(database.Hex00()) ? (" /" + database.Hex00().getColor() + " (0,0) " + RESET + "\\" + "      ") : " / (0,0) \\      "); //hex(0,0)
        System.out.print(player.isHexVisible(database.Hex02()) ? (" /" + database.Hex02().getColor() + " (0,2) " + RESET + "\\" + "      ") : " / (0,2) \\      "); //hex(0,2)
        System.out.print(player.isHexVisible(database.Hex04()) ? (" /" + database.Hex04().getColor() + " (0,4) " + RESET + "\\" + "      ") : " / (0,4) \\      "); //hex(0,4)
        System.out.println();

        //line3
        System.out.print(player.isHexVisible(database.Hex00()) ? ("/" + database.Hex00().getColor() + "         " + RESET + "\\" + "_____") : "/         \\_____"); //hex(0,0)
        System.out.print(player.isHexVisible(database.Hex02()) ? ("/" + database.Hex02().getColor() + "         " + RESET + "\\" + "_____") : "/         \\_____"); //hex(0,2)
        System.out.print(player.isHexVisible(database.Hex04()) ? ("/" + database.Hex04().getColor() + "         " + RESET + "\\" + "_____") : "/         \\_____"); //hex(0,4)
        System.out.println();

        //line4
        System.out.print(player.isHexVisible(database.Hex00()) ? ("\\" + database.Hex00().getColor() + "         " + RESET + BLUE + "/" + RESET) : "\\         /"); //hex(0,0)
        System.out.print(player.isHexVisible(database.Hex01()) ? (database.Hex01().getColor() + "     " + RESET + "\\") : "     \\"); //hex(0,1)
        System.out.print(player.isHexVisible(database.Hex02()) ? (database.Hex02().getColor() + "         " + RESET + "/") : "         /"); //hex(0,2)
        System.out.print(player.isHexVisible(database.Hex03()) ? (database.Hex03().getColor() + "     " + RESET + "\\") : "     \\"); //hex(0,3)
        System.out.print(player.isHexVisible(database.Hex04()) ? (database.Hex04().getColor() + "         " + RESET + "/") : "         /"); //hex(0,4)
        System.out.print(player.isHexVisible(database.Hex05()) ? (database.Hex05().getColor() + "     " + RESET + BLUE + "\\" + RESET) : "     \\"); //hex(0,5)
        System.out.println();

        //line5
        System.out.print(player.isHexVisible(database.Hex00()) ? (" \\" + database.Hex00().getColor() + "       " + RESET + BLUE + "/" + RESET) : " \\       /"); //hex(0,0)
        System.out.print(player.isHexVisible(database.Hex01()) ? (database.Hex01().getColor() + " (0,1) " + RESET + "\\") : " (0,1) \\"); //hex(0,1)
        System.out.print(player.isHexVisible(database.Hex02()) ? (database.Hex02().getColor() + "       " + RESET + "/") : "       /"); //hex(0,2)
        System.out.print(player.isHexVisible(database.Hex03()) ? (database.Hex03().getColor() + " (0,3) " + RESET + "\\") : " (0,3) \\"); //hex(0,3)
        System.out.print(player.isHexVisible(database.Hex04()) ? (database.Hex04().getColor() + "       " + RESET + "/") : "       /"); //hex(0,4)
        System.out.print(player.isHexVisible(database.Hex05()) ? (database.Hex05().getColor() + " (0,5) " + RESET + BLUE + "\\" + RESET) : " (0,5) \\"); //hex(0,5)
        System.out.println();

        //line6
        System.out.print(player.isHexVisible(database.Hex00()) ? ("  \\" + database.Hex00().getColor() + "_____" + RESET + BLUE + "/" + RESET) : "  \\_____/"); //hex(0,0)
        System.out.print(player.isHexVisible(database.Hex01()) ? (database.Hex01().getColor() + "         " + RESET + "\\") : "         \\"); //hex(0,1)
        System.out.print(player.isHexVisible(database.Hex02()) ? (database.Hex02().getColor() + "_____" + RESET + "/") : "_____/"); //hex(0,2)
        System.out.print(player.isHexVisible(database.Hex03()) ? (database.Hex03().getColor() + "         " + RESET + "\\") : "         \\"); //hex(0,3)
        System.out.print(player.isHexVisible(database.Hex04()) ? (database.Hex04().getColor() + "_____" + RESET + "/") : "_____/"); //hex(0,4)
        System.out.print(player.isHexVisible(database.Hex05()) ? (database.Hex05().getColor() + "         " + RESET + BLUE + "\\" + RESET) : "         \\"); //hex(0,5)
        System.out.println();

        //line7
        System.out.print(player.isHexVisible(database.Hex10()) ? ("  /" + database.Hex10().getColor() + "     " + RESET + "\\") : "  /     \\"); //hex(1,0)
        System.out.print(player.isHexVisible(database.Hex01()) ? (database.Hex01().getColor() + "         " + RESET + BLUE + "/" + RESET) : "         /"); //hex(0,1)
        System.out.print(player.isHexVisible(database.Hex12()) ? (database.Hex12().getColor() + "     " + RESET + "\\") : "     \\"); //hex(1,2)
        System.out.print(player.isHexVisible(database.Hex03()) ? (database.Hex03().getColor() + "         " + RESET + "/") : "         /"); //hex(0,3)
        System.out.print(player.isHexVisible(database.Hex14()) ? (database.Hex14().getColor() + "     " + RESET + "\\") : "     \\"); //hex(1,4)
        System.out.print(player.isHexVisible(database.Hex05()) ? (database.Hex05().getColor() + "         " + RESET + "/") : "         /"); //hex(0,5)
        System.out.println();

        //line8
        System.out.print(player.isHexVisible(database.Hex10()) ? (" /" + database.Hex10().getColor() + " (1,0) " + RESET + "\\") : " / (1,0) \\"); //hex(1,0)
        System.out.print(player.isHexVisible(database.Hex01()) ? (database.Hex01().getColor() + "       " + RESET + BLUE + "/" + RESET) : "       /"); //hex(0,1)
        System.out.print(player.isHexVisible(database.Hex12()) ? (database.Hex12().getColor() + " (1,2) " + RESET + "\\") : " (1,2) \\"); //hex(1,2)
        System.out.print(player.isHexVisible(database.Hex03()) ? (database.Hex03().getColor() + "       " + RESET + "/") : "       /"); //hex(0,3)
        System.out.print(player.isHexVisible(database.Hex14()) ? (database.Hex14().getColor() + " (1,4) " + RESET + "\\") : " (1,4) \\"); //hex(1,4)
        System.out.print(player.isHexVisible(database.Hex05()) ? (database.Hex05().getColor() + "       " + RESET + "/") : "       /"); //hex(0,5)
        System.out.println();

        //line9
        System.out.print(player.isHexVisible(database.Hex10()) ? ("/" + database.Hex10().getColor() + "         " + RESET + "\\") : "/         \\"); //hex(1,0)
        System.out.print(player.isHexVisible(database.Hex01()) ? (database.Hex01().getColor() + "_____" + RESET + BLUE + "/" + RESET) : "_____/"); //hex(0,1)
        System.out.print(player.isHexVisible(database.Hex12()) ? (database.Hex12().getColor() + "         " + RESET + "\\") : "         \\"); //hex(1,2)
        System.out.print(player.isHexVisible(database.Hex03()) ? (database.Hex03().getColor() + "_____" + RESET + "/") : "_____/"); //hex(0,3)
        System.out.print(player.isHexVisible(database.Hex14()) ? (database.Hex14().getColor() + "         " + RESET + "\\") : "         \\"); //hex(1,4)
        System.out.print(player.isHexVisible(database.Hex05()) ? (database.Hex05().getColor() + "_____" + RESET + "/") : "_____/"); //hex(0,5)
        System.out.println();

        //line10
        System.out.print(player.isHexVisible(database.Hex10()) ? ("\\" + database.Hex10().getColor() + "         " + RESET + "/") : "\\         /"); //hex(1,0)
        System.out.print(player.isHexVisible(database.Hex11()) ? (database.Hex11().getColor() + "     " + RESET + "\\") : "     \\"); //hex(1,1)
        System.out.print(player.isHexVisible(database.Hex12()) ? (database.Hex12().getColor() + "         " + RESET + "/") : "         /"); //hex(1,2)
        System.out.print(player.isHexVisible(database.Hex13()) ? (database.Hex13().getColor() + "     " + RESET + BLUE + "\\" + RESET) : "     \\"); //hex(1,3)
        System.out.print(player.isHexVisible(database.Hex14()) ? (database.Hex14().getColor() + "         " + RESET + "/") : "         /"); //hex(1,4)
        System.out.print(player.isHexVisible(database.Hex15()) ? (database.Hex15().getColor() + "     " + RESET + "\\") : "     \\"); //hex(1,5)
        System.out.println();

        //line11
        System.out.print(player.isHexVisible(database.Hex10()) ? (" \\" + database.Hex10().getColor() + "       " + RESET + "/") : " \\       /"); //hex(1,0)
        System.out.print(player.isHexVisible(database.Hex11()) ? (database.Hex11().getColor() + " (1,1) " + RESET + "\\") : " (1,1) \\"); //hex(1,1)
        System.out.print(player.isHexVisible(database.Hex12()) ? (database.Hex12().getColor() + "       " + RESET + "/") : "       /"); //hex(1,2)
        System.out.print(player.isHexVisible(database.Hex13()) ? (database.Hex13().getColor() + " (1,3) " + RESET + BLUE + "\\" + RESET) : " (1,3) \\"); //hex(1,3)
        System.out.print(player.isHexVisible(database.Hex14()) ? (database.Hex14().getColor() + "       " + RESET + "/") : "       /"); //hex(1,4)
        System.out.print(player.isHexVisible(database.Hex15()) ? (database.Hex15().getColor() + " (1,5) " + RESET + "\\") : " (1,5) \\"); //hex(1,5)
        System.out.println();

        //line12
        System.out.print(player.isHexVisible(database.Hex10()) ? ("  \\" + database.Hex10().getColor() + "_____" + RESET + "/") : "  \\_____/"); //hex(1,0)
        System.out.print(player.isHexVisible(database.Hex11()) ? (database.Hex11().getColor() + "         " + RESET + "\\") : "         \\"); //hex(1,1)
        System.out.print(player.isHexVisible(database.Hex12()) ? (database.Hex12().getColor() + "_____" + RESET + "/") : "_____/"); //hex(1,2)
        System.out.print(player.isHexVisible(database.Hex13()) ? (database.Hex13().getColor() + "         " + RESET + BLUE + "\\" + RESET) : "         \\"); //hex(1,3)
        System.out.print(player.isHexVisible(database.Hex14()) ? (database.Hex14().getColor() + "_____" + RESET + "/") : "_____/"); //hex(1,4)
        System.out.print(player.isHexVisible(database.Hex15()) ? (database.Hex15().getColor() + "         " + RESET + "\\") : "         \\"); //hex(1,5)
        System.out.println();

        //line13
        System.out.print(player.isHexVisible(database.Hex20()) ? ("  /" + database.Hex20().getColor() + "     " + RESET + "\\") : "  /     \\"); //hex(2,0)
        System.out.print(player.isHexVisible(database.Hex11()) ? (database.Hex11().getColor() + "         " + RESET + "/") : "         /"); //hex(1,1)
        System.out.print(player.isHexVisible(database.Hex22()) ? (database.Hex22().getColor() + "     " + RESET + "\\") : "     \\"); //hex(2,2)
        System.out.print(player.isHexVisible(database.Hex13()) ? (database.Hex13().getColor() + "         " + RESET + "/") : "         /"); //hex(1,3)
        System.out.print(player.isHexVisible(database.Hex24()) ? (database.Hex24().getColor() + "     " + RESET + "\\") : "     \\"); //hex(2,4)
        System.out.print(player.isHexVisible(database.Hex15()) ? (database.Hex15().getColor() + "         " + RESET + "/") : "         /"); //hex(1,5)
        System.out.println();

        //line14
        System.out.print(player.isHexVisible(database.Hex20()) ? (" /" + database.Hex20().getColor() + " (2,0) " + RESET + "\\") : " / (2,0) \\"); //hex(2,0)
        System.out.print(player.isHexVisible(database.Hex11()) ? (database.Hex11().getColor() + "       " + RESET + "/") : "       /"); //hex(1,1)
        System.out.print(player.isHexVisible(database.Hex22()) ? (database.Hex22().getColor() + " (2,2) " + RESET + "\\") : " (2,2) \\"); //hex(2,2)
        System.out.print(player.isHexVisible(database.Hex13()) ? (database.Hex13().getColor() + "       " + RESET + "/") : "       /"); //hex(1,3)
        System.out.print(player.isHexVisible(database.Hex24()) ? (database.Hex24().getColor() + " (2,4) " + RESET + "\\") : " (2,4) \\"); //hex(2,4)
        System.out.print(player.isHexVisible(database.Hex15()) ? (database.Hex15().getColor() + "       " + RESET + "/") : "       /"); //hex(1,5)
        System.out.println();

        //line15
        System.out.print(player.isHexVisible(database.Hex20()) ? ("/" + database.Hex20().getColor() + "         " + RESET + "\\") : "/         \\"); //hex(2,0)
        System.out.print(player.isHexVisible(database.Hex11()) ? (database.Hex11().getColor() + "_____" + RESET + "/") : "_____/"); //hex(1,1)
        System.out.print(player.isHexVisible(database.Hex22()) ? (database.Hex22().getColor() + "         " + RESET + "\\") : "         \\"); //hex(2,2)
        System.out.print(player.isHexVisible(database.Hex13()) ? (database.Hex13().getColor() + "_____" + RESET + "/") : "_____/"); //hex(1,3)
        System.out.print(player.isHexVisible(database.Hex24()) ? (database.Hex24().getColor() + "         " + RESET + "\\") : "         \\"); //hex(2,4)
        System.out.print(player.isHexVisible(database.Hex15()) ? (database.Hex15().getColor() + "_____" + RESET + "/") : "_____/"); //hex(1,5)
        System.out.println();

        //line16
        System.out.print(player.isHexVisible(database.Hex20()) ? ("\\" + database.Hex20().getColor() + "         " + RESET + "/") : "\\         /"); //hex(2,0)
        System.out.print(player.isHexVisible(database.Hex21()) ? (database.Hex21().getColor() + "     " + RESET + "\\") : "     \\"); //hex(2,1)
        System.out.print(player.isHexVisible(database.Hex22()) ? (database.Hex22().getColor() + "         " + RESET + "/") : "         /"); //hex(2,2)
        System.out.print(player.isHexVisible(database.Hex23()) ? (database.Hex23().getColor() + "     " + RESET + BLUE + "\\" + RESET) : "     \\"); //hex(2,3)
        System.out.print(player.isHexVisible(database.Hex24()) ? (database.Hex24().getColor() + "         " + RESET + "/") : "         /"); //hex(2,4)
        System.out.print(player.isHexVisible(database.Hex25()) ? (database.Hex25().getColor() + "     " + RESET + "\\") : "     \\"); //hex(2,5)
        System.out.println();

        //line17
        System.out.print(player.isHexVisible(database.Hex20()) ? (" \\" + database.Hex20().getColor() + "       " + RESET + "/") : " \\       /"); //hex(2,0)
        System.out.print(player.isHexVisible(database.Hex21()) ? (database.Hex21().getColor() + " (2,1) " + RESET + "\\") : " (2,1) \\"); //hex(2,1)
        System.out.print(player.isHexVisible(database.Hex22()) ? (database.Hex22().getColor() + "       " + RESET + "/") : "       /"); //hex(2,2)
        System.out.print(player.isHexVisible(database.Hex23()) ? (database.Hex23().getColor() + " (2,3) " + RESET + BLUE + "\\" + RESET) : " (2,3) \\"); //hex(2,3)
        System.out.print(player.isHexVisible(database.Hex24()) ? (database.Hex24().getColor() + "       " + RESET + "/") : "       /"); //hex(2,4)
        System.out.print(player.isHexVisible(database.Hex25()) ? (database.Hex25().getColor() + " (2,5) " + RESET + "\\") : " (2,5) \\"); //hex(2,5)
        System.out.println();

        //line18
        System.out.print(player.isHexVisible(database.Hex20()) ? ("  \\" + database.Hex20().getColor() + "_____" + RESET + "/") : "  \\_____/"); //hex(2,0)
        System.out.print(player.isHexVisible(database.Hex21()) ? (database.Hex21().getColor() + "         " + RESET + "\\") : "         \\"); //hex(2,1)
        System.out.print(player.isHexVisible(database.Hex22()) ? (database.Hex22().getColor() + "_____" + RESET + "/") : "_____/"); //hex(2,2)
        System.out.print(player.isHexVisible(database.Hex23()) ? (database.Hex23().getColor() + "         " + RESET + BLUE + "\\" + RESET) : "         \\"); //hex(2,3)
        System.out.print(player.isHexVisible(database.Hex24()) ? (database.Hex24().getColor() + "_____" + RESET + "/") : "_____/"); //hex(2,4)
        System.out.print(player.isHexVisible(database.Hex25()) ? (database.Hex25().getColor() + "         " + RESET + "\\") : "         \\"); //hex(2,5)
        System.out.println();

        //line19
        System.out.print(player.isHexVisible(database.Hex21()) ? ("        " + "\\" + database.Hex21().getColor() + "         " + RESET + "/" + "     ") : "        \\         /     "); //hex(2,1)
        System.out.print(player.isHexVisible(database.Hex23()) ? ("\\" + database.Hex23().getColor() + "         " + RESET + "/" + "     ") : "\\         /     "); //hex(2,3)
        System.out.print(player.isHexVisible(database.Hex25()) ? ("\\" + database.Hex25().getColor() + "         " + RESET + BLUE + "/" + RESET) : "\\         /"); //hex(2,5)
        System.out.println();

        //line20
        System.out.print(player.isHexVisible(database.Hex21()) ? ("         " + "\\" + database.Hex21().getColor() + "       " + RESET + "/" + "       ") : "         \\       /       "); //hex(2,1)
        System.out.print(player.isHexVisible(database.Hex23()) ? ("\\" + database.Hex23().getColor() + "       " + RESET + "/" + "       ") : "\\       /       "); //hex(2,3)
        System.out.print(player.isHexVisible(database.Hex25()) ? ("\\" + database.Hex25().getColor() + "       " + RESET + BLUE + "/" + RESET) : "\\       /"); //hex(2,5)
        System.out.println();

        //line21
        System.out.print(player.isHexVisible(database.Hex21()) ? ("          " + "\\" + database.Hex21().getColor() + "_____" + RESET + "/" + "         ") : "          \\_____/         "); //hex(2,1)
        System.out.print(player.isHexVisible(database.Hex23()) ? ("\\" + database.Hex23().getColor() + "_____" + RESET + "/" + "         ") : "\\_____/         "); //hex(2,3)
        System.out.print(player.isHexVisible(database.Hex25()) ? ("\\" + database.Hex25().getColor() + "_____" + RESET + BLUE + "/" + RESET) : "\\_____/"); //hex(2,5)
        System.out.println();

    }
}