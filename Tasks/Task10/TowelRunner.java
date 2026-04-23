class TowelRunner {
   
   public static void main(String[] args) {
        int getLength = Towel.getLength();
        int getWidth = Towel.getWidth();
        String getColour = Towel.getColour();
        boolean isDry = Towel.isDry();
         String getMaterial = Towel.getMaterial();
		 
		 System.out.println("getLength:" getLength);
		 System.out.println("get width:" getWidth);
		 System.out.println("getColour:" getColour);
		 System.out.println("isDry:" isDry);
		 System.out.println("getMaterial:" getMaterial);
    }
}
