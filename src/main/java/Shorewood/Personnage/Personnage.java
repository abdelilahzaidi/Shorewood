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

   /* public void frappe(Personnage p, Monstre m){
        this.p = p;
        this.m = m;
        boolean test=false;
        Dice d4=new Dice(4);
        if(this !=m){
            if(this.estTouché==true ){
                for(int i=0;i<4;i++){
                    d4.jeterDe();
                }
            }
        }

    }*/
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
