import Enums.Types.Technology;
import model.Database;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        PrintMap printMap = new PrintMap();
//        PrintSingleHex printSingleHex = new PrintSingleHex();
//        Technology tech1 = Technology.AGRICULTURE;
//        printMap.run();
//        System.out.println("\n\n\n\n\n\n");
//        printSingleHex.run();

//
        //LoginMenu.run();
        Database database = Database.getInstance();
        ArrayList<Technology> allTechnologies = database.getAllTechnologies();



        Scanner scanner = new Scanner(System.in);
        if(Technology.AGRICULTURE == Technology.AGRICULTURE)
            System.out.println("is mosavi");
        else System.out.println("na barabar");
        String string= scanner.nextLine();
        for (Technology allTechnology : allTechnologies) {
            System.out.println(allTechnology);


        }
        User user = new User("amin", "tay", "mamamd");
        user.addTechnology(Technology.AGRICULTURE);
        ArrayList<Technology> achievedTechnologies = user.getAchievedTechnologies();
        //show available technology;
        boolean state = false;
        for (Technology allTechnology : allTechnologies) {
            Technology[]  neededTechnologies =  allTechnology.getNeededTechnology();
            for (Technology neededTechnology : neededTechnologies) {


            }

        }
    }
}


//   ArrayList<TestTechnology> allTechnologies = new ArrayList<>();
//        allTechnologies.add(TestTechnology.AGRICULTURE);
//        allTechnologies.add(TestTechnology.ANIMAL_HUSBANDRY);
//        allTechnologies.add(TestTechnology.ARCHERY);
//        allTechnologies.add(TestTechnology.MINING);
//        allTechnologies.add(TestTechnology.POTTERY);
//
//        ArrayList<TestTechnology> achievedTechnologies = new ArrayList<>();
//        achievedTechnologies.add(TestTechnology.AGRICULTURE);
//        for (TestTechnology techs : allTechnologies) {
//            System.out.println(techs);
//        }
//        System.out.println("\n\n\n");
//        for (TestTechnology achievedTechnology : achievedTechnologies) {
//            System.out.println(achievedTechnology);
//        }
//        String input = " ";
//        Scanner scanner = new Scanner(System.in);
//        while (!(input.equals("end"))) {
//            input = scanner.nextLine();
//
//            for (TestTechnology tech : allTechnologies) {
//                if (input.equals(tech.getName())) {
//                    achievedTechnologies.add(tech);
//                    System.out.println("added");
//                }
//            }
//        }
//        for (TestTechnology achievedTechnology : achievedTechnologies) {
//            System.out.println(achievedTechnology);
//
//        }

