class LadderRunner {
    
	public static void main(String[] args) {
        int getHeight= Ladder.getHeight();
        int getRungs=Ladder.getRungs();
        String getMaterial=Ladder.getMaterial();
        boolean isFoldable=Ladder.isFoldable();
        String getColour=Ladder.getColour();
		
		System.out.println("getHeight:" + getHeight);
		System.out.println("getRungs:" + getRungs);
		System.out.println("getMaterial:" + getMaterial);
		System.out.println("isFoldable:" + isFoldable);
		System.out.println("getcolour:" + getColour);
		
    }
}
