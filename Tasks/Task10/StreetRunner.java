class StreetRunner {

    public static void main(String[] args) {
        
        String streetName = "MG Road";

        double length = Street.getLength(streetName);
        System.out.println("Street Length: " + length + " km");

        int pincode = Street.getPincode(streetName);
        System.out.println("Street Pincode: " + pincode);
    }
}
