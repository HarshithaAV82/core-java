class Napkin{

    int quantity;
    Brand brand;
    NapkinType napkinType;

    Napkin(int quantity, Brand brand, NapkinType napkinType) {
        this.quantity = quantity;
        this.brand = brand;
        this.napkinType = napkinType;
    }

    void printInfo() {

        System.out.println("Napkin Quantity: " + this.quantity);

        if (brand != null) {
            System.out.println("Brand Name: " + brand.name);
        } else {
            System.out.println("Brand is null...");
        }

        if (napkinType != null) {
            System.out.println("Napkin Type: " + this.napkinType);
        } else {
            System.out.println("NapkinType is null...");
        }
    }
}