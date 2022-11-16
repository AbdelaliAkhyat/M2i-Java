import java.util.Scanner;

public class Point10_BoucleDoWhile {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Veuillez définir un code PIN : ");
        int codePin=keyboardInput.nextInt();

        System.out.println("Après quelques minutes, l'appareil s'est verrouillé...");
        int codePinATester=0;
        for(int i=1; i<=5;i++){
            System.out.print("Veuillez entrer le code de déverrouillage : ");
            codePinATester=keyboardInput.nextInt();// 1111
            if(codePinATester==codePin){//1111 == 1111 => true
                System.out.println("Félicitations, appareil déverrouillé....");
            }else if(i==5){
                System.out.println("Code PIN incorrect.Veuillez recommencer.");
            }
        }

    }
}
