package view;

import Enums.Types.UnitsFeatures;
import model.Database;
import model.Player;
import model.MilitaryUnitt;


public class AllUnitsMenu {

    public void run() {
        Player player = new Player("name ", null);
        Database database = Database.getInstance();
        player.addUnit(new MilitaryUnitt(UnitsFeatures.ARCHER, database.Hex00(), player));
        player.addUnit(new MilitaryUnitt(UnitsFeatures.ANTI_TANKGUN, database.Hex00(), player));
        player.addUnit(new MilitaryUnitt(UnitsFeatures.CROSSBOWMAN, database.Hex00(), player));

        //  player.addUnit(new Unit(UnitsFeatures.CANON,database.Hex01(),player));
        //player.addUnit(new Unit(UnitsFeatures.HORSEMAN,database.Hex02(),player));
        int i = 1;
        for (MilitaryUnitt unit : player.getAllUnits()) {

            System.out.println(i++ + ": " + unit);
        }
        i--;
        System.out.println(i);
        System.out.println(  player.getAllUnits().get(i-1));
    }
}
