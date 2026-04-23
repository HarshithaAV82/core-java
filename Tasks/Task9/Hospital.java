class Hospital{

 static void bookAppointment(String patientName, String symptom)
 {
     int bp = 120;
	 System.out.println("Blood Pressure:" + bp);
	 boolean sugar = false;
	 System.out.println("Sugar is there or not:" + sugar);
	 
  	 Nurse.basicCheck(patientName,symptom,bp,sugar);
 }
}