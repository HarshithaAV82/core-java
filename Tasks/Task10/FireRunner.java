class FireRunner{
	
	public static void main(String[] args){
		
		int getSize = Fire.getSize();
		String getcolor = Fire.getcolor();
		int getTemperature = Fire.getTemperature();
		String getType = Fire.getType();
		boolean isSpreading = Fire.isSpreading();
		
		System.out.println("get Size:" + getSize);
		System.out.println("get colour:" + getSize);
		System.out.println("get temperature:" + getTemperature);
		System.out.println("get type:" + getType);
		System.out.println("Is Spreading:" + isSpreading);
		
	}
}