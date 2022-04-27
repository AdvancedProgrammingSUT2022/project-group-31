import Enums.Message;
import dk.ilios.asciihexgrid.AsciiBoard;
import dk.ilios.asciihexgrid.printers.LargePointyAsciiHexPrinter;

import model.AsciiBoard;
import view.LoginMenu;

public class Main {
    public static void main(String[] args) {
        AsciiBoard board = new AsciiBoard(0, 3, 0, 2 , new LargePointyAsciiHexPrinter());
        board.printHex("1234567899","-B-", '#', 0, 0);
        board.printHex("HX2","-W-", '+', 1, 0);
        board.printHex("HX3","-W-", '-', 2, 0);
        board.printHex("HX4","-B-", '.', 3, 0);
        board.printHex("HX5","-B-", '#', 0, 1);
        board.printHex("HX6","-W-", '+', 1, 1);
        board.printHex("HX7","-W-", '-', 2, 1);
        board.printHex("HX8","-B-", '.', 3, 1);
        //  board.printHex();
        System.out.println(board.prettPrint(true));
        //LoginMenu.run();
    }
}
