import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Pour résoudre une équation de 2nd degré (ax2+bx+c = 0), \n" +
                "Veuillez entrer la valeur de a : ");
        int a = keyboardInput.nextInt();

        System.out.print("Veuillez entrer la valeur de b : ");
        int b = keyboardInput.nextInt();

        System.out.print("Veuillez entrer la valeur de c : ");
        int c = keyboardInput.nextInt();

        System.out.println("les trois coefficients entrés sont : a= "+a+" b= "+b+" c= "+c);

        double delta= Math.pow(b,2)-4*a*c;
        int x0= -(b/(2*a));
        double x1= (-b-(Math.sqrt(delta)))/(2*a);
        double x2= (-b+(Math.sqrt(delta)))/(2*a);

        if(delta>0){

            System.out.printf("L'équation (%d)x² + (%d)x + (%d) = 0 a deux solutions distinctes :\n" +
                    "x1= %.2f et x2= %.2f",a,b,c,x1,x2);
        }else if(delta==0){

                System.out.printf("L'équation (%d)x² + (%d)x + (%d) = 0 a une unique solution :\n" +
                        "x0= %.2f ",a,b,c,x0);
        }else{
            System.out.println("L'équation ("+a+")x² + ("+b+")x + ("+c+") = 0 n'a pas de solution réelle");
        }





    }
}
