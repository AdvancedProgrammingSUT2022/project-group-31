package civ.view;

import civ.model.MilitaryUnitt;

public class SelectUnitMenu {

    public void run(MilitaryUnitt unit) {

        System.out.println("Select Unit Menu\n");
        System.out.println("Position: (" + unit.getPosition().getX() + "," + unit.getPosition().getY() + ")");
        System.out.println("Type: " + unit.getName());
        System.out.println("Combat type: " + unit.getCombatType());
        System.out.println("HP: " + unit.getHP());
        System.out.println("MP: " + unit.getMP());
        System.out.println("Combat strength: " + unit.getCombatStrength());
        System.out.println("State: " + unit.getUnitState());
        System.out.println("owner: " + unit.getOwner().getName());
        System.out.println();


    }
}
