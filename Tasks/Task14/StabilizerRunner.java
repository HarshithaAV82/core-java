
class StabilizerRunner {
    
	public static void main(String[] args) {
        int getVoltage = Stabilizer.getVoltage();
        int getCapacity = Stabilizer.getCapacity();
        boolean isAutomatic = Stabilizer.isAutomatic();
        String getBrand = Stabilizer.getBrand();
        String getColour = Stabilizer.getColour();
		
	     System.out.println("getVoltage:" getVoltage);
		 System.out.println("getCapacity:" getCapacity);
		 System.out.println("isAutomatic:" isAutomatic);
		 System.out.println("getBrand:" getBrand);
		 System.out.println("getColour:" getColour);
		
    }
}
