import java.util.Scanner;

public class Boucle_TP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Définir une adresse email : ");
        String email= input.nextLine();
        System.out.print("Définir un mode passe : ");
        String password= input.nextLine();

        String testPassword = "";
        String testEmail = "";

        do{
            System.out.print("Saisir votre email : ");
            testEmail= input.nextLine();
            System.out.print("Saisir votre mode passe : ");
            testPassword= input.nextLine();
            if(testPassword.equals(password) || testEmail.equals(email)){
                System.out.println("Bienvenu dans votre espace client");
                break;
            } else {
                    System.out.println("Identifiants incorrect");
                }
        }while(password != testPassword && email != testEmail);


    }
}
