import dk.ilios.asciihexgrid.AsciiBoard;
import dk.ilios.asciihexgrid.printers.LargePointyAsciiHexPrinter;
import model.Hex;
import view.PrintMap;
import view.PrintSingleHex;

public class Main {
    public static void main(String[] args) {

        PrintMap printMap = new PrintMap();

        PrintSingleHex printSingleHex  =new PrintSingleHex();
       // printSingleHex.run();
        printMap.run();
        //LoginMenu.run();
    }
}
