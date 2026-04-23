class Demo{

 static void show(){
    
	System.out.println("Static method");
	}
	
 void display(){
 
    System.out.println("Non-static method");
 }
 
  public static void main(String[] args){
  
   show();
   
   Demo d = new Demo();
   
   d.display();
   
  }
 }

