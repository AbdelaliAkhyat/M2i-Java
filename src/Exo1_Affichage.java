public class Exo1_Affichage {
    public static void main(String[] args) {
        int longueur=250, largeur=140;
        int perimetre= 2*(longueur+largeur);
        int surface= longueur*largeur;
        System.out.println("Le résultat de perimetre est "+perimetre+" m. \nLe résultat de surface est "+surface+" m2");
        System.out.printf("Le résultat de perimetre est %d m. \nLe résultat de surface est %d m2.",perimetre,surface);

    }
}

