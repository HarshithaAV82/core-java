class HospitalManagementSystem{

    public static void main(String[] args) {

        String patientName = "Arun";
        int age = 30;
        String symptoms = "Fever";
        String mobile = "9876543210";

        if (patientName == null) {
            System.out.println("Invalid Name");
        }
        if (age <= 0) {
            System.out.println("Invalid Age");
        }
        if (symptoms == null) {
            System.out.println("Symptoms missing");
        }
        if (mobile.length() != 10) {
            System.out.println("Invalid Mobile Number");
        }

      
        String department = "Cardiology";

        if (department == "Cardiology") {
            System.out.println("Heart Department");
        }
        else if (department == "Neurology") {
            System.out.println("Brain Department");
        }
        else if (department == "Orthopedic") {
            System.out.println("Bone Department");
        }
        else if (department == "General") {
            System.out.println("General Checkup");
        }
        else {
            System.out.println("Invalid Department");
        }

       
        int doctorType = 2;

        switch (doctorType) {
            case 1:
                System.out.println("Senior Doctor");
                break;
            case 2:
                System.out.println("Junior Doctor");
                break;
            case 3:
                System.out.println("Specialist");
                break;
            case 4:
                System.out.println("Surgeon");
                break;
            default:
                System.out.println("Invalid Doctor Type");
        }

      
        for (int i = 1; i <= 5; i++) {
            System.out.println("Medicine " + i);
        }

       
        int beds = 5;
        while (beds > 0) {
            System.out.println("Beds Available: " + beds);
            beds--;
        }

      
        int token = 1;
        do {
            System.out.println("Appointment Attempt " + token);
            token++;
        }
        while(token <= 3);
    }
}