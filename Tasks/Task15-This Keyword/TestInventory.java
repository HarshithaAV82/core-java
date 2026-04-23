public class TestInventory{

    public static void main(String[] args) {

        InventoryManager p1 = new InventoryManager(101, "Laptop", 15, 2, 1200.0, 5, false);
        InventoryManager p2 = new InventoryManager(102, "Winter Jacket", 50, 8, 85.0, 10, true);
        InventoryManager p3 = new InventoryManager(103, "Organic Milk", 5, 12, 4.5, 2, false);
        InventoryManager p4 = new InventoryManager(104, "Smartphone", 100, 5, 800.0, 7, false);

        System.out.println("SMART INVENTORY STATUS REPORT");

        InventoryManager[] products = {p1, p2, p3, p4};

        for (InventoryManager p : products) {

            System.out.println("Product: " + p.productName);
            System.out.println("Status: " + p.checkStockStatus());
            System.out.println("Weekly Revenue: " + p.calculateWeeklyRevenue());
            System.out.println();
        }

        System.out.println("Average Inventory Value: " + InventoryManager.getAverageInventoryValue());

        System.out.println("Restocking Product 103");
        p3.restock(50);

        System.out.println("New Status: " + p3.checkStockStatus());
        System.out.println("Updated Average Inventory Value: " + InventoryManager.getAverageInventoryValue());
    }
}