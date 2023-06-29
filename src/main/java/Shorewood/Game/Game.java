package Shorewood.Game;

import Shorewood.Dice;
import Shorewood.Personnage.Hero.Hero;
import Shorewood.Personnage.Hero.Human;
import Shorewood.Personnage.Monstre.Loup;
import Shorewood.Personnage.Monstre.Orque;
import Shorewood.Personnage.Personnage;
import Shorewood.Richesse;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private char[][] grille;
    private int lignes;
    private int colonnes;

    public Game(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
        grille = new char[lignes][colonnes];
    }


    private static final char HERO_HUMAIN = 'H';
    private static final char HERO_NAIN = 'N';
    private static final char MONSTRE_LOUP = 'L';
    private static final char MONSTRE_ORQUE = 'O';
    private static final char MONSTRE_DRAGON = 'D';

    private static final int NB_PARTIES = 10;

    public void initialiserGrille() {
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                grille[i][j] = '-';
            }
        }
    }




    public void placerPersonnage(int ligne, int colonne, Personnage p) {
        grille[ligne][colonne] = p.getRepresentation();
    }

    public void afficherGrille() {
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print(grille[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void jouer() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        Richesse or= new Richesse(Richesse.Material.OR,4);
        Richesse cuir= new Richesse(Richesse.Material.CUIR,4);
        System.out.println("Or"+or);

        System.out.println("Cuir"+cuir);
        Dice d1 = new Dice(6);
        d1.jeterDe();
        System.out.println(d1.jeterDe());
        Dice d2 = new Dice(6);
        d2.jeterDe();
        System.out.println(d2.jeterDe());
        int endurance1=d1.jeterDe(); int force1=d1.jeterDe();

        Personnage p1=new Personnage(endurance1,force1, or);
        System.out.println("Personnage 1"+p1);
        Dice d12 = new Dice(6);
        d12.jeterDe();
        System.out.println(d12.jeterDe());
        Dice d21 = new Dice(6);
        d21.jeterDe();
        System.out.println(d2.jeterDe());
        int endurance2=d21.jeterDe(); int force2=d12.jeterDe();
        Dice d13 = new Dice(6);
        int endurance3=d13.jeterDe(); int force3=d13.jeterDe();





        Hero h1=new Human(endurance1,force1,or);
        Personnage m1=new Orque(endurance3,force3,or);
        Personnage m2=new Loup(endurance2,force2,cuir);






        for (int partie = 1; partie <= NB_PARTIES; partie++) {
            System.out.println("Partie " + partie);
            initialiserGrille();

            // Placement des monstres aléatoirement
            placerPersonnage(random.nextInt(lignes), random.nextInt(colonnes), h1);
            placerPersonnage(random.nextInt(lignes), random.nextInt(colonnes), m1);
            placerPersonnage(random.nextInt(lignes), random.nextInt(colonnes), m2);

            // Placement des héros
            /*System.out.println("Entrez la position du héros humain (ligne colonne) :");
            int ligneHeroHumain = scanner.nextInt();
            int colonneHeroHumain = scanner.nextInt();
            placerPersonnage(ligneHeroHumain, colonneHeroHumain, HERO_HUMAIN);

            System.out.println("Entrez la position du héros nain (ligne colonne) :");
            int ligneHeroNain = scanner.nextInt();
            int colonneHeroNain = scanner.nextInt();
            placerPersonnage(ligneHeroNain, colonneHeroNain, HERO_NAIN);*/



            // Placement des héros
            System.out.println("Entrez la position du héros humain (ligne colonne) :");
            int ligneHeroHumain = scanner.nextInt();
            int colonneHeroHumain = scanner.nextInt();
            placerPersonnage(ligneHeroHumain, colonneHeroHumain, h1);

            afficherGrille();


        }

        scanner.close();


















            }


public static void main(String[] args) {
        /*int lignes = 15;
        int colonnes = 15;

        Game game = new Game(lignes, colonnes);
        game.initialiserGrille();
        
        game.afficherGrille();*/

    int lignes = 5;
    int colonnes = 5;

    Game game = new Game(lignes, colonnes);
    game.jouer();
    }
}
