class ClockRunner {

    public static void main(String... values) {

        SmartClock smartClock1 = new SmartClock();
        System.out.println(smartClock1.name);
        System.out.println(smartClock1.price);
        System.out.println(smartClock1.shape);
        System.out.println(smartClock1.chargeable);
        System.out.println(smartClock1.screenTime);
        System.out.println(smartClock1.warranty);
        System.out.println(smartClock1.quality);
        System.out.println(smartClock1.gps);
        smartClock1.startClock();
        smartClock1.stopClock();
        smartClock1.displayFunction();

        SmartClock smartClock2 = new SmartClock();
        System.out.println(smartClock2.name);
        System.out.println(smartClock2.price);
        System.out.println(smartClock2.shape);
        System.out.println(smartClock2.chargeable);
        System.out.println(smartClock2.screenTime);
        System.out.println(smartClock2.warranty);
        System.out.println(smartClock2.quality);
        System.out.println(smartClock2.gps);
        smartClock2.startClock();
        smartClock2.stopClock();
        smartClock2.displayFunction();

        Clock clock1 = new SmartClock();
        System.out.println(clock1.name);
        System.out.println(clock1.price);
        System.out.println(clock1.shape);
        clock1.startClock();
        clock1.stopClock();
        
        Clock clock2 = new SmartClock();
        System.out.println(clock2.name);
        System.out.println(clock2.price);
        System.out.println(clock2.shape);
        clock2.startClock();
        clock2.stopClock();
        

        Clock time1 = new Clock();
        System.out.println(time1.name);
        System.out.println(time1.price);
        System.out.println(time1.shape);
		time1.startClock();
		time1.stopClock();

        Clock time2 = new Clock();
        System.out.println(time2.name);
        System.out.println(time2.price);
        System.out.println(time2.shape);
		time2.startClock();
		time2.stopClock();
    }
}