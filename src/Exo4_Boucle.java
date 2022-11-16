import java.util.Scanner;

public class Exo4_Boucle {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("veuillez définir un code PIN:");
        int codePin = keyboardInput.nextInt();

        System.out.println("apres quelques minutes, l'appareil s'est verouille...");
        int codePinATester=0;
        int tentative = 0;
        while (codePinATester!= codePin && tentative < 5) {
            System.out.println("veuillez entrer le code de devereouillage");
            codePinATester = keyboardInput.nextInt();
            tentative++;
            if (codePinATester == codePin) {
                System.out.println("correct");
            } else if (tentative <= 1) {
                System.out.println("wrong, veuillez recommencer");
            } else if (tentative >= 2 && tentative <=4) {
                System.out.printf("wrong, vous avez encore %d tentatives, veuillez recommencer",5-tentative);
            } else {
                System.out.println("wrong, vous êtes bloque");
            }
        }
    }
}
