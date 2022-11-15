import java.util.Scanner;

public class TP5 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int n = keyboardInput.nextInt();

        //On dit que un nombre est pair si le reste de la division de ce nombre sur 2 est égale 0
        int resteDeDivision = n%2;
        if(n==0){
            System.out.println("Le nombre est zéro (et il est pair)");
        }else{
            if (n<0) {
                System.out.print("Le nombre est négatif ");
            } else {
                System.out.print("Le nombre est positif ");
            }
            if (resteDeDivision==0) {
                System.out.println("et pair");
            } else {
                System.out.println("et impair");
            }
        }
    }
}
