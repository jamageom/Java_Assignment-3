abstract class Product implements Sellable {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    abstract double calculateDiscount();
}
