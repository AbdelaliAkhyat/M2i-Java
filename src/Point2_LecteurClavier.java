import java.util.Scanner;

public class Point2_LecteurClavier {

    public static void main(String[] args){

        Scanner keyboardInput= new Scanner(System.in);
        System.out.print("Entrer la longueur : ");
        double longueur = keyboardInput.nextDouble();

        System.out.println("Entrer la largeur : ");
        double largeur=keyboardInput.nextDouble();

        double surface=longueur*largeur;
        double perimetre=2*(longueur+largeur);
        System.out.printf("longueur : %.1f m\nlargeur : %.1f\nsurface : %.1f m2" +
                "\npérimètre : %.1f m",longueur,largeur,surface,perimetre);

    }
}
