package Shorewood;

import Shorewood.Personnage.Hero.Dwarf;
import Shorewood.Personnage.Hero.Hero;
import Shorewood.Personnage.Hero.Human;
import Shorewood.Personnage.Monstre.Monstre;
import Shorewood.Personnage.Personnage;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Richesse or= new Richesse(Richesse.Material.OR,4);
        Richesse cuir= new Richesse(Richesse.Material.CUIR,4);
        System.out.println("Or"+or);

        System.out.println("Cuir"+cuir);
        Dice d1 = new Dice(6);
        d1.jeterDe();
        System.out.println(d1.jeterDe());
        Dice d2 = new Dice(6);
        d2.jeterDe();
        System.out.println(d2.jeterDe());
        int endurance1=d1.jeterDe(); int force1=d1.jeterDe();

        Personnage p1=new Personnage(endurance1,force1, or);
        System.out.println("Personnage 1"+p1);
        Dice d12 = new Dice(6);
        d12.jeterDe();
        System.out.println(d12.jeterDe());
        Dice d21 = new Dice(6);
        d21.jeterDe();
        System.out.println(d2.jeterDe());
        int endurance2=d21.jeterDe(); int force2=d12.jeterDe();
        Dice d13 = new Dice(6);
        int endurance3=d13.jeterDe(); int force3=d13.jeterDe();





        Personnage m1=new Monstre(endurance3,force3,or);

        Hero h1=new Human(endurance1,force1,or);

        Hero n1=new Dwarf(endurance2,force2,cuir);
        System.out.println("Attaque !!!");

        //System.out.println(h1.frappe((Monstre) m1));

        //System.out.println("Personnage 2"+p2);
        System.out.println("******************************");
        System.out.println("Humain h1"+h1);
        System.out.println("******************************");
        System.out.println("9azam n1"+n1);
        System.out.println("******************************");
        System.out.println("7ayawane 71"+m1);

       m1.frappe((Hero)h1);

        System.out.println(m1.recevoirDegats((Hero)h1));

        System.out.println("Etat h1"+h1.isAlive());
        System.out.println("******************************");
        System.out.println("Humain h1"+h1);
        System.out.println("******************************");
        //System.out.println("9azam n1"+n1);
        System.out.println("******************************");
        System.out.println("7ayawane 71"+m1);

        m1.frappe((Hero)h1);

        System.out.println(m1.recevoirDegats((Hero)h1));

        System.out.println("******************************");
        System.out.println("Humain h1"+h1);
        System.out.println("******************************");
        //System.out.println("9azam n1"+n1);
        System.out.println("******************************");
        System.out.println("7ayawane 71"+m1);
        m1.frappe((Hero)h1);

        System.out.println(m1.recevoirDegats((Hero)h1));


        System.out.println("******************************");
        System.out.println("Humain h1"+h1);
        System.out.println("******************************");
        //System.out.println("9azam n1"+n1);
        System.out.println("******************************");
        System.out.println("7ayawane 71"+m1);

        m1.frappe((Hero)h1);

        System.out.println(m1.recevoirDegats((Hero)h1));

        System.out.println("******************************");
        System.out.println("Humain h1"+h1);
        System.out.println("******************************");
        //System.out.println("9azam n1"+n1);
        System.out.println("******************************");
        System.out.println("7ayawane 71"+m1);

        m1.frappe((Hero)h1);

        System.out.println(m1.recevoirDegats((Hero)h1));

        System.out.println("******************************");
        System.out.println("Humain h1"+h1);
        System.out.println("******************************");
        //System.out.println("9azam n1"+n1);
        System.out.println("******************************");
        System.out.println("7ayawane 71"+m1);

        System.out.println("Etat h1"+h1.isAlive());
    }
}