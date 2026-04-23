class ReverseStore{
 
 public static void main(String[] args){
 
 String fruitsNames[] = {"Apple", "Banana", "Mango", "Orange"};
 
 for(int i = fruitsNames.length-1; i >= 0; i--){
 System.out.println(fruitsNames[i]);
 
 }
 
  byte shelfLevels[] = {2, 4, 6, 8,9};
  
  for(int i = shelfLevels.length-1; i >=0; i--){
  System.out.println(shelfLevels[i]);
  }
  
  short examCodes[] = {301, 302, 303, 304, 308};
  
  for(int i = examCodes.length-1; i >=0; i--){
  System.out.println(examCodes[i]);
  }
  
  int ticketPrices[] = {102, 344, 446, 768};
  
  for(int i = ticketPrices.length-1; i >=0; i--){
  System.out.println(ticketPrices[i]);
  }
 
  long orderIds[] = {25656567454535L, 4643342436467L, 6665353534343L, 87675456454L};
  
  for(int i = orderIds.length-1; i >=0; i--){
  System.out.println(orderIds[i]);
  }
  
  float rainfallLevels[] = {12.5f, 9.8f, 15.2f, 7.8f};
  
  for(int i = rainfallLevels.length-1; i >=0; i--){
  System.out.println(rainfallLevels[i]);
  }
 
  double goldRates[] = {6123.45, 4565.67, 6545.88, 8787.89};
  
  for(int i = goldRates.length-1; i >=0; i--){
  System.out.println(goldRates[i]);
  }
  
  char zoneCode[] = {'N', 'S', 'E', 'W'};
  
  for(int i = zoneCode.length-1; i >=0; i--){
  System.out.println(zoneCode[i]);
  }
  
  boolean powerStatus[] = {true, true, false, false};
  
  for(int i = powerStatus.length-1; i >=0; i--){
  System.out.println(powerStatus[i]);
  }
  
  int lockerNumbers[] = {32, 46, 76, 48};
  
  for(int i = lockerNumbers.length-1; i >=0; i--){
  System.out.println(lockerNumbers[i]);
  }
 }

}