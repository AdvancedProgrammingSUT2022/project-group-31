import Controller.AddTechnology;
import Enums.Types.Technology;
import model.Database;
import model.User;
import view.PrintMap;
import view.PrintSingleHex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintMap printMap = new PrintMap();
        PrintSingleHex printSingleHex = new PrintSingleHex();
        printMap.run();
        System.out.println("\n\n\n\n\n\n");
        //printSingleHex.run();
        AddTechnology addTechnology =  new AddTechnology();
     //   addTechnology.run();
//
        //LoginMenu.run();
    }

    boolean isFounded() {

        return false;
    }

}



