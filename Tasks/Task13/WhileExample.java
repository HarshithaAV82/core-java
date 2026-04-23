class WhileExample{

    public static void main(String[] args) {

        salaryGrowth();
        marksGrowth();
        savingsGrowth();
        waterTankFill();
        walkingStepsIncrease();

        batteryDrain();
        petrolUsage();
        examDaysCountdown();
        ticketSelling();
        temperatureDrop();
    }


    static void salaryGrowth() {
        int salary = 15000;
        while (salary <= 19000) {
            System.out.println("Salary: " + salary);
            salary += 1000;
        }
    }

    static void marksGrowth() {
        int marks = 60;
        while (marks <= 80) {
            System.out.println("Marks: " + marks);
            marks += 5;
        }
    }

    static void savingsGrowth() {
        int savings = 5000;
        while (savings <= 9000) {
            System.out.println("Savings: " + savings);
            savings += 1000;
        }
    }

    static void waterTankFill() {
        int water = 0;
        while (water <= 20) {
            System.out.println("Water Level: " + water + " Liters");
            water += 5;
        }
    }

    static void walkingStepsIncrease() {
        int steps = 1000;
        while (steps <= 5000) {
            System.out.println("Steps: " + steps);
            steps += 1000;
        }
    }


    static void batteryDrain() {
        int battery = 100;
        while (battery >= 0) {
            System.out.println("Battery: " + battery + "%");
            battery -= 20;
        }
    }

    static void petrolUsage() {
        int petrol = 10;
        while (petrol >= 0) {
            System.out.println("Petrol: " + petrol + " Liters");
            petrol -= 2;
        }
    }

    static void examDaysCountdown() {
        int days = 5;
        while (days >= 1) {
            System.out.println("Days Left: " + days);
            days--;
        }
    }

    static void ticketSelling() {
        int tickets = 5;
        while (tickets >= 0) {
            System.out.println("Tickets Remaining: " + tickets);
            tickets--;
        }
    }

    static void temperatureDrop() {
        int temp = 30;
        while (temp >= 25) {
            System.out.println("Temperature: " + temp + "degree C");
            temp--;
        }
    }
}