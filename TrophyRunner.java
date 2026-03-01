class TrophyRunner{

    public static void main(String[] args) {

        Trophy trophy1 = new Trophy("Champions Cup","Cricket League","India Team","Sports",
            "Metal","Gold","Cup","ICC","India","Best Team 2025",
            35.5,5.0,15000,12.0,2025,1,1,true,true,true);
        trophy1.displayDetails();

        Trophy trophy2 = new Trophy("Best Actor Award","Film Awards","Raj Kumar","Entertainment",
            "Brass","Golden","Star","Filmfare","India","Best Actor",
            30.0,3.5,10000,10.0,2024,1,2,true,false,true);
        trophy2.displayDetails();

        Trophy trophy3 = new Trophy("Coding Champion","Hackathon","Harshitha","Technology",
            "Steel","Silver","Shield","Google","USA","Top Coder",
            25.0,2.5,8000,9.0,2025,1,5,false,true,true);
        trophy3.displayDetails();

        Trophy trophy4 = new Trophy("Best Singer","Music Fest","Arjun","Music",
            "Crystal","Transparent","Mic","Sony","UK","Top Vocalist",
            28.0,2.0,7000,8.0,2023,1,3,false,true,false);
        trophy4.displayDetails();

        Trophy trophy5 = new Trophy("Science Award","Science Expo","Meena","Education",
            "Glass","Clear","Flame","ISRO","India","Innovator",
            32.0,4.0,12000,11.0,2025,1,1,true,false,true);
        trophy5.displayDetails();

        Trophy trophy6 = new Trophy("Football Cup","World Cup","Brazil Team","Sports",
            "Metal","Gold","Globe","FIFA","Brazil","Champions",
            40.0,6.0,20000,14.0,2022,1,1,true,true,true);
        trophy6.displayDetails();

        Trophy trophy7 = new Trophy("Dance Trophy","Dance Show","Ananya","Entertainment",
            "Plastic","Golden","Star","Zee","India","Winner",
            20.0,1.5,5000,7.0,2024,1,4,false,true,false);
        trophy7.displayDetails();

        Trophy trophy8 = new Trophy("Debate Award","College Fest","Rahul","Education",
            "Wood","Brown","Shield","College","India","Best Speaker",
            22.0,2.0,4000,6.0,2023,1,6,false,false,true);
        trophy8.displayDetails();

        Trophy trophy9 = new Trophy("Startup Award","Business Summit","TechCorp","Business",
            "Glass","Blue","Tower","Startup India","India","Best Startup",
            33.0,3.8,18000,12.5,2025,1,2,true,true,true);
        trophy9.displayDetails();

        Trophy trophy10 = new Trophy("Art Excellence","Art Expo","Latha","Arts",
            "Crystal","Silver","Abstract","Art Council","France","Creative Genius",
            27.0,2.3,9000,8.5,2024,1,3,false,true,true);
        trophy10.displayDetails();
    }
}