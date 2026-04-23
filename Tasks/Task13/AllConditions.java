class AllConditions{
	
	public static void main(String[] args){
		
		System.out.println("Executing all conditions and loops statements..");
		
		String conditions = null;
		int balance = 800;
		String bankAccount = "Present";
		int options = 3;
		int accounts = 1;

		getConditions(conditions);
		checkBalance(balance);
		checkBankAccount(bankAccount);
		checkOptions(options);
		numberOfAccount(accounts);
		
		System.out.println("I have used all Condtions and loops statements..");
           return;
		
	}			
		
	    static void getConditions(String conditions){
		if(conditions==null){
			System.out.println("The Conditions should not be null..");

		  }else{
			  System.out.println("conditions are valid..");
		  }
	    }
		static void checkBalance(int balance){
			
			if(balance <= 200){
				System.out.println("The Minimum Balance should be atleast 500.");
				return;
			}
			if(balance<=500){
				System.out.println("The Bank Balance is Moderate:" + balance);
				return;
			}
			if(balance>=1000){
				System.out.println("The Bank Balance is Excellent:" + balance);
				return;
			}
			else{
				System.out.println("The bank balance is good..");
			}
			return;
		}
	   static  String checkBankAccount(String bankAccount){
		   if(bankAccount==null){
			   System.out.println("You were bank account is not Active at this moment..");
			   return null;
		   }
		   else if(bankAccount=="Not Present"){
			   System.out.println("Try to do another account in this bank..");
			   return "not present";
		   }
		   else if(bankAccount=="Present"){
			   System.out.println("You were account is active use your account..");
			   return "present";
		   }
		   else if(bankAccount=="debitAmount"){
			   System.out.println("Using Debit Card you can debit..");
			   return "debitAmount";
		   }
			else{
				System.out.println("Debit Card is already expire");
				return "Issue";
			}
		   }
		   
	   static void checkOptions(int options){
		   
		   switch(options){
			   
			   case 1:
			    System.out.println("Click Option 1 for See the Details of Bank account..");
				break;
			   case 2:
			    System.out.println("Click option 2 for see the bank balance.");
				break;
			   case 3:
			    System.out.println("Click option 3 for debit Amount..");
				break;
			   default:
			    System.out.println("System is showing an error to find your account..");
				break;
		   }
	   }
	   
		static void numberOfAccount(int accounts){
			
			while(accounts <= 5){
				System.out.println(accounts);
				accounts++;
			}
			
			int amount = 500;
			
			while(amount <= 1000){
				System.out.println(amount);
				amount += 500;
				
			}
			String checkBook = "1000";
		    do{
			System.out.println("Then you should maintain your balance..");
			break;
		  }while(checkBook == "1000");
			System.out.println("you can use your checkbook.");
		}		
	
}