public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car(),
            new Motorcycle()
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.startEngine());
        }
    }
}
