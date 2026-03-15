class ShoppingCart{

    int cartId;
    String customerName;
    double totalAmount = 0;

    void addProduct(Product p, int quantity){

        double price = p.addToCart(quantity);

        if (price < 0) {
            System.out.println("Product cannot be added");
        } else {
            totalAmount = totalAmount + price;
            System.out.println(p.productName + " added to cart");
        }
    }

    void generateBill(){

        System.out.println("Customer Name: " + customerName);
        System.out.println("Cart Id: " + cartId);
        System.out.println("Total Amount: " + totalAmount);
    }
}