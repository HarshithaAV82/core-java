class Office{
    String name;
    String location;
    String companyType;
    String manager;
    String department;
    String buildingType;
    String country;
    String workingHours;
    String shiftType;
    String facility;
    double area;
    double budget;
    double rating;
    double rent;
    int employees;
    int floors;
    int cabins;
    boolean acAvailable;
    boolean cafeteria;
    boolean parking;

    Office(String name, String location, String companyType, String manager,
           String department, String buildingType, String country,
           String workingHours, String shiftType, String facility,
           double area, double budget, double rating, double rent,
           int employees, int floors, int cabins,
           boolean acAvailable, boolean cafeteria, boolean parking) {

        this.name = name;
        this.location = location;
        this.companyType = companyType;
        this.manager = manager;
        this.department = department;
        this.buildingType = buildingType;
        this.country = country;
        this.workingHours = workingHours;
        this.shiftType = shiftType;
        this.facility = facility;
        this.area = area;
        this.budget = budget;
        this.rating = rating;
        this.rent = rent;
        this.employees = employees;
        this.floors = floors;
        this.cabins = cabins;
        this.acAvailable = acAvailable;
        this.cafeteria = cafeteria;
        this.parking = parking;
    }

    void displayOfficeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Company Type: " + companyType);
        System.out.println("Manager: " + manager);
        System.out.println("Department: " + department);
        System.out.println("Building Type: " + buildingType);
        System.out.println("Country: " + country);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Shift Type: " + shiftType);
        System.out.println("Facility: " + facility);
        System.out.println("Area: " + area);
        System.out.println("Budget: " + budget);
        System.out.println("Rating: " + rating);
        System.out.println("Rent: " + rent);
        System.out.println("Employees: " + employees);
        System.out.println("Floors: " + floors);
        System.out.println("Cabins: " + cabins);
        System.out.println("AC Available: " + acAvailable);
        System.out.println("Cafeteria: " + cafeteria);
        System.out.println("Parking: " + parking);

    }
}