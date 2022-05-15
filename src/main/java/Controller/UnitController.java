package Controller;

import Enums.Types.CombatType;
import Enums.Types.HexTypes;
import model.City;
import model.Hex;
import model.Player;
import model.Unit;

public class UnitController {




    ///////////////////////////////
    //TODO hesab kardan river and road
    public String move(Unit unit, Hex destination) {

        Hex origin=unit.getPositionByHex();

       if (isMovePossible(unit,destination)){

           unit.setPositionByHex(destination);
           return "move is done";
       }

            return "move is     not possible";
    }

    public boolean isMovePossible(Unit unit, Hex destination) {
       double xOrigin=unit.getPositionByHex().getX()-Math.floor(unit.getPositionByHex().getY()/2);
       double yOrigin=unit.getPositionByHex().getY();
       double xDestination=destination.getX()-Math.floor(destination.getY()/2);
       double yDestination=destination.getY();
       double xDistance=xDestination-xOrigin;
       double yDistance=yDestination-yOrigin;
       double distance=Math.max(Math.abs(xDistance),Math.abs(yDistance));
       if (Math.abs(xDistance+yDistance)>distance){
           distance=Math.abs(xDistance+yDistance);
       }


        if (unit.getMP()!=0){
            if (unit.getUnitType().getCombatType()==CombatType.CIVILIAN){
                if (destination.getUnMilitaryUnit()==null){
                    if (destination.getHexTypes()==HexTypes.OCEAN || destination.getHexTypes()==HexTypes.MOUNTAIN){
                        unit.setMP(0);
                    }
                    if (destination.getHexTypes()==HexTypes.HILL){
                        unit.setMP(unit.getMP()-1);
                    }
                    if (distance > unit.getMP()){
                        return false;
                    }else {
                        unit.setMP((int) (unit.getMP()-distance));
                        return true;
                    }

                }
                    return false;
            }else{
                if (destination.getMilitaryUnit()==null) {
                    if (distance > unit.getMP()) {
                        return false;
                    } else {
                        unit.setMP((int) (unit.getMP() - distance));
                        return true;
                    }
                }
                    return false;
            }


        }
        return false;
    }
//////////////////////////////


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



    public String sleep (Unit unit){
        unit.setSleep(true);
        return "unit is sleeping";
    }
     public String alert (Unit unit){

        Hex hex=unit.getPositionByHex();
        int x=unit.getPositionByHex().getX();
        int y=unit.getPositionByHex().getY();

        if (y%2==0){
            if (hex.getHexByPosition(x-1,y).getMilitaryUnit()==null || hex.getHexByPosition(x+1,y).getMilitaryUnit()==null){
                unit.setSleep(true);
                return "unit is on alert";
            } else if (hex.getHexByPosition(x-1,y-1).getMilitaryUnit()==null || hex.getHexByPosition(x-1,y+1).getMilitaryUnit()==null){
               unit.setSleep(true);
                return "unit is on alert";
            } else if (hex.getHexByPosition(x,y-1).getMilitaryUnit()==null || hex.getHexByPosition(x,y+1).getMilitaryUnit()==null){
                unit.setSleep(true);
                return "unit is on alert";
            }else{
                unit.setSleep(false);
                return "unit isn't on alert";
            }

        }else{

            if (hex.getHexByPosition(x-1,y).getMilitaryUnit()==null || hex.getHexByPosition(x+1,y).getMilitaryUnit()==null){
                unit.setSleep(true);
                return "unit is on alert";
            }else if (hex.getHexByPosition(x,y-1).getMilitaryUnit()==null || hex.getHexByPosition(x,y+1).getMilitaryUnit()==null){
                unit.setSleep(true);
                return "unit is on alert";
            }else if (hex.getHexByPosition(x+1,y-1).getMilitaryUnit()==null || hex.getHexByPosition(x-1,y+1).getMilitaryUnit()==null){
                unit.setSleep(true);
                return "unit is on alert";
            }else{
                unit.setSleep(false);
                return "unit isn't on alert";
            }
        }
     }

     public String garrison (Unit unit){
        Hex hex=unit.getPositionByHex();
        if (hex.getCity()!=null){
            unit.setCombatStrength(unit.getCombatStrength()+1);
            return "CombatStrength increased";
        }
        return "unit's Hex doesn't have City";
     }

     public void fortify (Unit unit){
    //TODO defensive bonus
     }

     public  void pillage (Unit unit){
  //TODO bayad aval improvment kamel shavad baray zadan in bakhshash
     }

     public String foundCity (Unit unit, City city){
        //TODO chejori moshakahs konim in unit worker ast. nomone avaliye:

         if (unit.getUnitType().getCombatType()==CombatType.CIVILIAN){
             unit.buildCity(unit,city);
             return "City created";
         }
         return "foundCity was not successful";
     }

     public void delete (Unit unit){
      Player player=unit.getOwner();
      unit.removeUnit(unit,player);
    }





}

