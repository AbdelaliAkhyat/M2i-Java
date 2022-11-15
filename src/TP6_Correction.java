import java.util.Scanner;

public class TP6_Correction {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Pour résoudre une équation de 2nd degré (ax2+bx+c = 0), \n" +
                "Veuillez entrer la valeur de a : ");
        double a = keyboardInput.nextDouble();

        System.out.print("Veuillez entrer la valeur de b : ");
        double b = keyboardInput.nextDouble();

        System.out.print("Veuillez entrer la valeur de c : ");
        double c = keyboardInput.nextDouble();

        System.out.println("les trois coefficients entrés sont : a= "+a+" b= "+b+" c= "+c);

        double x1,x2;
        double delta=Math.pow(b,2)-4*a*c;
        if(delta>0){
            x1=(-b-Math.sqrt(delta))/(2*a);
            x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.printf("x1 = %f , x2 = %f",x1,x2);
        }else if(delta==0){
            x1=-b/2*a;
            x2=x1;
            System.out.printf("x1 = x2 = %f",x1);
        }else{
            System.out.println("L'équation n'admet aucune racine réelle.");
        }


    }
}
