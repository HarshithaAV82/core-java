class BenchRunner {
    
	public static void main(String[] args) {
       int getLength= Bench.getLength();
         int getSeats=Bench.getSeats();
        String getMaterial=Bench.getMaterial();
         boolean hasBackrest=Bench.hasBackrest();
        String getColour=Bench.getColour();
		
		System.out.println("getLength:" + getLength);
		System.out.println("getSeats:" + getSeats);
		System.out.println("getMaterial:" + getMaterial);
		System.out.println("hasBackrest:" + hasBackrest);
		System.out.println("getColour:" + getColour);
		
    }
}
