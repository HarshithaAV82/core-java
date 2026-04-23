class HospitalSystem {

    public static void main(String[] args) {

        int process = 4;

        switch(process) {

            case 1:
                doctorDepartment("Cardiology");
                break;

            case 2:
                roomNumber(203);
                break;

            case 3:
                bloodGroup('B');
                break;

            case 4:
                patientAge((short)30);
                break;

            case 5:
                wardNumber((byte)3);
                break;

            default:
                System.out.println("Invalid Process");
        }
    }

    static void doctorDepartment(String dept) {

        switch(dept) {
            case "Cardiology":
            case "Neurology":
            case "Orthopedic":
            case "Pediatrics":
            case "Dermatology":
                showResult("Department Available");
                break;
            default:
                showResult("Department Not Available");
        }
    }

    static void roomNumber(int room) {

        switch(room) {
            case 201:
            case 202:
            case 203:
            case 204:
            case 205:
                showResult("Room Allocated");
                break;
            default:
                showResult("Room Not Available");
        }
    }

    static void bloodGroup(char group) {

        switch(group) {
            case 'A':
            case 'B':
            case 'O':
            case 'C':
            case 'D':
                showResult("Blood Group Matched");
                break;
            default:
                showResult("Blood Group Not Matched");
        }
    }

    static void patientAge(short age) {

        switch(age) {
            case 10:
            case 20:
            case 30:
            case 40:
            case 50:
                showResult("Age Category Accepted");
                break;
            default:
                showResult("Age Category Not Accepted");
        }
    }

    static void wardNumber(byte ward) {

        switch(ward) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                showResult("Ward Assigned");
                break;
            default:
                showResult("Ward Not Assigned");
        }
    }

    static void showResult(String message) {

        switch(message) {
            case "Department Available":
            case "Room Allocated":
            case "Blood Group Matched":
            case "Age Category Accepted":
            case "Ward Assigned":
                System.out.println("Process Successful : " + message);
                break;

            default:
                System.out.println("Process Failed : " + message);
        }
    }
}