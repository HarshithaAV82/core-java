class DiabetesRunner{

    public static void main(String[] args) {

        Diabetes diabetes1 = new Diabetes("Type 1","Genetic","Frequent Urination","Insulin",
            "Metformin","Low Sugar","Walking","Obesity","Healthy Diet","Dr.Raj",
            180.0,15.0,24.5,120.0,30,5,10,true,true,false);
        diabetes1.printDetails();

        Diabetes diabetes2 = new Diabetes("Type 2","Lifestyle","Fatigue","Diet Control",
            "Insulin","Low Carb","Yoga","Family History","Exercise","Dr.Sita",
            150.0,12.0,26.0,130.0,45,3,8,true,false,true);
        diabetes2.printDetails();

        Diabetes diabetes3 = new Diabetes("Gestational","Pregnancy","High Sugar","Monitoring",
            "None","Balanced Diet","Light Exercise","Hormonal","Checkups","Dr.Ajay",
            140.0,10.0,23.0,110.0,28,1,5,false,false,true);
        diabetes3.printDetails();

        Diabetes diabetes4 = new Diabetes("Type 1","Autoimmune","Thirst","Insulin Therapy",
            "Insulin","Strict Diet","Gym","Genetic","Monitoring","Dr.Priya",
            200.0,18.0,25.0,140.0,35,7,15,true,true,false);
        diabetes4.printDetails();

        Diabetes diabetes5 = new Diabetes("Type 2","Obesity","Blur Vision","Medication",
            "Metformin","Low Sugar","Walking","Age","Healthy Lifestyle","Dr.Kiran",
            160.0,14.0,28.0,135.0,50,6,12,true,false,false);
        diabetes5.printDetails();

        Diabetes diabetes6 = new Diabetes("Type 1","Genetic","Weight Loss","Insulin",
            "Insulin","Controlled Diet","Running","Family","Prevention","Dr.Anil",
            170.0,16.0,22.5,125.0,25,4,9,true,true,true);
        diabetes6.printDetails();

        Diabetes diabetes7 = new Diabetes("Type 2","Diet","Fatigue","Tablets",
            "Glimepiride","Low Carb","Yoga","Lifestyle","Avoid Sugar","Dr.Meena",
            155.0,13.0,27.0,128.0,48,5,11,false,false,true);
        diabetes7.printDetails();

        Diabetes diabetes8 = new Diabetes("Type 2","Stress","Headache","Insulin",
            "Metformin","Low Fat","Gym","Stress","Relaxation","Dr.Arjun",
            165.0,14.0,29.0,132.0,52,8,14,false,false,false);
        diabetes8.printDetails();

        Diabetes diabetes9 = new Diabetes("Type 1","Genetic","Nausea","Insulin",
            "Insulin","Healthy Food","Walking","Family","Awareness","Dr.Latha",
            190.0,17.0,24.0,138.0,33,6,13,true,true,false);
        diabetes9.printDetails();

        Diabetes diabetes10 = new Diabetes("Type 2","Lifestyle","Sweating","Medication",
            "Metformin","Low Sugar","Cycling","Obesity","Diet Control","Dr.Vijay",
            145.0,11.0,26.5,118.0,40,3,7,false,false,true);
        diabetes10.printDetails();
    }
}