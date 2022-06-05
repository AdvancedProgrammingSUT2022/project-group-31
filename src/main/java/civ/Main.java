package civ;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;


public class Main extends Application {


    private static Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    boolean isFounded() {

        return false;
    }

    public static void changeMenu(String name) {
        Parent root = loadFXMNL(name);
        Main.scene.setRoot(root);

    }

    public static Parent loadFXMNL(String name) {
        try {
//
            URL address = new URL(Main.class.getResource("/" + name).toExternalForm());
            return FXMLLoader.load(address);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = loadFXMNL("LoginMenu.fxml");
        Scene scene = new Scene(root);
        Main.scene = this.scene;

        stage.setScene(scene);
        stage.show();

    }
}


//        PrintMap printMap = new PrintMap();
//        PrintSingleHex printSingleHex = new PrintSingleHex();
//        AllUnitsMenu unitsMenu = new AllUnitsMenu();
//        SelectUnitMenu selectUnitMenu = new SelectUnitMenu();
//        Database database = Database.getInstance();
//        AllCitiesMenu allCitiesMenu = new AllCitiesMenu();
//
//        Player player = new Player("amin", null);
//        player.addCity(new City(database.Hex15(), true, true, 10, 17, 19, 11, 10));
//        player.addCity(new City(database.Hex00(), false, false, 20, 10, 13, 10, 12));
//        player.addVisibleHex(database.Hex00());
//        player.addVisibleHex(database.Hex04());
//        player.addVisibleHex(database.Hex23());
//        player.addVisibleHex(database.Hex11());
//        player.addVisibleHex(database.Hex15());
//        //  player.addVisibleHex(database);
//
//
//        database.Hex00().setRiverOnNorthWest(true);
//        database.Hex00().setRiverOnSouthEast(true);
//        database.Hex00().setRiverOnSouth(true);
//        AddTechnology addTechnology = new AddTechnology();
//        addTechnology.run();
//   database.Hex00().setRiverOnNorth(true);
// allCitiesMenu.run(player);
//   selectUnitMenu.run(new Unit(UnitsFeatures.ARCHER, database.Hex02(), player));
// unitsMenu.run();
// printMap.run(player);

//  System.out.println("\n\n\n\n\n\n");
//  printSingleHex.run(database.Hex00(), player);
//  iAddTechnology addTechnology =  new AddTechnology();
//   addTechnology.run();
//LoginMenu.run();