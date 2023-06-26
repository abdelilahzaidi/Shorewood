package Shorewood.Personnage.Hero;

import Shorewood.Personnage.Personnage;

public class Dwarf extends Hero {
    public Dwarf(int endurance, int force) {
        super(endurance, force);
    }
    @Override
    public String toString() {

        return "dwarf{" +
                "endurance=" + getEndurance() +
                ", force=" +getForce() +

                '}';
    }
}
