class RainCloudRunner{

    public static void main(String[] args) {

        RainCloud cloud1 = new RainCloud();
        System.out.println("Default Cloud Type: " + cloud1.cloudType);
        System.out.println("Default Humidity Level: " + cloud1.humidityLevel);
        System.out.println("Default Region: " + cloud1.region);
        System.out.println("Default Rainfall Amount: " + cloud1.rainfallAmount);
        cloud1.cloudType = "Cumulonimbus";
        cloud1.humidityLevel = 85.5;
        cloud1.region = "Western Ghats";
        cloud1.rainfallAmount = 120;
        System.out.println("After re-initialization");
        System.out.println("Cloud Type: " + cloud1.cloudType);
        System.out.println("Humidity Level: " + cloud1.humidityLevel);
        System.out.println("Region: " + cloud1.region);
        System.out.println("Rainfall Amount: " + cloud1.rainfallAmount);
		
        RainCloud cloud2 = new RainCloud();
        System.out.println("Default Cloud Type: " + cloud2.cloudType);
        System.out.println("Default Humidity Level: " + cloud2.humidityLevel);
        System.out.println("Default Region: " + cloud2.region);
        System.out.println("Default Rainfall Amount: " + cloud2.rainfallAmount);
        cloud2.cloudType = "Stratus";
        cloud2.humidityLevel = 65.3;
        cloud2.region = "Coastal Area";
        cloud2.rainfallAmount = 45;
        System.out.println("After re-initialization");
        System.out.println("Cloud Type: " + cloud2.cloudType);
        System.out.println("Humidity Level: " + cloud2.humidityLevel);
        System.out.println("Region: " + cloud2.region);
        System.out.println("Rainfall Amount: " + cloud2.rainfallAmount);

        RainCloud cloud3 = new RainCloud();
        System.out.println("Default Cloud Type: " + cloud3.cloudType);
        System.out.println("Default Humidity Level: " + cloud3.humidityLevel);
        System.out.println("Default Region: " + cloud3.region);
        System.out.println("Default Rainfall Amount: " + cloud3.rainfallAmount);
        cloud3.cloudType = "Nimbus";
        cloud3.humidityLevel = 92.1;
        cloud3.region = "Hill Station";
        cloud3.rainfallAmount = 200;
        System.out.println("After re-initialization");
        System.out.println("Cloud Type: " + cloud3.cloudType);
        System.out.println("Humidity Level: " + cloud3.humidityLevel);
        System.out.println("Region: " + cloud3.region);
        System.out.println("Rainfall Amount: " + cloud3.rainfallAmount);

		RainCloud cloud4 = new RainCloud();
		System.out.println("Default Cloud Type: " + cloud4.cloudType);
		System.out.println("Default Humidity Level: " + cloud4.humidityLevel);
		System.out.println("Default Region: " + cloud4.region);
		System.out.println("Default Rainfall Amount: " + cloud4.rainfallAmount);
		cloud4.cloudType = "Altostratus";
		cloud4.humidityLevel = 70.8;
		cloud4.region = "Northern Plains";
		cloud4.rainfallAmount = 85;
		System.out.println("After re-initialization");
		System.out.println("Cloud Type: " + cloud4.cloudType);
		System.out.println("Humidity Level: " + cloud4.humidityLevel);
		System.out.println("Region: " + cloud4.region);
		System.out.println("Rainfall Amount: " + cloud4.rainfallAmount);


		RainCloud cloud5 = new RainCloud();
		System.out.println("Default Cloud Type: " + cloud5.cloudType);
		System.out.println("Default Humidity Level: " + cloud5.humidityLevel);
		System.out.println("Default Region: " + cloud5.region);
		System.out.println("Default Rainfall Amount: " + cloud5.rainfallAmount);
		cloud5.cloudType = "Cirrostratus";
		cloud5.humidityLevel = 55.4;
		cloud5.region = "Desert Edge";
		cloud5.rainfallAmount = 15;
		System.out.println("After re-initialization");
		System.out.println("Cloud Type: " + cloud5.cloudType);
		System.out.println("Humidity Level: " + cloud5.humidityLevel);
		System.out.println("Region: " + cloud5.region);
		System.out.println("Rainfall Amount: " + cloud5.rainfallAmount);

		
    }
}
