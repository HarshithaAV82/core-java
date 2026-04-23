class WaterRunner {
    public static void main(String[] args) {
       int getVolume = Water.getVolume();
       String getColour = Water.getColour();
       double getTemperature = Water.getTemperature();
       boolean isDrinkable = Water.isDrinkable();
       String getSource = Water.getSource();
	   
	   System.out.println("get Volume:" + getVolume);
	   System.out.println("get Colour:" + getColour);
	   System.out.println("get Temperature:" + getTemperature);
	   System.out.println("IS Drinkable:" + isDrinkable);
	   System.out.println("get source:" + getSource);
	   
    }
}
