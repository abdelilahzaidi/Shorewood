package Shorewood;

import Shorewood.Personnage.Hero.Dwarf;
import Shorewood.Personnage.Hero.Human;
import Shorewood.Personnage.Personnage;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dice d1 = new Dice(6);

        d1.jeterDe();
        System.out.println(d1.jeterDe());


        Dice d2 = new Dice(6);

        d2.jeterDe();
        System.out.println(d2.jeterDe());


        int endurance=d2.jeterDe(); int force=d1.jeterDe(); //

        Personnage p1=new Personnage(endurance,force);


        System.out.println("Personnage 1"+p1);

        Dice d12 = new Dice(6);

        d12.jeterDe();
        System.out.println(d12.jeterDe());


        Dice d21 = new Dice(6);

        d21.jeterDe();
        System.out.println(d2.jeterDe());


        int endurance2=d21.jeterDe(); int force2=d12.jeterDe();

        //Personnage p2=new Personnage(endurance2,force2);

        Personnage h1=new Human(endurance2,force2);

        Personnage n1=new Dwarf(endurance2,force2);

        //System.out.println("Personnage 2"+p2);
        System.out.println("******************************");
        System.out.println("Humain "+h1);
        System.out.println("******************************");
        System.out.println("9azam "+n1);
    }

}