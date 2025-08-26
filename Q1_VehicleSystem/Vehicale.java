abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void start();

    void displayInfo() {
        System.out.print("Brand: " + brand + "\n");
        System.out.print("Speed: " + speed + " Km/h\n");
    }
}

