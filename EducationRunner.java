class EducationRunner{

    public static void main(String[] args) {

        Education edu1 = new Education("Undergraduate","B.Tech","MIT","Offline",
            "4 Years","Engineering","English","Degree",
            "India","CSE",150000,4.5,90.0,20000,800,60,2024,false,true,true);
        edu1.showEducationInfo();

        Education edu2 = new Education("Postgraduate","MBA","IIM","Offline",
            "2 Years","Management","English","Degree",
            "India","Business",250000,4.8,92.0,50000,400,40,2024,false,true,true);
        edu2.showEducationInfo();

        Education edu3 = new Education("Diploma","Graphic Design","Arena","Online",
            "1 Year","Design","English","Certificate",
            "India","Design",60000,4.2,85.0,10000,200,20,2023,true,true,false);
        edu3.showEducationInfo();

        Education edu4 = new Education("PhD","Data Science","Stanford","Offline",
            "5 Years","Research","English","Doctorate",
            "USA","AI",500000,4.9,95.0,100000,150,30,2024,false,true,true);
        edu4.showEducationInfo();

        Education edu5 = new Education("School","10th Grade","CBSE","Offline",
            "1 Year","General","English","Board",
            "India","Science",50000,4.0,88.0,5000,1000,80,2024,false,true,true);
        edu5.showEducationInfo();

        Education edu6 = new Education("Online Course","Java","Udemy","Online",
            "6 Months","Programming","English","Certificate",
            "USA","IT",5000,4.6,75.0,0,5000,10,2023,true,false,false);
        edu6.showEducationInfo();

        Education edu7 = new Education("Undergraduate","BBA","Christ","Offline",
            "3 Years","Business","English","Degree",
            "India","Commerce",120000,4.4,89.0,15000,600,50,2024,false,true,true);
        edu7.showEducationInfo();

        Education edu8 = new Education("Postgraduate","MCA","VTU","Offline",
            "2 Years","Computer Applications","English","Degree",
            "India","IT",100000,4.3,87.0,12000,350,30,2024,false,true,true);
        edu8.showEducationInfo();

        Education edu9 = new Education("Certification","Cloud","Coursera","Online",
            "4 Months","Cloud","English","Certificate",
            "USA","IT",15000,4.7,78.0,2000,3000,15,2024,true,false,false);
        edu9.showEducationInfo();

        Education edu10 = new Education("Undergraduate","B.Sc","Delhi University","Offline",
            "3 Years","Science","English","Degree",
            "India","Physics",90000,4.3,91.0,10000,700,55,2024,false,true,true);
        edu10.showEducationInfo();
    }
}