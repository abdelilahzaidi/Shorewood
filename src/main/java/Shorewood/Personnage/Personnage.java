package Shorewood.Personnage;

import Shorewood.Dice;
import Shorewood.Personnage.Hero.Hero;
import Shorewood.Personnage.Monstre.Monstre;
import Shorewood.Richesse;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;

public class Personnage {
    private int endurance;
    private int force;
    private int pointDeVie;
    private Richesse richesse;
    private boolean alive=true;

    public Personnage(int endurance, int force, Richesse richesse) {
        this.endurance=endurance;
        this.force=force;
        this.pointDeVie=endurance+modificateur(endurance);
        this.richesse = richesse;
    }
    public int getEndurance() {
        return endurance;
    }

    public int getForce() {
        return force;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public int modificateur(int endurance){
        int bonus;
      if(endurance <5){
          bonus=-1;
      } else if (endurance <5 && endurance <10) {
          bonus =0;
      } else if (endurance >10 && endurance < 15) {
          bonus=1;
      }
      else{
          bonus=2;
      }
      return bonus;
    }
    public void frappe(Personnage p) {
        int degat= recevoirDegats(p);
        int pointsDeVie=p.getPointDeVie();
        pointsDeVie -=degat;
        p.setPointDeVie(pointsDeVie);
        System.out.println("Degats "+degat+" "+pointsDeVie + " points de vie restants !");
        isAlive();

    }
    private void setPointDeVie(int pointsDeVie) {
        this.pointDeVie=pointsDeVie;
    }
    public int recevoirDegats(Personnage p) {

        Dice d4 = new Dice(4);
        int teste=0;
        int degat=0;

            int bonus=0;
            if(this !=p){
                if (getForce() < 5) {
                    bonus = -1;
                } else if (getForce() < 5 && getForce() < 10) {
                    bonus = 0;
                } else if (getForce() > 10 && getForce() < 15) {
                    bonus = 1;
                } else {
                    bonus = 2;
                }
                teste=d4.jeterDe4();
                degat=bonus +teste ;
                System.out.println("D4 "+teste);
                System.out.println("Force "+getForce());
            }
        return degat;
    }

    public boolean isAlive() {

        if(getPointDeVie()<=0){
            System.out.println(" est mort");
            alive=false;
        }
        return alive;
    }

     public void regenerate(){
             setPointDeVie(endurance+modificateur(endurance));

        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnage that = (Personnage) o;
        return endurance == that.endurance && force == that.force && pointDeVie == that.pointDeVie  && Objects.equals(richesse, that.richesse);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endurance, force, pointDeVie, richesse);
    }
    @Override
    public String toString() {
        return "Personnage{" +
                "endurance=" + endurance +
                ", force=" + force +
                ", pointDeVie=" + pointDeVie +
                ", richesse=" + richesse +
                '}';
    }
}


//Introduire une variable currentEnergie et une autre booleenne alive
