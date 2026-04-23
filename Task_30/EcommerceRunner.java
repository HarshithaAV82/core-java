class EcommerceRunner{

    public static void main(String[] args){

        Seller seller = new Seller();
        seller.platformInfo();
        seller.sellerDetails();

        Customer customer = new Customer();
        customer.platformInfo();
        customer.customerDetails();
    }
}