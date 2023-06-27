package Shorewood.Personnage.Monstre;

import Shorewood.Personnage.Hero.Hero;
import Shorewood.Personnage.Personnage;
import Shorewood.Richesse;

public class Monstre extends Personnage {
    private Richesse richesse;
    public Monstre(int endurance, int force,Richesse richesse) {
        super(endurance, force, richesse);
        getPointDeVie();
        this.richesse=richesse;
    }
    @Override
    public String toString() {
        return "monstre{" +
                "endurance=" + getEndurance() +
                ", force=" + getForce() +
                ", pointDeVie=" + getPointDeVie() +

                '}';
    }

}
