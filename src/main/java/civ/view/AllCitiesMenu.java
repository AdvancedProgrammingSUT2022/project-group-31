package civ.view;

import civ.model.City;
import civ.model.Player;

public class AllCitiesMenu {
    public void run(Player player) {
        System.out.println("All Cities Menu \n");
        int i = 1;
        for (City city : player.getCities()) {
            System.out.println("City " + i++ + ": " + city);
        }
        i--;
    }
}
