public class Point1_VariablesEAffichage {
    public static void main(String[] args) {
        int age = 29;
        String nom = "Akhyat";
        String prenom = "Abdelali";
        double poids = 80.5;

        //System.out.println(age);
        //System.out.println(nom);
        //System.out.println(prenom);
        //System.out.println(poids);

        System.out.println("je m'appelle "+prenom+" "+nom+", j'ai "+age+" ans, et je pèse "+poids+" Kg.");
        //Affichage sans arrondissement    (\n pour tetour à la ligne)
        System.out.printf("Je m'appelle %s %s, j'ai %d ans et je pèse %f kg\n",prenom,nom,age,poids);
        //Affichage avec arrondissement
        System.out.printf("Je m'appelle %s %s, j'ai %d ans et je pèse %.1f kg",prenom,nom,age,poids);

        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d\nPoids : %f",nom,prenom,age,poids);

    }
}