import java.util.ArrayList;
import java.util.Random;

import Unit.BaseUnit;
import Unit.Crossbowman;
import Unit.Mag;
import Unit.Monax;
import Unit.Shooter;
import Unit.Sniper;
import Unit.StrelMan;
import Unit.Vor;

public class Game {
    private static boolean add;

    public static void main(String[] args) {
       Shooter shooter= new Shooter(null, "Den", 0, 150, 1, 0, 0,  3, 5);
        Mag mag = new Mag("Sem", 20,150, 3, 0, 0, 5, 1, "heal");
        Vor vor = new Vor("Hard", 0, 120, 2, 40, 100, 2, 3);
        StrelMan strelMan= new StrelMan("Din", 0, 100, 2, 30, 50, 2, 2, 10, 3);
        Sniper sniper = new Sniper("Miki");
        Monax monax =new Monax("Karl", 15, 170, 3, 0, 0, 5, 1, "heal");
        Crossbowman crossbowman = new Crossbowman("Lip", 0, 100, 3, 10, 20, 3, 3, 20, 10);
       
       ArrayList<BaseUnit> team1 = new ArrayList<>();
       for (int i = 0; i < 10; i++) {
           switch (new Random().nextInt(4)) {
               case 0:
                   team1.add(new Sniper("Miki"));
                   break;
               case 1:
                   add = team1.add(new Mag("Sem", 20,150, 3, 0, 0, 5, 1, "heal"));
                   break;
               case 2:
                   team1.add(new Crossbowman("Lip", 0, 100, 3, 10, 20, 3, 3, 20, 10));
                   break;
               case 3:
                   team1.add(new Shooter (team1, "Den", 0, 150, 1, 0, 0,  3, 5));
                   break;
           }
       }
       ArrayList<BaseUnit> team2 = new ArrayList<>();
       for (int i = 0; i < 10; i++) {
           switch (new Random().nextInt(4)) {
               case 0:
                   team2.add(new Vor("Hard", 0, 120, 2, 40, 100, 2, 3));
                   break;
               case 1:
                   team2.add(new Monax("Karl", 15, 170, 3, 0, 0, 5, 1, "heal"));
                   break;
               case 2:
                   team2.add(new StrelMan("Din", 0, 100, 2, 30, 50, 2, 2, 10, 3));
                   break;
               case 3:
                   team2.add(new Shooter(team2, "Den", 0, 150, 1, 0, 0,  3, 5));
                   break;
           }

       }
       team1.forEach(n -> System.out.println(n.getInfo()));
       System.out.println();
       team2.forEach(n -> System.out.println(n.getInfo()));
         }
       

    }
