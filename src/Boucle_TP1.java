public class Boucle_TP1 {
    public static void main(String[] args) {
        for(int i=2; i<=10; i++){

            System.out.printf("Table de %d \n",i);
            for(int j=1; j<=10; j++){
                System.out.printf("%d * %d = %d \n",j,i,i*j);
            }
            System.out.println(); //pour revenir à la ligne et de faire un espace entre les tables
        }
    }
}
