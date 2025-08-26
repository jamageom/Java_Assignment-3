class Car extends Vehicle implements FuelEfficient {
    Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void start() {
        System.out.println("Car Started...");
    }

    @Override
    public double calculateMileage() {
        return 18.0;
    }
}
