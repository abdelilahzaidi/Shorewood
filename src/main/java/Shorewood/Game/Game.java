package Shorewood.Game;

public class Game {
    private char[][] grille;
    private int lignes;
    private int colonnes;

    public Game(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
        grille = new char[lignes][colonnes];
    }

    public void initialiserGrille() {
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                grille[i][j] = '-';
            }
        }
    }

    public void placerLoup(int ligne, int colonne) {
        grille[ligne][colonne] = 'L';
    }

    public void afficherGrille() {
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print(grille[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int lignes = 15;
        int colonnes = 15;

        Game game = new Game(lignes, colonnes);
        game.initialiserGrille();
        game.placerLoup(2, 3);
        game.afficherGrille();
    }
}
