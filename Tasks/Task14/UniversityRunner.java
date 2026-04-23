class UniversityRunner{
	
	public static void main(String[] args){
		
		String[]  course = University.getCoursesByCollegeName("Christ University, Bengaluru");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("St.Josephs College of Commerce, Bengaluru");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("Ramaiah Institute of Technology, Bengaluru");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("Arsikere");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("RNS Institute of Technology, Bengaluru");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("Siddaganga Institute of Technology, Tumkur");
	
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("Alliance University, Bengaluru");

		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("CMR University, Bengaluru");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("Reva University, Bengaluru");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("PES University, Bengaluru");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("Azim Premji University, Bengaluru");

		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		course = University.getCoursesByCollegeName("Sri Krishna Institute of Technology, Bengaluru");
		if(course!=null){
			for(int index=0;index<course.length;index++){
				System.out.println(course[index]);
			}
		}
		else{
			System.out.println("Courses are null..");
		}
		
		
	}
}