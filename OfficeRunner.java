class OfficeRunner{

    public static void main(String[] args) {

        Office office1 = new Office("TechPark","Bangalore","IT","Ravi",
            "Development","Commercial","India","9AM-6PM","Day","WiFi",
            5000,1000000,4.5,200000,300,5,50,true,true,true);
        office1.displayOfficeInfo();

        Office office2 = new Office("FinCorp","Mumbai","Finance","Anita",
            "Accounts","Corporate","India","10AM-7PM","Day","Conference Hall",
            4000,800000,4.2,150000,200,4,40,true,true,true);
        office2.displayOfficeInfo();

        Office office3 = new Office("HealthPlus","Delhi","Healthcare","Suresh",
            "Medical","Hospital","India","24 Hours","Night","Ambulance",
            7000,2000000,4.7,300000,500,6,70,true,true,true);
        office3.displayOfficeInfo();

        Office office4 = new Office("EduWorld","Chennai","Education","Meena",
            "Teaching","Campus","India","8AM-4PM","Day","Library",
            6000,900000,4.3,180000,250,3,35,true,false,true);
        office4.displayOfficeInfo();

        Office office5 = new Office("StartUp Hub","Hyderabad","Startup","Kiran",
            "Innovation","Tech Park","India","Flexible","Day","Cafeteria",
            3500,500000,4.0,120000,120,2,20,true,true,false);
        office5.displayOfficeInfo();

        Office office6 = new Office("GlobalSoft","Pune","IT","Arjun",
            "Support","Commercial","India","9AM-5PM","Day","Gym",
            4500,950000,4.4,170000,280,4,45,true,true,true);
        office6.displayOfficeInfo();

        Office office7 = new Office("MediaHouse","Kolkata","Media","Latha",
            "Production","Studio","India","11AM-8PM","Day","Studio",
            3000,600000,3.9,100000,150,2,25,true,false,true);
        office7.displayOfficeInfo();

        Office office8 = new Office("AutoTech","Chandigarh","Manufacturing","Vikram",
            "Production","Factory","India","8AM-6PM","Day","Warehouse",
            8000,1500000,4.1,250000,400,5,60,false,true,true);
        office8.displayOfficeInfo();

        Office office9 = new Office("RetailMart","Ahmedabad","Retail","Priya",
            "Sales","Mall","India","10AM-9PM","Shift","Parking",
            5500,700000,3.8,130000,220,3,30,true,true,true);
        office9.displayOfficeInfo();

        Office office10 = new Office("GreenEnergy","Jaipur","Energy","Manoj",
            "Operations","Industrial","India","9AM-6PM","Day","Solar Plant",
            9000,2500000,4.6,350000,600,7,80,true,true,true);
        office10.displayOfficeInfo();
    }
}