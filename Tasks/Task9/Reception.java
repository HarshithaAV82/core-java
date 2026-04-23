class Reception{

  static void book(String patientName, 
                   String symptom, 
                   String email, 
                   long mobile){
    Hospital.bookAppointment(patientName, symptom);
   
  
  }
}