package Shorewood.Personnage.Hero;

import Shorewood.Dice;
import Shorewood.Personnage.Monstre.Monstre;
import Shorewood.Personnage.Personnage;
import Shorewood.Richesse;

import java.security.SecureRandom;
import java.util.Random;

public class Hero extends Personnage {
    public Hero(int endurance, int force, Richesse richesse) {
        super(endurance, force, richesse);
        getPointDeVie();
    }

    @Override
    public String toString() {
        return "Hero{}";
    }


}
