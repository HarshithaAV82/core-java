class PVRRunner{

    public static void main(String[] args) {

        PVR pvr1 = new PVR("PVR Orion","Rajajinagar","Bangalore","IMAX",
            "Leo","10:00 AM","Gold","Kannada","2D","Popcorn Combo",350.0,70.0,4.5,50.0, 8,1200,300,true,true,true);
        pvr1.show();

        PVR pvr2 = new PVR("PVR Forum","Koramangala","Bangalore","Normal",
            "Jailer","1:00 PM","Silver","Tamil","2D","Nachos Combo",250.0,60.0,4.3,40.0,6,900,250,false,false,true);
        pvr2.show();

        PVR pvr3 = new PVR("PVR Phoenix","Whitefield","Bangalore","IMAX",
            "RRR","6:00 PM","Recliner","Telugu","3D","Burger Combo",450.0,75.0,4.8,60.0,10,1500,400,true,true,true);
        pvr3.show();

        PVR pvr4 = new PVR("PVR Nexus","Mysore Road","Bangalore","4DX",
            "KGF","9:00 PM","Gold","Kannada","4DX","Pepsi Combo",500.0,80.0,4.7,50.0,7,1100,200,true,false,true);
        pvr4.show();

        PVR pvr5 = new PVR("PVR Lulu","Kochi","Kerala","IMAX",
            "Salaar","4:00 PM","Silver","Malayalam","2D","Popcorn",300.0,65.0,4.4,30.0,5,800,150,false,true,true);
        pvr5.show();

        PVR pvr6 = new PVR("PVR Inorbit","Hyderabad","Telangana","Normal",
            "Pushpa","7:00 PM","Gold","Telugu","2D","Burger",280.0,60.0,4.2,35.0,6,950,220,false,false,true);
        pvr6.show();

        PVR pvr7 = new PVR("PVR Select","Delhi","Delhi","IMAX",
            "Dunki","5:30 PM","Recliner","Hindi","3D","Combo Meal",480.0,78.0,4.6,70.0,9,1400,350,true,true,true);
        pvr7.show();

        PVR pvr8 = new PVR("PVR VR Mall","Chennai","Tamil Nadu","4DX",
            "Master","8:00 PM","Gold","Tamil","4DX","Snacks Combo",520.0,82.0,4.5,55.0,8,1300,280,true,false,true);
        pvr8.show();

        PVR pvr9 = new PVR("PVR Pacific","Pune","Maharashtra","Normal",
            "Animal","3:00 PM","Silver","Hindi","2D","Cold Drink",260.0,58.0,4.1,25.0,5,700,180,false,false,true);
        pvr9.show();

        PVR pvr10 = new PVR("PVR City Center","Mumbai","Maharashtra","IMAX",
            "Pathaan","11:00 AM","Gold","Hindi","3D","Popcorn Combo",400.0,72.0,4.6,60.0,10,1600,500,true,true,true);
        pvr10.show();
    }
}