import java.util.Scanner;

public class Boucle_TP6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Pour savoir les multiples de 5 et 3 parmi les nombre de 1 à n.\n" +
                "Veuillez entrer le nombre d'arrêt n : ");

        int nArret = input.nextInt();

        for (int n = 1; n <= nArret; n++) {
            String affichage = ""; // Message à afficher, initialement vide
            if (n%3 == 0) {
                // Nombre divisible par 3 : on ajoute "Fizz" au message
                affichage += "Fizz";
            }
            if (n%5 == 0) {
                // Nombre divisible par 5 : on ajoute "Buzz" au message
                affichage += "Buzz";
            }
            if (affichage == "") {
                // Si message est vide, le nombre n'est pas divisible ni par 3, ni par 5 :
                // le message affiché sera le nombre
                affichage = Integer.toString(n);
            }
            System.out.println(affichage);
        }
    }
}
