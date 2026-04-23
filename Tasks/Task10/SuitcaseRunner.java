class SuitcaseRunner{

  public static void main(String[] args){

  int getLength = Suitcase.getLength();
  String getColour = Suitcase.getColour();
  String getType = Suitcase.getType();
  boolean isEmpty = Suitcase.isEmpty();
  int noOfCloth = Suitcase.noOfCloth();
  
  System.out.println("Suitcase Length:" + getLength);
  System.out.println("Suitcase colour:" + getColour);
  System.out.println("Suitcase Type:" + getType);
  System.out.println("Suitcase Empty:" + isEmpty);
  System.out.println("Suitcase No Of Cloth:" + noOfCloth);
  
  
}

}