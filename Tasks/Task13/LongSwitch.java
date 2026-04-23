class LongSwitch {

    public static void main(String[] args) {
        longSalary(50000L); 
    }

    static void longSalary(long salary) {
        switch((int)salary) { 
            case 20000:
                System.out.println("Salary is 20,000 - Entry Level");
                break;
            case 40000:
                System.out.println("Salary is 40,000 - Junior Level");
                break;
            case 50000:
                System.out.println("Salary is 50,000 - Mid Level");
                break;
            case 70000:
                System.out.println("Salary is 70,000 - Senior Level");
                break;
            case 100000:
                System.out.println("Salary is 1,00,000 - Expert Level");
                break;
            default:
                System.out.println("Salary is other than the above brackets");
                break;
        }
    }
}
