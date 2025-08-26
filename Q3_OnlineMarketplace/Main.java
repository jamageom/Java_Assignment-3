public class Main {
    public static void main(String[] args) {
        Sellable laptop = new ElectronicItem("Laptop", "Electronics", 50000);
        Sellable tshirt = new ClothingItem("T-Shirt", "Clothing", 1000);

        laptop.displayItemDetails();
        System.out.println();
        tshirt.displayItemDetails();
    }
}
