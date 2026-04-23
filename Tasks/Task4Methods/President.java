class President{
	
	  static void govern(){
		System.out.println("This is a Governer");
		callState();
	}
	
	 static void callState(){
		System.out.println("President callState");
		rules();
	}
	
	 static void rules(){
		System.out.println("This is a rules given by the president");
		check();
	}
	
	 static void check(){
		System.out.println("Governer checks the rules");
		callAdmin();
	}
	
	 static void callAdmin(){
		System.out.println("Governer callAdmin");
		collect();
	}
	
	 static void collect(){
		System.out.println("Governer collect a information");
		apply();
		
	}
	
	 static void apply(){
		System.out.println("Those rules can Apply to citizens");
		chain();
	}
	
	 static void chain(){
		System.out.println("Those Rules having a Chain Link");
		citizen();
	}
	
	 static void citizen(){
		System.out.println("citizens can Accept the rules");
		follow();
	}
	
	 static void follow(){
		System.out.println("All citizens must follow the rules given by the President");
	}
}
  