package Shorewood.Personnage.Monstre;

import Shorewood.Personnage.Personnage;
import Shorewood.Richesse;

public class Monstre extends Personnage {
    private Richesse richesse;
    public Monstre(int endurance, int force,Richesse richesse) {
        super(endurance, force);
        this.richesse=richesse;
    }
}
