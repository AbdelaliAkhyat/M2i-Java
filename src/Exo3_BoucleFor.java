import java.util.Scanner;

public class Exo3_BoucleFor {
    public static void main(String[] args) {
        // Exo : Afficher la table de multiplication de 12 en le multipliant par tous les nombres de 2 à 13.

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre pour afficher sa table de multiplication: ");
        int nombre=input.nextInt();

        System.out.println("La table de multiplication de " + nombre);

        int i;
        for (i = 2; i <= 13; i++)
            System.out.println(nombre + "x" + i + " = " + (nombre * i));
    }
}
