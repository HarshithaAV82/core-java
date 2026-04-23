class PVR{

    String theaterName;
    String location;
    String city;
    String screenType;
    String movieName;
    String showTime;
    String seatType;
    String language;
    String format;
    String foodCombo;
    double ticketPrice;
    double screenSize;
    double rating;
    double parkingFee;
    int totalScreens;
    int totalSeats;
    int availableSeats;
    boolean is3D;
    boolean isIMAX;
    boolean onlineBookingAvailable;

    PVR(String theaterName, String location, String city, String screenType,
        String movieName, String showTime, String seatType, String language,
        String format, String foodCombo,
        double ticketPrice, double screenSize, double rating, double parkingFee,
        int totalScreens, int totalSeats, int availableSeats,
        boolean is3D, boolean isIMAX, boolean onlineBookingAvailable) {

        this.theaterName = theaterName;
        this.location = location;
        this.city = city;
        this.screenType = screenType;
        this.movieName = movieName;
        this.showTime = showTime;
        this.seatType = seatType;
        this.language = language;
        this.format = format;
        this.foodCombo = foodCombo;
        this.ticketPrice = ticketPrice;
        this.screenSize = screenSize;
        this.rating = rating;
        this.parkingFee = parkingFee;
        this.totalScreens = totalScreens;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.is3D = is3D;
        this.isIMAX = isIMAX;
        this.onlineBookingAvailable = onlineBookingAvailable;
    }

   void show(){
    System.out.println("Theater Name: " + theaterName);
    System.out.println("Location: " + location);
    System.out.println("City: " + city);
    System.out.println("Screen Type: " + screenType);
    System.out.println("Movie Name: " + movieName);
    System.out.println("Show Time: " + showTime);
    System.out.println("Seat Type: " + seatType);
    System.out.println("Language: " + language);
    System.out.println("Format: " + format);
    System.out.println("Food Combo: " + foodCombo);
    System.out.println("Ticket Price: " + ticketPrice);
    System.out.println("Screen Size: " + screenSize);
    System.out.println("Rating: " + rating);
    System.out.println("Parking Fee: " + parkingFee);
    System.out.println("Total Screens: " + totalScreens);
    System.out.println("Total Seats: " + totalSeats);
    System.out.println("Available Seats: " + availableSeats);
    System.out.println("3D Available: " + is3D);
    System.out.println("IMAX Available: " + isIMAX);
    System.out.println("Online Booking Available: " + onlineBookingAvailable);

   
}
}