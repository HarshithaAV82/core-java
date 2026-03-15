class Product{

    int productId;
    String productName;
    double price;
    int quantityAvailable;
    String category;
    double discountPercentage;

    Product(int productId, String productName, double price,
            int quantityAvailable, String category, double discountPercentage){

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.category = category;
        this.discountPercentage = discountPercentage;
    }

    int getProductId(){
        return this.productId;
    }

    String getProductName(){
        return this.productName;
    }

    double getPrice(){
        return this.price;
    }

    int getQuantityAvailable() {
        return this.quantityAvailable;
    }

    String getCategory() {
        return this.category;
    }

    double getDiscountPercentage() {
        return this.discountPercentage;
    }

    double calculateDiscountedPrice() {
        return price - (price * discountPercentage / 100);
    }

    double addToCart(int quantity){

        if (quantity <= quantityAvailable){
            quantityAvailable = quantityAvailable - quantity;
            return calculateDiscountedPrice() * quantity;
        } else {
            return -1;
        }
    }

    double addToCart(int quantity, boolean isBulkPurchase){

        if (quantity > 20){
            return -2;
        }

        double priceAfterDiscount = calculateDiscountedPrice();

        if (isBulkPurchase && quantity >= 10){
            priceAfterDiscount = priceAfterDiscount - (priceAfterDiscount * 5 / 100);
        }

        if (quantity <= quantityAvailable){
            quantityAvailable = quantityAvailable - quantity;
            return priceAfterDiscount * quantity;
        }

        return -1;
    }
}