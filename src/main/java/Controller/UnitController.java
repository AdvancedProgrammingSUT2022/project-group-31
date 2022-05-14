package Controller;

import model.City;
import model.Hex;
import model.Player;
import model.Unit;

public class UnitController {


    public void move(Unit unit, Hex destination, Hex origin) {
        return;
    }

    public boolean isMovePossible(Unit unit, Hex destination, Hex origin) {
        return false;
    }



    //////////////////////////////////////
    public String meleeAttack(Unit attacker, Unit defender, Hex attackerPosition, Hex defenderPosition, Player attackerPlayer, Player defenderPlayer){
        if(attacker.getMP()!=0){
            if(isAttackPossibleForMelee(attackerPosition,defenderPosition)){
                defender.setHP(defender.getHP()-(attacker.getUnitType().getCombatStrength() + attacker.getUnitType().getCombatStrength()*attackerPosition.getBattleEfficiency()));
                attacker.setHP(attacker.getHP()-(defender.getUnitType().getCombatStrength() + defender.getUnitType().getCombatStrength()*defenderPosition.getBattleEfficiency()));

                if(attacker.getHP()<0.99){
                    attacker.removeUnit(attacker,attackerPlayer);
                }
                if (defender.getHP()<0.99){
                    defender.removeUnit(defender,defenderPlayer);
                    attacker.setPositionByHex(defenderPosition);
                }
                attacker.setMP(0);
                return "meleeAttack was successful";
            }

        }

        return "unit doesn't have enough MP";

    }

    public boolean isAttackPossibleForMelee(Hex attackerPosition, Hex defenderPosition) {
        int xAttacker = attackerPosition.getX();
        int yAttacker = attackerPosition.getY();
        int xDefender = defenderPosition.getX();
        int yDefender = defenderPosition.getY();

        if (yAttacker % 2 == 0) {
            if (yAttacker == yDefender && (xAttacker - xDefender == 1 || xDefender - xAttacker == 1)) {
                return true;
            } else if (xAttacker == xDefender && (yAttacker - yDefender == 1 || yDefender - yAttacker == 1)) {
                return true;
            } else if (xAttacker - xDefender == 1 && (yAttacker - yDefender == 1 || yDefender - yAttacker == 1)) {
                return true;
            } else
                return false;
        } else {

            if (yAttacker == yDefender && (xAttacker - xDefender == 1 || xDefender - xAttacker == 1)) {
                return true;
            } else if (xAttacker == xDefender && (yAttacker - yDefender == 1 || yDefender - yAttacker == 1)) {
                return true;
            } else if (xDefender - xAttacker == 1 && (yAttacker - yDefender == 1 || yDefender - yAttacker == 1)) {
                return true;
            }
        }
        return false;
    }
//////////////////////////////////////



    ///////////////////////////////////
    public String rangedAttack(Unit attacker, Unit defender, Hex attackerPosition, Hex defenderPosition, Player attackerPlayer, Player defenderPlayer){

        if (attacker.getMP()!=0){
            if (isAttackPossibleForRanged(attackerPosition,defenderPosition)){
                defender.setHP(defender.getHP()-(attacker.getUnitType().getRangedCombatStrength() + attacker.getUnitType().getRangedCombatStrength()*attackerPosition.getBattleEfficiency()));
                if (defender.getHP()<0.99){
                    defender.removeUnit(defender,defenderPlayer);
                }
                attacker.setMP(0);
            }
            return "rangedAttack was successful";
        }
        return "unit doesn't have enough MP";
    }

    public boolean isAttackPossibleForRanged(Hex attackerPosition, Hex defenderPosition){
        int xAttacker = attackerPosition.getX();
        int yAttacker = attackerPosition.getY();
        int xDefender = defenderPosition.getX();
        int yDefender = defenderPosition.getY();

        if (((xAttacker-xDefender<=2 && xAttacker-xDefender>=0) || (xDefender-xAttacker<=2 && xDefender-xAttacker>=0)) && ((yAttacker-yDefender<=2 && yAttacker-yDefender>=0) || (yDefender-yAttacker<=2 && yDefender-yAttacker>=0)) ){
            return true;
        }

        return false;
    }
    ///////////////////////////////////



    public void sleep (Unit unit){

    }
     public void alert (Unit unit){

     }
     public void garrison (Unit unit){

     }
     public void fortify (Unit unit){

     }
     public  void pillage (Unit unit){

     }
     public void foundCity (Unit unit){

     }
     public void delete (Unit unit){

     }





}

