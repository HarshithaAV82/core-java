class TabletRunner {
    
	public static void main(String[] args) {
        String getBrand=Tablet.getBrand();
        int getScreenSize=Tablet.getScreenSize();
        boolean isTouchScreen=Tablet.isTouchScreen();
        int getBatteryLife=Tablet.getBatteryLife();
        String getColour=Tablet.getColour();
		
		
		 System.out.println("getBrand:" getBrand);
		 System.out.println("getScreenSize:" getScreenSize);
		 System.out.println("isTouchScreen:" isTouchScreen);
		 System.out.println("getBatteryLife:" getBatteryLife);
		 System.out.println("getColour:" getColour);
    }
}
