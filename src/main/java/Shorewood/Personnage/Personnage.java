package Shorewood.Personnage;

import Shorewood.Dice;
import Shorewood.Personnage.Monstre.Monstre;

public class Personnage {
    private int endurance;
    private int force;
    private int pointDeVie;

    private boolean estTouché;
    private boolean isAdversaire;

    private Personnage advesaire;
    private Personnage p;
    private Monstre m;

    public Personnage(int endurance, int force) {
        this.endurance=endurance;
        this.force=force;
        this.pointDeVie=endurance+modificateur(endurance);
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
    public Personnage diedPersonnage(int poinDeVie){
        Personnage p=new Personnage(this.endurance,this.force);
        if(poinDeVie <=0)
            p=null;
        return p;
    }

    public int frappe(Monstre m){
        /*this.p = p;
        this.m = m;
        boolean test=false;
        int attaque=0;
        Dice d4=new Dice(4);
        if(this !=m){
            if(this.estTouché==true ){
                for(int i=0;i<4;i++){
                    attaque=d4.jeterDe();
                    System.out.println(attaque);
                }
            }
        }
        return attaque;*/
        /*ystem.out.println(nom + " attaque le monstre !");

        // Calcul des dégâts infligés au monstre
        int degats = pointsDAttaque;

        // Réduire les points de vie du monstre en fonction des dégâts
        m.recevoirDegats(degats);*/


    }
    @Override
    public String toString() {
        return "Personnage{" +
                "endurance=" + endurance +
                ", force=" + force +
                ", pointdeVie=" + pointDeVie +
                ", estTouché=" + estTouché +
                ", isAdversaire=" + isAdversaire +
                ", advesaire=" + advesaire +
                '}';
    }
}
