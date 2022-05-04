package view;

import Enums.Colors;
import model.Database;

public class PrintMap {
    public static void run() {
        Colors C = Colors.getInstance();
        Database database = Database.getInstance();

        //     String name =  C.BG_BLUE;
        String GREEN = "\033[42m";
        String RESET = "\033[0m";
        String YELLOW = "\033[43m";
        String RED = "\033[41m";
        String BLUE = "\033[44m";
        int n = 0;

        //line 1
        System.out.print("  /" + database.Hex00().getColor() + "     " + RESET + "\\" + "       "); //hex(0,0)
        System.out.print("  /" + database.Hex02().getColor() + "     " + RESET + "\\" + "       "); //hex(0,2)
        System.out.print("  /" + database.Hex04().getColor() + "     " + RESET + "\\" + "       "); //hex(0,4)
        System.out.println();

        //line 2
        System.out.print(" /" + database.Hex00().getColor() + " (0,0) " + RESET + "\\" + "      "); //hex(0,0)
        System.out.print(" /" + database.Hex02().getColor() + " (0,2) " + RESET + "\\" + "      "); //hex(0,2)
        System.out.print(" /" + database.Hex04().getColor() + " (0,4) " + RESET + "\\" + "      "); //hex(0,4)
        System.out.println();

        //line3
        System.out.print("/" + database.Hex00().getColor() + "         " + RESET + "\\" + "_____"); //hex(0,0)
        System.out.print("/" + database.Hex02().getColor() + "         " + RESET + "\\" + "_____"); //hex(0,2)
        System.out.print("/" + database.Hex04().getColor() + "         " + RESET + "\\" + "_____"); //hex(0,4)
        System.out.println();

        //line4
        System.out.print("\\" + database.Hex00().getColor() + "         " + RESET + BLUE + "/" + RESET); //hex(0,0)
        System.out.print(database.Hex01().getColor() + "     " + RESET + "\\"); //hex(0,1)
        System.out.print(database.Hex02().getColor() + "         " + RESET + "/"); //hex(0,2)
        System.out.print(database.Hex03().getColor() + "     " + RESET + "\\"); //hex(0,3)
        System.out.print(database.Hex04().getColor() + "         " + RESET + "/"); //hex(0,4)
        System.out.print(database.Hex05().getColor() + "     " + RESET + BLUE + "\\" + RESET); //hex(0,5)
        System.out.println();

        //line5
        System.out.print(" \\" + database.Hex00().getColor() + "       " + RESET + BLUE + "/" + RESET); //hex(0,0)
        System.out.print(database.Hex01().getColor() + " (0,1) " + RESET + "\\"); //hex(0,1)
        System.out.print(database.Hex02().getColor() + "       " + RESET + "/"); //hex(0,2)
        System.out.print(database.Hex03().getColor() + " (0,3) " + RESET + "\\"); //hex(0,3)
        System.out.print(database.Hex04().getColor() + "       " + RESET + "/"); //hex(0,4)
        System.out.print(database.Hex05().getColor() + " (0,5) " + RESET + BLUE + "\\" + RESET); //hex(0,5)
        System.out.println();

        //line6
        System.out.print("  \\" + database.Hex00().getColor() + "_____" + RESET + BLUE + "/" + RESET); //hex(0,0)
        System.out.print(database.Hex01().getColor() + "         " + RESET + "\\"); //hex(0,1)
        System.out.print(database.Hex02().getColor() + "_____" + RESET + "/"); //hex(0,2)
        System.out.print(database.Hex03().getColor() + "         " + RESET + "\\"); //hex(0,3)
        System.out.print(database.Hex04().getColor() + "_____" + RESET + "/"); //hex(0,4)
        System.out.print(database.Hex05().getColor() + "         " + RESET + BLUE + "\\" + RESET); //hex(0,5)
        System.out.println();

        //line7
        System.out.print("  /" + database.Hex10().getColor() + "     " + RESET + "\\"); //hex(1,0)
        System.out.print(database.Hex01().getColor() + "         " + RESET + BLUE + "/" + RESET); //hex(0,1)
        System.out.print(database.Hex12().getColor() + "     " + RESET + "\\"); //hex(1,2)
        System.out.print(database.Hex03().getColor() + "         " + RESET + "/"); //hex(0,3)
        System.out.print(database.Hex14().getColor() + "     " + RESET + "\\"); //hex(1,4)
        System.out.print(database.Hex05().getColor() + "         " + RESET + "/"); //hex(0,5)
        System.out.println();

        //line8
        System.out.print(" /" + database.Hex10().getColor() + " (1,0) " + RESET + "\\"); //hex(1,0)
        System.out.print(database.Hex01().getColor() + "       " + RESET + BLUE + "/" + RESET); //hex(0,1)
        System.out.print(database.Hex12().getColor() + " (1,2) " + RESET + "\\"); //hex(1,2)
        System.out.print(database.Hex03().getColor() + "       " + RESET + "/"); //hex(0,3)
        System.out.print(database.Hex14().getColor() + " (1,4) " + RESET + "\\"); //hex(1,4)
        System.out.print(database.Hex05().getColor() + "       " + RESET + "/"); //hex(0,5)
        System.out.println();

        //line9
        System.out.print("/" + database.Hex10().getColor() + "         " + RESET + "\\"); //hex(1,0)
        System.out.print(database.Hex01().getColor() + "_____" + RESET + BLUE + "/" + RESET); //hex(0,1)
        System.out.print(database.Hex12().getColor() + "         " + RESET + "\\"); //hex(1,2)
        System.out.print(database.Hex03().getColor() + "_____" + RESET + "/"); //hex(0,3)
        System.out.print(database.Hex14().getColor() + "         " + RESET + "\\"); //hex(1,4)
        System.out.print(database.Hex05().getColor() + "_____" + RESET + "/"); //hex(0,5)
        System.out.println();

        //line10
        System.out.print("\\" + database.Hex10().getColor() + "         " + RESET + "/"); //hex(1,0)
        System.out.print(database.Hex11().getColor() + "     " + RESET + "\\"); //hex(1,1)
        System.out.print(database.Hex12().getColor() + "         " + RESET + "/"); //hex(1,2)
        System.out.print(database.Hex13().getColor() + "     " + RESET + BLUE + "\\" + RESET); //hex(1,3)
        System.out.print(database.Hex14().getColor() + "         " + RESET + "/"); //hex(1,4)
        System.out.print(database.Hex15().getColor() + "     " + RESET + "\\"); //hex(1,5)
        System.out.println();

        //line11
        System.out.print(" \\" + database.Hex10().getColor() + "       " + RESET + "/"); //hex(1,0)
        System.out.print(database.Hex11().getColor() + " (1,1) " + RESET + "\\"); //hex(1,1)
        System.out.print(database.Hex12().getColor() + "       " + RESET + "/"); //hex(1,2)
        System.out.print(database.Hex13().getColor() + " (1,3) " + RESET +  BLUE+"\\"+RESET); //hex(1,3)
        System.out.print(database.Hex14().getColor() + "       " + RESET + "/"); //hex(1,4)
        System.out.print(database.Hex15().getColor() + " (1,5) " + RESET + "\\"); //hex(1,5)
        System.out.println();

        //line12
        System.out.print("  \\" + database.Hex10().getColor() + "_____" + RESET + "/"); //hex(1,0)
        System.out.print(database.Hex11().getColor() + "         " + RESET + "\\"); //hex(1,1)
        System.out.print(database.Hex12().getColor() + "_____" + RESET + "/"); //hex(1,2)
        System.out.print(database.Hex13().getColor() + "         " + RESET +  BLUE+"\\"+RESET); //hex(1,3)
        System.out.print(database.Hex14().getColor() + "_____" + RESET + "/"); //hex(1,4)
        System.out.print(database.Hex15().getColor() + "         " + RESET + "\\"); //hex(1,5)
        System.out.println();

        //line13
        System.out.print("  /" + database.Hex20().getColor() + "     " + RESET + "\\"); //hex(2,0)
        System.out.print(database.Hex11().getColor() + "         " + RESET + "/"); //hex(1,1)
        System.out.print(database.Hex22().getColor() + "     " + RESET + "\\"); //hex(2,2)
        System.out.print(database.Hex13().getColor() + "         " + RESET + "/"); //hex(1,3)
        System.out.print(database.Hex24().getColor() + "     " + RESET + "\\"); //hex(2,4)
        System.out.print(database.Hex15().getColor() + "         " + RESET + "/"); //hex(1,5)
        System.out.println();

        //line14
        System.out.print(" /" + database.Hex20().getColor() + " (2,0) " + RESET + "\\"); //hex(2,0)
        System.out.print(database.Hex11().getColor() + "       " + RESET + "/"); //hex(1,1)
        System.out.print(database.Hex22().getColor() + " (2,2) " + RESET + "\\"); //hex(2,2)
        System.out.print(database.Hex13().getColor() + "       " + RESET + "/"); //hex(1,3)
        System.out.print(database.Hex24().getColor() + " (2,4) " + RESET + "\\"); //hex(2,4)
        System.out.print(database.Hex15().getColor() + "       " + RESET + "/"); //hex(1,5)
        System.out.println();

        //line15
        System.out.print("/" + database.Hex20().getColor() + "         " + RESET + "\\"); //hex(2,0)
        System.out.print(database.Hex11().getColor() + "_____" + RESET + "/"); //hex(1,1)
        System.out.print(database.Hex22().getColor() + "         " + RESET + "\\"); //hex(2,2)
        System.out.print(database.Hex13().getColor() + "_____" + RESET + "/"); //hex(1,3)
        System.out.print(database.Hex24().getColor() + "         " + RESET + "\\"); //hex(2,4)
        System.out.print(database.Hex15().getColor() + "_____" + RESET + "/"); //hex(1,5)
        System.out.println();

        //line16
        System.out.print("\\" + database.Hex20().getColor() + "         " + RESET + "/"); //hex(2,0)
        System.out.print(database.Hex21().getColor() + "     " + RESET + "\\"); //hex(2,1)
        System.out.print(database.Hex22().getColor() + "         " + RESET + "/"); //hex(2,2)
        System.out.print(database.Hex23().getColor() + "     " + RESET + BLUE + "\\" + RESET); //hex(2,3)
        System.out.print(database.Hex24().getColor() + "         " + RESET + "/"); //hex(2,4)
        System.out.print(database.Hex25().getColor() + "     " + RESET + "\\"); //hex(2,5)
        System.out.println();

        //line17
        System.out.print(" \\" + database.Hex20().getColor() + "       " + RESET + "/"); //hex(2,0)
        System.out.print(database.Hex21().getColor() + " (2,1) " + RESET + "\\"); //hex(2,1)
        System.out.print(database.Hex22().getColor() + "       " + RESET + "/"); //hex(2,2)
        System.out.print(database.Hex23().getColor() + " (2,3) " + RESET + BLUE + "\\" + RESET); //hex(2,3)
        System.out.print(database.Hex24().getColor() + "       " + RESET + "/"); //hex(2,4)
        System.out.print(database.Hex25().getColor() + " (2,5) " + RESET + "\\"); //hex(2,5)
        System.out.println();

        //line18
        System.out.print("  \\" + database.Hex20().getColor() + "_____" + RESET + "/"); //hex(2,0)
        System.out.print(database.Hex21().getColor() + "         " + RESET + "\\"); //hex(2,1)
        System.out.print(database.Hex22().getColor() + "_____" + RESET + "/"); //hex(2,2)
        System.out.print(database.Hex23().getColor() + "         " + RESET + BLUE + "\\" + RESET); //hex(2,3)
        System.out.print(database.Hex24().getColor() + "_____" + RESET + "/"); //hex(2,4)
        System.out.print(database.Hex25().getColor() + "         " + RESET + "\\"); //hex(2,5)
        System.out.println();

        //line19
        System.out.print("        " + "\\" + database.Hex21().getColor() + "         " + RESET + "/" + "     "); //hex(2,1)
        System.out.print("\\" + database.Hex23().getColor() + "         " + RESET + "/" + "     "); //hex(2,3)
        System.out.print("\\" + database.Hex25().getColor() + "         " + RESET + BLUE + "/" + RESET); //hex(2,5)
        System.out.println();

        //line20
        System.out.print("         " + "\\" + database.Hex21().getColor() + "       " + RESET + "/" + "       "); //hex(2,1)
        System.out.print("\\" + database.Hex23().getColor() + "       " + RESET + "/" + "       "); //hex(2,3)
        System.out.print("\\" + database.Hex25().getColor() + "       " + RESET + BLUE + "/" + RESET); //hex(2,5)
        System.out.println();

        //line21
        System.out.print("          " + "\\" + database.Hex21().getColor() + "_____" + RESET + "/" + "         "); //hex(2,1)
        System.out.print("\\" + database.Hex23().getColor() + "_____" + RESET + "/" + "         "); //hex(2,3)
        System.out.print("\\" + database.Hex25().getColor() + "_____" + RESET + BLUE + "/" + RESET); //hex(2,5)
        System.out.println();

    }
}