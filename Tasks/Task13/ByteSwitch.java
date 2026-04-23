class  ByteSwitch{

 public static void main(String[] args){
	 
	 byte option = 2;
	 display(option);
 }
 
 static void display(byte option){
	 switch(option){
		case 1:
		    System.out.println("Balance Check");
			break;
		case 2:
		    System.out.println("Withdraw Money");
			break;
		case 3:
		    System.out.println("Deposit Money");
			break;
		case 4:
		    System.out.println("Check PIN");
			break;
		case 5:
		    System.out.println("Exit");
			break;
		default:
		    System.out.println("Invalid Option");
			break;
	 }
 }

}