class Cashew{

    int quantity;
    Buyer buyer;
    CashewType cashewType;

    Cashew(int quantity, Buyer buyer, CashewType cashewType) {
        this.quantity = quantity;
        this.buyer = buyer;
        this.cashewType = cashewType;
    }

    void printInfo() {

        System.out.println("Quantity: " + this.quantity);

        if (buyer != null) {
            System.out.println("Buyer Price: " + buyer.price);
        } else {
            System.out.println("Buyer is null...");
        }

        if (cashewType != null) {
            System.out.println("Cashew Type: " + cashewType);
        } else {
            System.out.println("CashewType is null...");
        }
    }
}