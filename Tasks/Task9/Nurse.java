class Nurse{

 static void basicCheck(String patientName, 
                        String symptom,
                        int bp,
                        boolean sugar)
{
	 
	 System.out.println("Patient Name:" + patientName);
	 System.out.println("Symptom:" + symptom);
	 System.out.println("BP:" + bp);
	 System.out.println("Sugar:" + sugar);
     Doctor.treat(patientName,symptom);
 }

}