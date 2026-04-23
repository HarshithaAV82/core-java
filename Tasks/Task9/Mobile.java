class Mobile{

  static void register(String patientName, 
                       String symptom, 
                       String email, 
                       long mobile)
{
	  Reception.book(patientName, symptom, email, mobile);
	  
  }
}