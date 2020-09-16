import garage.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Clio", "renault clio 3", "renault", 2005, "gris mat", 225, new int[] {4832,1720,1497},
        1240, 4, 150, "diesel", List.of(new String[]{"vitres électriques", "gps"}));
    }
}
