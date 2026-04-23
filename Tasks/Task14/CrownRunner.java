class CrownRunner {
    public static void main(String[] args) {
       int getSize = Crown.getSize();
        String getMaterial =Crown.getMaterial();
       boolean isRoyal=  Crown.isRoyal();
       String getOwner =Crown.getOwner();
       String getColour= Crown.getColour();
	   
	   
	   System.out.println("get Size:" + getSize);
	   System.out.println("get material:" + getMaterial);
	   System.out.println("get Royal:" + isRoyal);
	   System.out.println("get Owner:" + getOwner);
	   System.out.println("get colour:" + getColour);
	   
    }
}
