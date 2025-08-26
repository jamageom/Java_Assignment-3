class ElectronicItem extends Product {
    double price;

    ElectronicItem(String name, String category, double price) {
        super(name, category);
        this.price = price;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: ₹" + price);
        System.out.println("Discounted Price: ₹" + getPrice());
    }

    @Override
    public double getPrice() {
        return price - calculateDiscount();
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;
    }
}
