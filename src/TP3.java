import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Entrez la première valeur(a) : ");
        int a = keyboardInput.nextInt();
        System.out.print("Entrez la première valeur(b) : ");
        int b = keyboardInput.nextInt();
        System.out.print("Entrez la première valeur(c) : ");
        int c = keyboardInput.nextInt();

        System.out.printf("Les valeurs entrées sont : a = %d, b = %d et c = %d\n",a,b,c);

        int variableTemporaire=b;
        b=a;
        c=b;
        a=variableTemporaire;

        System.out.printf("Les valeurs permutées sont : a = %d, b = %d et c = %d",a,b,c);

    }
}
