import Enums.Types.UnitsFeatures;
import model.*;
import view.*;

public class Main {
    public static void main(String[] args) {

        PrintMap printMap = new PrintMap();
        PrintSingleHex printSingleHex = new PrintSingleHex();
        AllUnitsMenu unitsMenu = new AllUnitsMenu();
        SelectUnitMenu selectUnitMenu = new SelectUnitMenu();
        Database database = Database.getInstance();
        AllCitiesMenu allCitiesMenu = new AllCitiesMenu();

        Player player = new Player("amin", null);
        player.addCity(new City(database.Hex15(), true, true, 10, 17, 19, 11, 10));
        player.addCity(new City(database.Hex00(), false, false, 20, 10, 13, 10, 12));
        player.addVisibleHex(database.Hex00());
        player.addVisibleHex(database.Hex04());
        player.addVisibleHex(database.Hex23());
        player.addVisibleHex(database.Hex11());
        player.addVisibleHex(database.Hex15());

        database.Hex00().setRiverOnNorthWest(true);
        database.Hex00().setRiverOnSouthEast(true);
        database.Hex00().setRiverOnSouth(true);
     //   database.Hex00().setRiverOnNorth(true);
        // allCitiesMenu.run(player);
        //   selectUnitMenu.run(new Unit(UnitsFeatures.ARCHER, database.Hex02(), player));
        // unitsMenu.run();
        //        printMap.run(player);

        //  System.out.println("\n\n\n\n\n\n");
        printSingleHex.run(database.Hex00(), player);
        //  iAddTechnology addTechnology =  new AddTechnology();
        //   addTechnology.run();
        //LoginMenu.run();
    }

    boolean isFounded() {

        return false;
    }

}



