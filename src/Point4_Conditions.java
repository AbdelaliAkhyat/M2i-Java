import java.util.Scanner;

public class Point4_Conditions {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Votre age : ");
        int age= keyboardInput.nextInt();
        // < qui signifie « inférieur à »
        // > qui signifie « supérieur à »
        // == qui signifie « égal à », à ne pas confondre avec = qui représente l’affectation
        // <= qui signifie « inférieur ou égal à »
        // >= qui signifie « supérieur ou égal à »
        // != qui signifie « différent de »
        if(age>=18){
            System.out.println("Vous etes un majeur.");
        } else{
            System.out.println("Vous etes un mineur.");
        }
    }
}
