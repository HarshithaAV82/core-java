class UPI {

   
    static void pay(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }
        System.out.println("Paying ₹" + amount);
        System.out.println("Payment data is valid"); 
    }

   
    static void pay(double amount, String receiver) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }
        if (receiver == null) {
            System.out.println("Receiver name cannot be empty");
            return;
        }
        System.out.println("Paying ₹" + amount + " to " + receiver);
        System.out.println("Payment data is valid");  
    }

    static void pay(double amount, String receiver, String note) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }
        if (receiver == null) {
            System.out.println("Receiver name cannot be empty");
            return;
        }
        if (note == null) {
            System.out.println("Note cannot be empty");
            return;
        }
        System.out.println("₹" + amount + " sent to " + receiver + " | Note: " + note);
        System.out.println("Payment data is valid");  
    }
}
