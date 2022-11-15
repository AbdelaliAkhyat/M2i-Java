import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez entrer votre age : ");
        int age = keyboardInput.nextInt();
        int anneeActuelle = 2020;
        int anneeDeNaissance = anneeActuelle - age;

        System.out.printf("Votre année de naissance est : %d",anneeDeNaissance);
    }
}
