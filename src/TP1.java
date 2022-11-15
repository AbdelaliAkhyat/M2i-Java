import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez saisir la valeur du diamètre : ");
        int diametre = keyboardInput.nextInt();
        double rayon=diametre/2;
        double rAuCarre=Math.pow(rayon,2);
        double surface=rAuCarre*Math.PI;

        System.out.printf("La surface : rayon x rayon x π = %.2f",surface);
    }
}
