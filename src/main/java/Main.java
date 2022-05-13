import Controller.AddTechnology;
import Enums.Types.HexTypes;
import model.Hex;
import view.PrintMap;
import view.PrintSingleHex;

public class Main {
    public static void main(String[] args) {
        PrintMap printMap = new PrintMap();
        PrintSingleHex printSingleHex = new PrintSingleHex();
       printMap.run();
      //  System.out.println("\n\n\n\n\n\n");
        //printSingleHex.run(new Hex(0, 0, HexTypes.HILL.getShortName(), HexTypes.HILL.getFood(), HexTypes.HILL.getProduction(), HexTypes.HILL.getGold(), HexTypes.HILL.getBattleEfficacy(), HexTypes.HILL.getMP(), HexTypes.HILL.getColor()));
        //AddTechnology addTechnology =  new AddTechnology();
     //   addTechnology.run();
//
        //LoginMenu.run();
    }

    boolean isFounded() {

        return false;
    }

}



