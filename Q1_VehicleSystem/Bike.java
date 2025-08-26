class Bike extends Vehicle implements FuelEfficient {
    Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void start() {
        System.out.println("Bike Started...");
    }

    @Override
    public double calculateMileage() {
        return 40.0;
    }
}
