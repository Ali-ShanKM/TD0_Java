package exo2;

/**
 * @author Ali-Shan KASSOU MAMODE | ING1-BDML2-APP | TP0 - Exercice 2
 */
import java.util.Scanner;

public class Exo2 {

    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre d
        int result; // resultat
        int ind; //indice
        result = 0;
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre : ");
        nb = sc.nextInt(); // On demande a sc de donner le prochain entier

        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind++;
        }

        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + " premiers entiers est " + result);
    }

}
