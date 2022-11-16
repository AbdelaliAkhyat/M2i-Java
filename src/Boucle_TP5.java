import java.util.Scanner;

public class Boucle_TP5 {
    public static void main(String[] args) {
        // définir la valeur min et max du nombre aléatoire
        int max = 100;
        int min = 1;
        int range = (max - min) + 1;

        // Générer un nombre aléatoire entre 1 et 100
        int nbrRandom = (int)(Math.random() * range) + min;
        // nbrRandom : nombre aléatoire -> est différent à chaque exécution de ce code
        // System.out.println("random : " + nbrRandom);

        int nbr;
        do{
            // Demander à l'utilisateur d'entrer un nombre entre 1 et 100
            System.out.println("Entrez un nombre entre 1 et 100 : ");
            Scanner input = new Scanner(System.in);
            nbr = input.nextInt();

            //Si le nombre entré est supérieur au nombre aléatoire -> Entrer un nombre plus petit
            if (nbr > nbrRandom) {
                System.out.println("Entrer un nombre plus petit");
            } else if (nbr < nbrRandom) { //Si le nombre entré est inférieur au nombre aléatoire
                                          // -> Entrer un nombre plus grand
                System.out.println("Entrer un nombre plus grand");
            }
            else {
                System.out.println("Félicitation vous avez bien trouvé la valeur");
            }
        }while(nbr != nbrRandom); // Si le nombre entré par l'utilisateur est différent

    }
}
