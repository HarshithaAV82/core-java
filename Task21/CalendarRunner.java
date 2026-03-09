class CalendarRunner{

    public static void main(String[] args){

        Event event1 = new Event("Festival");
        Event event2 = new Event("Meeting");

        Calendar calendar1 = new Calendar(2024, event1, CalendarType.WALL);
        Calendar calendar2 = new Calendar(2025, event2, CalendarType.DESK);
        Calendar calendar3 = new Calendar(2026, event2, CalendarType.DIGITAL);
        Calendar calendar4 = new Calendar(2027, event1, CalendarType.POCKET);

        calendar1.printInfo();
        calendar2.printInfo();
        calendar3.printInfo();
        calendar4.printInfo();
    }
}