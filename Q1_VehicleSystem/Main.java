public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda", 80);
        car.displayInfo();
        car.start();
        System.out.println("Mileage: " + ((FuelEfficient) car).calculateMileage() + " km/l");

        System.out.println();

        Vehicle bike = new Bike("Yamaha", 60);
        bike.displayInfo();
        bike.start();
        System.out.println("Mileage: " + ((FuelEfficient) bike).calculateMileage() + " km/l");
    }
}
