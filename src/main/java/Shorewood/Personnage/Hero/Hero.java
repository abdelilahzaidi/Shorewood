package Shorewood.Personnage.Hero;

import Shorewood.Personnage.Personnage;

public class Hero extends Personnage {
    public Hero(int endurance, int force) {
        super(endurance, force);
    }
    @Override
    public String toString() {

        return "hero{" +
                "endurance=" + getEndurance() +
                ", force=" +getForce() +

                '}';
    }
}
