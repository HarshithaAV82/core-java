class DataStore{
 
 public static void main(String[] args){
   
   String cityNames[] = {"Bengaluru", "Mysuru", "Mandya", "Hassan", "Shivamoga"};
   
   for(int i = 0; i < cityNames.length; i++){
   
   System.out.println(cityNames[i]);
   }
   
   byte floorNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
   
   for(int i = 0; i < floorNumbers.length; i++){
	   System.out.println(floorNumbers[i]);
   }
     
	short busRouteCodes[] = {120, 245, 310, 415,676,434};
	
	for(int i = 0; i < busRouteCodes.length; i++){
		System.out.println(busRouteCodes[i]);
	}
	
	int monthlySalaries[] = {12000, 24500, 31000, 41005,67006,40034};
	
	for(int i = 0; i < monthlySalaries.length; i++){
		System.out.println(monthlySalaries[i]);
	}
	
	long electrictyMeterIds[] = {12076876897877L, 245454585767L, 3105674654564L, 415576567546L,67665673464889L,434767563446L};
	
	for(int i = 0; i < electrictyMeterIds.length; i++){
		System.out.println(electrictyMeterIds[i]);
	}
	
	float temperatures[] = {12.0f, 24.5f, 31.0f, 41.5f,67.6f,43.4f};
	
	for(int i = 0; i < temperatures.length; i++){
		System.out.println(temperatures[i]);
	}
	
	double fuelPrices[] = {120.56, 245.54, 310.53, 415.53,676.466,434.64};
	
	for(int i = 0; i < fuelPrices.length; i++){
		System.out.println(fuelPrices[i]);
	}
	
	char sectionCodes[] = {'A', 'B', 'C', 'D','E'};
	
	for(int i = 0; i < sectionCodes.length; i++){
		System.out.println(sectionCodes[i]);
	}
	
	boolean seatAvailable[] = {true, false, true, false,true};
	
	for(int i = 0; i < seatAvailable.length; i++){
		System.out.println(seatAvailable[i]);
	}
	
	int houseNumbers[] = {12, 45, 101,54,67,34};
	
	for(int i = 0; i < houseNumbers.length; i++){
		System.out.println(houseNumbers[i]);
	}
 }

}