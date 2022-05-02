package model;

public class Hex {

    public  static void printMap(){
        String GREEN = "\033[42m";
        String RESET = "\033[0m";
        String YELLOW = "\033[43m";
        String RED = "\033[41m";
        String BLUE = "\033[44m";


        //line 1
        System.out.print("  /" + GREEN + "     " + RESET + "\\" + "       "); //hex(0,0)
        System.out.print("  /" + GREEN + "     " + RESET + "\\" + "       "); //hex(0,2)
        System.out.print("  /" + GREEN + "     " + RESET + "\\" + "       "); //hex(0,4)
        System.out.println();

        //line 2
        System.out.print(" /" +GREEN+ "       " + RESET+"\\" + "      "); //hex(0,0)
        System.out.print(" /" +GREEN+ "       " + RESET+"\\" + "      "); //hex(0,2)
        System.out.print(" /" +GREEN+ "       " + RESET+"\\" + "      "); //hex(0,4)
        System.out.println();

        //line3
        System.out.print("/"+GREEN+"  (0,0)  "+RESET+"\\"+"_____"); //hex(0,0)
        System.out.print("/"+GREEN+"  (0,2)  "+RESET+"\\"+"_____"); //hex(0,2)
        System.out.print("/"+GREEN+"  (0,4)  "+RESET+"\\"+"_____"); //hex(0,4)
        System.out.println();

        //line4
        System.out.print("\\"+GREEN+"         "+RESET+"/"); //hex(0,0)
        System.out.print(YELLOW+"     "+RESET+"\\"); //hex(0,1)
        System.out.print(GREEN+"         "+RESET+"/"); //hex(0,2)
        System.out.print(YELLOW+"     "+RESET+"\\"); //hex(0,3)
        System.out.print(GREEN+"         "+RESET+"/"); //hex(0,4)
        System.out.print(YELLOW+"     "+RESET+"\\"); //hex(0,5)
        System.out.println();

        //line5
        System.out.print(" \\"+GREEN+"       "+RESET+"/"); //hex(0,0)
        System.out.print(YELLOW+"       "+RESET+"\\"); //hex(0,1)
        System.out.print(GREEN+"       "+RESET+"/"); //hex(0,2)
        System.out.print(YELLOW+"       "+RESET+"\\"); //hex(0,3)
        System.out.print(GREEN+"       "+RESET+"/"); //hex(0,4)
        System.out.print(YELLOW+"       "+RESET+"\\"); //hex(0,5)
        System.out.println();

        //line6
        System.out.print("  \\"+GREEN+"_____"+RESET+"/"); //hex(0,0)
        System.out.print(YELLOW+"  (0,1)  "+RESET+"\\"); //hex(0,1)
        System.out.print(GREEN+"_____"+RESET+"/"); //hex(0,2)
        System.out.print(YELLOW+"  (0,3)  "+RESET+"\\"); //hex(0,3)
        System.out.print(GREEN+"_____"+RESET+"/"); //hex(0,4)
        System.out.print(YELLOW+"  (0,5)  "+RESET+"\\"); //hex(0,5)
        System.out.println();

        //line7
        System.out.print("  /"+RED+"     "+RESET+"\\"); //hex(1,0)
        System.out.print(YELLOW+"         "+RESET+"/"); //hex(0,1)
        System.out.print(RED+"     "+RESET+"\\"); //hex(1,2)
        System.out.print(YELLOW+"         "+RESET+"/"); //hex(0,3)
        System.out.print(RED+"     "+RESET+"\\"); //hex(1,4)
        System.out.print(YELLOW+"         "+RESET+"/"); //hex(0,5)
        System.out.println();

        //line8
        System.out.print(" /"+RED+"       "+RESET+"\\"); //hex(1,0)
        System.out.print(YELLOW+"       "+RESET+"/"); //hex(0,1)
        System.out.print(RED+"       "+RESET+"\\"); //hex(1,2)
        System.out.print(YELLOW+"       "+RESET+"/"); //hex(0,3)
        System.out.print(RED+"       "+RESET+"\\"); //hex(1,4)
        System.out.print(YELLOW+"       "+RESET+"/"); //hex(0,5)
        System.out.println();

        //line9
        System.out.print("/"+RED+"  (1,0)  "+RESET+"\\"); //hex(1,0)
        System.out.print(YELLOW+"_____"+RESET+"/"); //hex(0,1)
        System.out.print(RED+"  (1,2)  "+RESET+"\\"); //hex(1,2)
        System.out.print(YELLOW+"_____"+RESET+"/"); //hex(0,3)
        System.out.print(RED+"  (1,4)  "+RESET+"\\"); //hex(1,4)
        System.out.print(YELLOW+"_____"+RESET+"/"); //hex(0,5)
        System.out.println();

        //line10
        System.out.print("\\"+RED+"         "+RESET+"/"); //hex(1,0)
        System.out.print(BLUE+"     "+RESET+"\\"); //hex(1,1)
        System.out.print(RED + "         "+RESET+"/"); //hex(1,2)
        System.out.print(BLUE+"     "+RESET+"\\"); //hex(1,3)
        System.out.print(RED + "         "+RESET+"/"); //hex(1,4)
        System.out.print(BLUE+"     "+RESET+"\\"); //hex(1,5)
        System.out.println();

        //line11
        System.out.print(" \\"+RED+"       "+RESET+"/"); //hex(1,0)
        System.out.print(BLUE+"       "+RESET+"\\"); //hex(1,1)
        System.out.print(RED + "       "+RESET+"/"); //hex(1,2)
        System.out.print(BLUE+"       "+RESET+"\\"); //hex(1,3)
        System.out.print(RED + "       "+RESET+"/"); //hex(1,4)
        System.out.print(BLUE+"       "+RESET+"\\"); //hex(1,5)
        System.out.println();

        //line12
        System.out.print("  \\"+RED+"_____"+RESET+"/"); //hex(1,0)
        System.out.print(BLUE+"  (1,1)  "+RESET+"\\"); //hex(1,1)
        System.out.print(RED + "_____"+RESET+"/"); //hex(1,2)
        System.out.print(BLUE+"  (1,3)  "+RESET+"\\"); //hex(1,3)
        System.out.print(RED + "_____"+RESET+"/"); //hex(1,4)
        System.out.print(BLUE+"  (1,5)  "+RESET+"\\"); //hex(1,5)
        System.out.println();

        //line13
        System.out.print("  /"+GREEN+"     "+RESET+"\\"); //hex(2,0)
        System.out.print(BLUE+"         "+RESET+"/"); //hex(1,1)
        System.out.print(GREEN+"     "+RESET+"\\"); //hex(2,2)
        System.out.print(BLUE+"         "+RESET+"/"); //hex(1,3)
        System.out.print(GREEN+"     "+RESET+"\\"); //hex(2,4)
        System.out.print(BLUE+"         "+RESET+"/"); //hex(1,5)
        System.out.println();

        //line14
        System.out.print(" /"+GREEN+"       "+RESET+"\\"); //hex(2,0)
        System.out.print(BLUE+"       "+RESET+"/"); //hex(1,1)
        System.out.print(GREEN+"       "+RESET+"\\"); //hex(2,2)
        System.out.print(BLUE+"       "+RESET+"/"); //hex(1,3)
        System.out.print(GREEN+"       "+RESET+"\\"); //hex(2,4)
        System.out.print(BLUE+"       "+RESET+"/"); //hex(1,5)
        System.out.println();

        //line15
        System.out.print("/"+GREEN+"  (2,0)  "+RESET+"\\"); //hex(2,0)
        System.out.print(BLUE+"_____"+RESET+"/"); //hex(1,1)
        System.out.print(GREEN+"  (2,2)  "+RESET+"\\"); //hex(2,2)
        System.out.print(BLUE+"_____"+RESET+"/"); //hex(1,3)
        System.out.print(GREEN+"  (2,4)  "+RESET+"\\"); //hex(2,4)
        System.out.print(BLUE+"_____"+RESET+"/"); //hex(1,5)
        System.out.println();

        //line16
        System.out.print("\\"+GREEN+"         "+RESET+"/"); //hex(2,0)
        System.out.print(YELLOW+"     "+RESET+"\\"); //hex(2,1)
        System.out.print(GREEN+ "         "+RESET+"/"); //hex(2,2)
        System.out.print(YELLOW+"     "+RESET+"\\"); //hex(2,3)
        System.out.print(GREEN+ "         "+RESET+"/"); //hex(2,4)
        System.out.print(YELLOW+"     "+RESET+"\\"); //hex(2,5)
        System.out.println();

        //line17
        System.out.print(" \\"+GREEN+"       "+RESET+"/"); //hex(2,0)
        System.out.print(YELLOW+"       "+RESET+"\\"); //hex(2,1)
        System.out.print(GREEN+ "       "+RESET+"/"); //hex(2,2)
        System.out.print(YELLOW+"       "+RESET+"\\"); //hex(2,3)
        System.out.print(GREEN+ "       "+RESET+"/"); //hex(2,4)
        System.out.print(YELLOW+"       "+RESET+"\\"); //hex(2,5)
        System.out.println();

        //line18
        System.out.print("  \\"+GREEN+"_____"+RESET+"/"); //hex(2,0)
        System.out.print(YELLOW+"  (2,1)  "+RESET+"\\"); //hex(2,1)
        System.out.print(GREEN+ "_____"+RESET+"/"); //hex(2,2)
        System.out.print(YELLOW+"  (2,3)  "+RESET+"\\"); //hex(2,3)
        System.out.print(GREEN+ "_____"+RESET+"/"); //hex(2,4)
        System.out.print(YELLOW+"  (2,5)  "+RESET+"\\"); //hex(2,5)
        System.out.println();

        //line19
        System.out.print("        "+"\\"+YELLOW+"         "+RESET+"/"+"     "); //hex(2,1)
        System.out.print("\\"+YELLOW+"         "+RESET+"/"+"     "); //hex(2,3)
        System.out.print("\\"+YELLOW+"         "+RESET+"/"); //hex(2,5)
        System.out.println();

        //line20
        System.out.print("         "+"\\"+YELLOW+"       "+RESET+"/"+"       "); //hex(2,1)
        System.out.print("\\"+YELLOW+"       "+RESET+"/"+"       "); //hex(2,3)
        System.out.print("\\"+YELLOW+"       "+RESET+"/"); //hex(2,5)
        System.out.println();

        //line21
        System.out.print("          "+"\\"+YELLOW+"_____"+RESET+"/"+"         "); //hex(2,1)
        System.out.print("\\"+YELLOW+"_____"+RESET+"/"+"         "); //hex(2,3)
        System.out.print("\\"+YELLOW+"_____"+RESET+"/"); //hex(2,5)
        System.out.println();

    }
}




