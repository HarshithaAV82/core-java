class Calendar{

    int year;
    Event event;
    CalendarType calendarType;

    Calendar(int year, Event event, CalendarType calendarType) {
        this.year = year;
        this.event = event;
        this.calendarType = calendarType;
    }

    void printInfo() {

        System.out.println("Year: " + this.year);

        if (event != null) {
            System.out.println("Event Name: " + event.name);
        } else {
            System.out.println("Event is null...");
        }

        if (calendarType != null) {
            System.out.println("Calendar Type: " + this.calendarType);
        } else {
            System.out.println("CalendarType is null...");
        }
    }
}