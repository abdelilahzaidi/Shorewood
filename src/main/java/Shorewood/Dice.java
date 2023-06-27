package Shorewood;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Dice {
    private int nbFaces;
    Random rnd=new SecureRandom();

    private int[] num = new int[nbFaces];


    int[] tabNb = new int[6];

    public Dice(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public int jeterDe(){
        for (int cpt = 0; cpt < 4; cpt++) {
            int num = rnd.nextInt(nbFaces) + 1;
            tabNb[cpt]=num;
        }
        Arrays.sort(tabNb);
        int s=0;
        for (int i=3;i<6;i++) {
            s +=tabNb[i];
        }
        return s;
    }
    public int jeterDe4(){

            int num = rnd.nextInt(nbFaces) + 1;
        return num;

    }




}
