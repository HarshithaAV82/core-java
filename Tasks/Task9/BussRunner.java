class BussRunner{
	public static void main(String[]args){
		System.out.println("Bus Information:");
		Buss.busInfo("KSRTC Flybus","A/c Seater",true);
		
		Buss.busInfo("InterCity Smart Bus","A/c Sleeper",false);
		
		System.out.println("----------->");
		System.out.println("Train Information:");
		Buss.trainInfo("MyS Shatabdi(#12007)","Ac Chair Car",false);
		Buss.trainInfo("Lalbagh SF EXp(#12608)","Second Seating",true);
	}
}