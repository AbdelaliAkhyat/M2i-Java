import java.util.Scanner;

public class Boucle_TP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Définir une adresse email : ");
        String email= input.nextLine();
        System.out.print("Définir un mot de passe : ");
        String password= input.nextLine();

        String testPassword = "";
        String testEmail = "";
        int nbreTentative = 0;
        do{
            if(nbreTentative>=2){
                System.out.printf("Il vous reste %d tentatives.\n",(5-nbreTentative));
            }
            System.out.print("Saisir votre email : ");
            testEmail= input.nextLine();
            System.out.print("Saisir votre mot de passe : ");
            testPassword= input.nextLine();
            nbreTentative++;
            if(testPassword.equals(password) && testEmail.equals(email)){
                System.out.println("Bienvenu dans votre espace client");
            }else{
                if(nbreTentative==5){
                    System.out.printf("Vous avez saisi %d fois un email et un mot de passe incorrects. Votre " +
                            "compte est bloqué\n",nbreTentative);
                    break;
                }
                System.out.println("Identifiants incorrect.Veuillez recommencer.");
            }
        }while(password != testPassword && email != testEmail);

    }
}
