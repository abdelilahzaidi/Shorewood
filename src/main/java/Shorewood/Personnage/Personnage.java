package Shorewood.Personnage;

import Shorewood.Dice;

public class Personnage {
    private int endurance;
    private int force;
    private int pointdeVie;

    private boolean estTouché;
    private boolean isAdversaire;

    private Personnage advesaire;

    public Personnage(int endurance, int force, int pointdeVie) {
        this.endurance = endurance;
        this.force = force;
        this.pointdeVie = pointdeVie;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointdeVie() {
        return pointdeVie;
    }
    public void setPointdeVie(int pointdeVie) {
        this.pointdeVie = pointdeVie;
    }
    public void frappe(Personnage p){
        boolean test=false;
        Dice d4=new Dice(4);
        if(this !=p){
            if(this.estTouché==true ){
                for(int i=0;i<4;i++){
                    d4.jeterDe();
                }
            }
        }

    }
}
