class ProductRunner{

    public static void main(String[] args){

        Product p1 = new Product(1, "Book", 30.0, 10, "Stationery", 10);
        Product p2 = new Product(2, "Pen", 10.0, 20, "Stationery", 5);
        Product p3 = new Product(3, "Notebook", 50.0, 15, "Stationery", 8);

        ShoppingCart cart = new ShoppingCart();

        cart.cartId = 101;
        cart.customerName = "Harshitha";

        cart.addProduct(p1, 2);
        cart.addProduct(p2, 3);
        cart.addProduct(p3, 1);

        cart.generateBill();
    }
}