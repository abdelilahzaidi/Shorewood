package Shorewood.Personnage.Hero;

import Shorewood.Personnage.Personnage;
import Shorewood.Richesse;

public class Dwarf extends Hero {
    public Dwarf(int endurance, int force, Richesse richesse) {
        super(endurance, force,richesse);
        getPointDeVie();
    }
    @Override
    public String toString() {

        return "dwarf{" +
                "endurance=" + getEndurance() +
                ", force=" +getForce()
                +
                        ", point de vie="+getPointDeVie()+


                '}';
    }
}
