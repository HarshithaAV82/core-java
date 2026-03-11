class JamoonRunner{

    public static void main(String[] args){

        String[] flavors = new String[3];
        flavors[0] = "Milk Jamoon";
        flavors[1] = "Khoya Jamoon";
        flavors[2] = "Dry Jamoon";

        Sweet[] sweets = new Sweet[3];
        sweets[0] = new Sweet("Soft Jamoon", 25);
        sweets[1] = new Sweet("Hot Jamoon", 30);
        sweets[2] = new Sweet("Mini Jamoon", 20);

        Jamoon jamoon = new Jamoon(flavors, sweets);
        jamoon.display();
    }
}