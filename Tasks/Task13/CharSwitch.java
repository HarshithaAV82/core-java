class CharSwitch{

  public static void main(String[] args){
	  char option = 'C';
	  showOption(option);
  }
  
  static void showOption(char option){
	  switch(option){
		  case 'A':
		    System.out.println("Add Item");
			break;
		  case 'B':
		    System.out.println("Remove Item");
			break;
		  case 'C':
		    System.out.println("View Item");
			break;
		  case 'D':
		    System.out.println("Update Item");
			break;
		  case 'E':
		    System.out.println("Exit Item");
			break;
		  default:
		    System.out.println("Invalid Option");
			break;
			
	  }
  }
}