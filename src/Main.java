import garage.Bike;
import garage.Car;
import garage.Vehicle;
import homeshop.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product cafe = new Product("philips HD7866/61", "Philips Senseo Quadrante, noir - 1 ou 2 tasses", 79.99);
        Television tv = new Television("TV Samsung", "Smart TV led incurvé 49\"", 599, 49, "Led");
        Fridge fridge = new Fridge("BEKQ TSE 1042 F", "Réfrigirateur classe A blanc", 189, 130, false);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer);

        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        Vehicle v = new Bike();
    }
}
