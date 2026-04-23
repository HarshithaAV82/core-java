class MountainPeakRunner{

    public static void main(String[] args) {

        MountainPeak peak1 = new MountainPeak();
        System.out.println("Default Peak Name: " + peak1.peakName);
        System.out.println("Default Height: " + peak1.heightInMeters);
        System.out.println("Default Location: " + peak1.location);
        System.out.println("Default Climate Type: " + peak1.climateType);
        peak1.peakName = "Everest";
        peak1.heightInMeters = 8848.86;
        peak1.location = "Nepal";
        peak1.climateType = "Cold";
        System.out.println("After re-initialization");
        System.out.println("Peak Name: " + peak1.peakName);
        System.out.println("Height: " + peak1.heightInMeters);
        System.out.println("Location: " + peak1.location);
        System.out.println("Climate Type: " + peak1.climateType);

        MountainPeak peak2 = new MountainPeak();
        System.out.println("Default Peak Name: " + peak2.peakName);
        System.out.println("Default Height: " + peak2.heightInMeters);
        System.out.println("Default Location: " + peak2.location);
        System.out.println("Default Climate Type: " + peak2.climateType);
        peak2.peakName = "K2";
        peak2.heightInMeters = 8611;
        peak2.location = "Pakistan";
        peak2.climateType = "Extreme Cold";
        System.out.println("After re-initialization");
        System.out.println("Peak Name: " + peak2.peakName);
        System.out.println("Height: " + peak2.heightInMeters);
        System.out.println("Location: " + peak2.location);
        System.out.println("Climate Type: " + peak2.climateType);
    
		MountainPeak peak3 = new MountainPeak();
		System.out.println("Default Peak Name: " + peak3.peakName);
		System.out.println("Default Height: " + peak3.heightInMeters);
		System.out.println("Default Location: " + peak3.location);
		System.out.println("Default Climate Type: " + peak3.climateType);
		peak3.peakName = "Kangchenjunga";
		peak3.heightInMeters = 8586;
		peak3.location = "India";
		peak3.climateType = "Snowy";
		System.out.println("After re-initialization");
		System.out.println("Peak Name: " + peak3.peakName);
		System.out.println("Height: " + peak3.heightInMeters);
		System.out.println("Location: " + peak3.location);
		System.out.println("Climate Type: " + peak3.climateType);

		MountainPeak peak4 = new MountainPeak();
		System.out.println("Default Peak Name: " + peak4.peakName);
		System.out.println("Default Height: " + peak4.heightInMeters);
		System.out.println("Default Location: " + peak4.location);
		System.out.println("Default Climate Type: " + peak4.climateType);
		peak4.peakName = "Lhotse";
		peak4.heightInMeters = 8516;
		peak4.location = "Nepal";
		peak4.climateType = "Freezing";
		System.out.println("After re-initialization");
		System.out.println("Peak Name: " + peak4.peakName);
		System.out.println("Height: " + peak4.heightInMeters);
		System.out.println("Location: " + peak4.location);
		System.out.println("Climate Type: " + peak4.climateType);

		MountainPeak peak5 = new MountainPeak();
		System.out.println("Default Peak Name: " + peak5.peakName);
		System.out.println("Default Height: " + peak5.heightInMeters);
		System.out.println("Default Location: " + peak5.location);
		System.out.println("Default Climate Type: " + peak5.climateType);
		peak5.peakName = "Makalu";
		peak5.heightInMeters = 8485;
		peak5.location = "Himalayas";
		peak5.climateType = "Icy";
		System.out.println("After re-initialization");
		System.out.println("Peak Name: " + peak5.peakName);
		System.out.println("Height: " + peak5.heightInMeters);
		System.out.println("Location: " + peak5.location);
		System.out.println("Climate Type: " + peak5.climateType);


   }
}
