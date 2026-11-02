package calculator;

/**
 * @author Ali-Shan KASSOU MAMODE | ING1-BDML2-APP | TP0 - Exercice 3
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operateur;
        double operande1, operande2, resultat;
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        operateur = sc.nextInt();
        if (operateur < 1 || operateur > 5) {
            System.out.println("L'operateur " + operateur + " n'existe pas");
            System.exit(0);
        }
        System.out.print("Please enter the first number: ");
        operande1 = sc.nextDouble();
        System.out.print("Please enter the second number: ");
        operande2 = sc.nextDouble();
        resultat = switch (operateur) {
            case 1 ->
                operande1 + operande2;
            case 2 ->
                operande1 - operande2;
            case 3 ->
                operande1 * operande2;
            case 4 ->
                operande1 / operande2;
            case 5 ->
                operande1 % operande2;
            default ->
                0;
        };
        System.out.println("The result is: " + resultat);
    }

}
