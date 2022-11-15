import java.util.Scanner;

public class Exo2_LecteurClavier {
    public static void main(String[] args){
        Scanner id = new Scanner(System.in);
        System.out.println("Entrer votre nom");
        String nom = id.nextLine();

        System.out.println("Entrer votre prénom");
        String prenom = id.nextLine();

        System.out.println("Entrer votre age");
        double age = id.nextDouble();

        System.out.println("Entrer votre poids"); //Saisir l'age avec une virgule "," au lieu de point "."
        double poids = id.nextDouble();

        System.out.printf("Nom : %s \nPrénom : %s\nAge : %f ans" +
                "\nPoids : %.1f Kg",nom,prenom,age,poids);


    }
}

