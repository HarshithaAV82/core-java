class LabourRunner {

    public static void main(String[] args) {

       
        Labour labour1 = new Labour();
        labour1.name = "Anjala";
        labour1.salary = 15000.00;
        labour1.idProofs = new String[]{"Aadhar", "PAN"};
		System.out.println("Labour 1 Name: " + labour1.name);
        System.out.println("Labour 1 Salary: " + labour1.salary);
        System.out.println("Labour 1 ID Proofs:");
        for (int i = 0; i < labour1.idProofs.length; i++) {
            System.out.println(labour1.idProofs[i]);
        }

       
        Labour labour2 = new Labour();
        labour2.name = "Madhu";
        labour2.salary = 18000.00;
        labour2.idProofs = new String[]{"Voter ID", "Driving License"};
		System.out.println("Labour 2 Name: " + labour2.name);
        System.out.println("Labour 2 Salary: " + labour2.salary);
        System.out.println("Labour 2 ID Proofs:");
        for (int i = 0; i < labour2.idProofs.length; i++) {
            System.out.println(labour2.idProofs[i]);
        }
    }
}