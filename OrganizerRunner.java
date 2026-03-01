class OrganizerRunner{

    public static void main(String[] args) {

        Organizer organizer1 = new Organizer("Cello","Desk","Plastic","Black",
            "Office","Rectangular","India","ORG101","Medium","Stationery",
            499,1.2,10.0,20.0,5,100,2024,true,false,true);
        organizer1.showOrganizerDetails();

        Organizer organizer2 = new Organizer("AmazonBasics","Drawer","Wood","Brown",
            "Home","Square","USA","ORG102","Large","Storage",
            899,2.5,15.0,25.0,8,50,2023,false,true,true);
        organizer2.showOrganizerDetails();

        Organizer organizer3 = new Organizer("Ikea","Shelf","Metal","White",
            "Kitchen","Rectangular","Sweden","ORG103","Large","Utility",
            1299,3.0,20.0,30.0,10,30,2024,false,true,true);
        organizer3.showOrganizerDetails();

        Organizer organizer4 = new Organizer("Classmate","Bag","Fabric","Blue",
            "School","Round","India","ORG104","Small","Travel",
            699,0.8,12.0,18.0,6,80,2024,true,false,false);
        organizer4.showOrganizerDetails();

        Organizer organizer5 = new Organizer("Milton","Box","Plastic","Red",
            "Kitchen","Square","India","ORG105","Medium","Container",
            399,1.0,8.0,16.0,4,120,2023,true,true,true);
        organizer5.showOrganizerDetails();

        Organizer organizer6 = new Organizer("HomeCentre","Rack","Wood","Cream",
            "Living Room","Rectangular","India","ORG106","Large","Furniture",
            2499,4.5,25.0,40.0,12,20,2024,false,false,true);
        organizer6.showOrganizerDetails();

        Organizer organizer7 = new Organizer("Wildcraft","Pouch","Nylon","Green",
            "Travel","Oval","India","ORG107","Small","Accessories",
            299,0.5,6.0,12.0,3,150,2024,true,true,false);
        organizer7.showOrganizerDetails();

        Organizer organizer8 = new Organizer("Flipkart","Tray","Plastic","Yellow",
            "Office","Rectangular","India","ORG108","Medium","Desk",
            349,0.9,7.0,14.0,5,90,2023,false,false,true);
        organizer8.showOrganizerDetails();

        Organizer organizer9 = new Organizer("Prestige","Stand","Steel","Silver",
            "Kitchen","Round","India","ORG109","Medium","Utensil",
            799,1.8,18.0,22.0,7,60,2024,false,true,true);
        organizer9.showOrganizerDetails();

        Organizer organizer10 = new Organizer("Tupperware","Container","Plastic","Purple",
            "Food Storage","Square","USA","ORG110","Small","Kitchen",
            599,1.1,9.0,15.0,4,70,2024,true,true,true);
        organizer10.showOrganizerDetails();
    }
}