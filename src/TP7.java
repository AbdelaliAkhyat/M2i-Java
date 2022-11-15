import java.util.Scanner;

public class TP7 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier entre 1 et 12 : ");
        int n= keyboardInput.nextInt();
        System.out.println("Mois : "+n);

        if(n==1){
            System.out.printf("Result : Janvier");
        } else if (n==2) {
            System.out.printf("Result : Février");
        } else if (n==3) {
            System.out.printf("Result : Mars");
        } else if (n==4) {
            System.out.printf("Result : Avril");
        } else if (n==5) {
            System.out.printf("Result : Mai");
        } else if (n==6) {
            System.out.printf("Result : Juin");
        } else if (n==7) {
            System.out.printf("Result : Juillet");
        } else if (n==8) {
            System.out.printf("Result : Août");
        } else if (n==9) {
            System.out.printf("Result : Septembre");
        } else if (n==10) {
            System.out.printf("Result : Octobre");
        } else if (n==11) {
            System.out.printf("Result : Novembre");
        } else if (n==12) {
            System.out.printf("Result : Décembre");
        } else {
            System.out.printf("Le nombre saisi n'est pas compris entre 1 et 12 !!");
        }
    }
}
