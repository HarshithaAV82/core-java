class CloudSoftwareRunner{
	
	
	public static void main(String... values){
		
		
		CloudSoftware cloudSoftware1 = new CloudSoftware("Amazon", "software", 200.0, 767.4, true, true);
		CloudSoftware cloudSoftware2 = new CloudSoftware("Aws", "software", 300.0, 4355.6, true, true);
		CloudSoftware cloudSoftware3 = new CloudSoftware("google", "software", 200.0, 364.6, true, true);
		CloudSoftware cloudSoftware4 = new CloudSoftware("web", "software", 900.0, 6634.6, true, true);
		CloudSoftware cloudSoftware5 = new CloudSoftware("microsoft", "software", 200.0, 215.5, true, true);
		CloudSoftware cloudSoftware6 = new CloudSoftware("adobe", "software", 700.0, 352.5, true, true);
		CloudSoftware cloudSoftware7= new CloudSoftware("redtape", "software", 200.0, 326.5, true, true);
		CloudSoftware cloudSoftware8 = new CloudSoftware("gfs", "software", 500.0, 36.66, true, true);
		CloudSoftware cloudSoftware9 = new CloudSoftware("Aws", "software", 600.0, 3256.5, true, true);
		CloudSoftware cloudSoftware10 = new CloudSoftware("Zoom", "software", 200.0, 3426.6, true, true);
		
		
		
		cloudSoftware1.displayInfo();
		cloudSoftware2.displayInfo();
		cloudSoftware3.displayInfo();
		cloudSoftware4.displayInfo();
		cloudSoftware5.displayInfo();
		cloudSoftware6.displayInfo();
		cloudSoftware7.displayInfo();
		cloudSoftware8.displayInfo();
		cloudSoftware9.displayInfo();
		cloudSoftware10.displayInfo();
		
		
		CloudSoftware[]  cloudSoftware = new CloudSoftware[10];
		CloudSoftwareStore cloudSoftwareStore = new CloudSoftwareStore(cloudSoftware);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware1);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware2);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware3);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware4);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware5);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware6);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware7);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware8);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware9);
		cloudSoftwareStore.saveCloudSoftwareStore(cloudSoftware10);
	}
}