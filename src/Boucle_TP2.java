import java.util.Scanner;

public class Boucle_TP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Saisir un nombre pour avoir son factoriel :");
        int nombre = input.nextInt();
        int fact = 1;
        System.out.print("Factorielle de " + nombre + " : ");
        /*for(int i=1; i<=nombre; i++){
            if (i == nombre) {
                System.out.print((nombre+1) - i);
            } else {
                System.out.print((nombre+1) - i + "*");
            }
            fact *= i;
        }
        System.out.printf(" = %d",fact);
        */
        for (int i = nombre; i >= 1 ; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + "*");
            }
            fact *= i;
        }
        System.out.printf(" = %d",fact);
    }
}
