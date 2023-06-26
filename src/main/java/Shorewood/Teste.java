package Shorewood;

public class Teste {
    public class Guerrier {
        private String nom;
        private int pointsDeVie;
        private int pointsDAttaque;

        public Guerrier(String nom, int pointsDeVie, int pointsDAttaque) {
            this.nom = nom;
            this.pointsDeVie = pointsDeVie;
            this.pointsDAttaque = pointsDAttaque;
        }

        public void attaquer(Monstre monstre) {
            System.out.println(nom + " attaque le monstre !");

            // Calcul des dégâts infligés au monstre
            int degats = pointsDAttaque;

            // Réduire les points de vie du monstre en fonction des dégâts
            monstre.recevoirDegats(degats);
        }
    }

    public class Monstre {
        private String nom;
        private int pointsDeVie;

        public Monstre(String nom, int pointsDeVie) {
            this.nom = nom;
            this.pointsDeVie = pointsDeVie;
        }

        public void recevoirDegats(int degats) {
            pointsDeVie -= degats;
            System.out.println(nom + " subit " + degats + " dégâts !");

            if (pointsDeVie <= 0) {
                System.out.println(nom + " est vaincu !");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Guerrier guerrier = new Guerrier("Conan", 100, 20);
            Monstre monstre = new Monstre("Gobelin", 50);

            guerrier.attaquer(monstre);
        }
    }

}
