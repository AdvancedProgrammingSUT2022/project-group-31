package Controller;

import Enums.Types.Technology;
import model.Database;
import model.Player;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTechnology {
    public void run() {

        //TODO  add trophy cost check
        //TODO  add turns
        Database database = Database.getInstance();
        ArrayList<Technology> allTechnologies = database.getAllTechnologies();
        User user = new User("amoo", "lalala", "bababa");
        Player player = new Player("amin", user);

        Scanner scanner = new Scanner(System.in);
        String input = "YO";
        //    user.addTechnology(Technology.MINING);
        ArrayList<Technology> achievedTechnologies = player.getAchievedTechnologies();
        ArrayList<Technology> availableTechnologies = new ArrayList<>();

        boolean canBeShown = true;
        while (!input.equals("end")) {
            availableTechnologies.clear();
            //show available technology;
            for (Technology allTechnology : allTechnologies) {

                if (achievedTechnologies.contains(allTechnology)) continue;

                Technology[] neededTechnologies = allTechnology.getNeededTechnology();
                for (Technology neededTechnology : neededTechnologies) {
                    if (!achievedTechnologies.contains(neededTechnology)) {
                        canBeShown = false;
                        break;
                    }
                }
                if (canBeShown) availableTechnologies.add(allTechnology);
                canBeShown = true;
            }
            System.out.println("available techs:");
            System.out.println("Tech      Price");
            for (Technology availableTechnology : availableTechnologies) {
                System.out.println(availableTechnology.getName() + "\t" + availableTechnology.getTrophyCost());
            }
            input = scanner.nextLine();

            for (Technology availableTechnology : availableTechnologies) {
                if (input.equalsIgnoreCase(availableTechnology.getName())) {
                    achievedTechnologies.add(availableTechnology);
                    System.out.println("tech added!");
                }
            }

            System.out.println("\n\n\nachieved techs: ");

            for (Technology achievedTechnology : achievedTechnologies) {
                System.out.println(achievedTechnology);
            }

        }
    }
}
