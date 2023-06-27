package Shorewood.Personnage.Monstre;

import Shorewood.Richesse;

public class Loup extends Monstre{



    public Loup(int endurance, int force, Richesse richesse) {
        super(endurance, force,richesse);
    }
    public Richesse depecer(){
        Richesse r =new Richesse(Richesse.Material.CUIR,1) ;
        return r;
    }

}
