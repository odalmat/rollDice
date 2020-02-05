import java.util.Random;
import java.util.Scanner;

public class rollDice {

    public static void main(String[] args) {

        Random dice = new Random();
        int hasard = dice.nextInt(100) + 1;
        int choisi = 0;
        int essai = 1;



        while (choisi != hasard) {
            System.out.println("Choisis un chiffre entre 1 et 100 et essaie de retrouver le chiffre généré aléatoirement ! tu en est à ton essai numero " + essai);

            Scanner recherche = new Scanner(System.in);
            choisi = recherche.nextInt();


            if (choisi < hasard && choisi>0) {
                System.out.println("Tu a entré le chiffre : " + choisi + "! C'est un chiffre trop bas .");


            } else if (choisi > hasard && choisi < 101) {
                System.out.println("Tu a entré le chiffre : " + choisi + "! C'est un chiffre trop élevé.");

            } else if (choisi == 0) {
                System.out.println("Mets pas zéro bordel.");

            } else if (choisi == hasard) {
                System.out.println("Bien joué !!!! " + hasard + " est bien le chiffre généré aléatoirement !!! t'as trouvé à ton " + essai + "e essai");

            } else {
                System.out.println("Tu n'a pas entré un chiffre entre 1 et 100 t'as tapé plus haut je le sais !!");
            }
            essai++;
        }

    }
}

