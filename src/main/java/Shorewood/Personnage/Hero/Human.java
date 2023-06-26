package Shorewood.Personnage.Hero;

import Shorewood.Personnage.Personnage;

public class Human extends Hero {

    public Human(int endurance, int force) {
        super(endurance, force);
    }

    @Override
    public String toString() {

        return "human{" +
                "endurance=" + getEndurance() +
                ", force=" +getForce() +

                '}';
    }
}
