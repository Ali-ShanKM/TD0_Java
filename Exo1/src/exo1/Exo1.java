package exo1;

/**
 * @author Ali-Shan KASSOU MAMODE | ING1-BDML2-APP | TP0 - Exercice 1
 */
import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Au revoir " + prenom);
    }

}
