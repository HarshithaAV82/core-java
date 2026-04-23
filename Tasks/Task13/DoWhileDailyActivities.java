class DoWhileDailyActivities {

    public static void main(String[] args) {
   
        increaseGymWeight();
        increaseReadingPages();
        increasePlantHeight();
        increaseOnlineFollowers();
        increaseProjectProgress();

        decreaseFuelInCar();
        decreaseDataBalance();
        decreaseIceCreamScoops();
        decreaseLibraryBooks();
        decreaseDiscountOfferDays();
    }


    static void increaseGymWeight() {
        System.out.println("Gym Weight Training Progress");
        int weight = 10;
        do {
            System.out.println("Lifting Weight: " + weight + " kg");
            weight += 5;
        } while (weight <= 30);
    }

    static void increaseReadingPages() {
        System.out.println("Reading Book Pages");
        int pages = 5;
        do {
            System.out.println("Pages Read: " + pages);
            pages += 5;
        } while (pages <= 25);
    }

    static void increasePlantHeight() {
        System.out.println("Plant Growing");
        int height = 2;
        do {
            System.out.println("Plant Height: " + height + " cm");
            height += 2;
        } while (height <= 10);
    }

    static void increaseOnlineFollowers() {
        System.out.println("Social Media Followers Increasing");
        int followers = 100;
        do {
            System.out.println("Followers: " + followers);
            followers += 100;
        } while (followers <= 500);
    }

    static void increaseProjectProgress() {
        System.out.println("Project Completion Progress");
        int progress = 20;
        do {
            System.out.println("Progress: " + progress + "%");
            progress += 20;
        } while (progress <= 100);
    }

 

    static void decreaseFuelInCar() {
        System.out.println("Car Fuel Decreasing");
        int fuel = 20;
        do {
            System.out.println("Fuel Left: " + fuel + " Liters");
            fuel -= 5;
        } while (fuel >= 0);
    }

    static void decreaseDataBalance() {
        System.out.println("Internet Data Usage");
        int data = 10;
        do {
            System.out.println("Data Remaining: " + data + " GB");
            data -= 2;
        } while (data >= 0);
    }

    static void decreaseIceCreamScoops() {
        System.out.println("Eating Ice Cream Scoops");
        int scoops = 5;
        do {
            System.out.println("Scoops Left: " + scoops);
            scoops--;
        } while (scoops >= 0);
    }

    static void decreaseLibraryBooks() {
        System.out.println("Returning Library Books");
        int books = 4;
        do {
            System.out.println("Books Remaining: " + books);
            books--;
        } while (books >= 0);
    }

    static void decreaseDiscountOfferDays() {
        System.out.println("Offer Closing Soon");
        int days = 5;
        do {
            System.out.println("Offer Valid for: " + days + " Days");
            days--;
        } while (days >= 1);
    }
}