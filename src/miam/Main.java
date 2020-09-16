package miam;

public class Main {
    public static void main(String[] args) {

        Four grandFour = new Four();
        grandFour.getCapacite();
        grandFour.getPuissance();

        Aliment cake = new Aliment();
        cake.nom = "Cake aux fruits";
        cake.estCuit = false;

        cake.manger();
        System.out.println();
        grandFour.cuire(cake);
        System.out.println();
        cake.manger();

    }
}
