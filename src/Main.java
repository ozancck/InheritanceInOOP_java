import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Car vehicle1 = new Car("Seat", 4, 250, 6, "1", "2", 4);
        Scooter vehicle2 = new Scooter("Apriliya", 2, 15, 2, false);
        Truck vehicle3 = new Truck("merso", 12, 140, 3, 5000, "2", 8);
        Bicycle vehicle4 = new Bicycle("Bisan", 4, 20, 1, true);
        Car vehicle5 = new Car("opel", 4, 190.0, 4, "1", "1", 3);

        Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3, vehicle4, vehicle5};

        int b = 0;
        for (Vehicle a : vehicles) {
            b++;
            System.out.println("Vehicle #" + b);
            System.out.println(a);
        }

    }
}
