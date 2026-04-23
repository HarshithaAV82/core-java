class Education{
    String level;
    String courseName;
    String institution;
    String mode;
    String duration;
    String syllabus;
    String language;
    String certification;
    String country;
    String department;
    double fees;
    double rating;
    double attendance;
    double scholarshipAmount;
    int studentsCount;
    int teachersCount;
    int year;
    boolean online;
    boolean accredited;
    boolean governmentApproved;

    Education(String level, String courseName, String institution, String mode,
              String duration, String syllabus, String language, String certification,
              String country, String department,
              double fees, double rating, double attendance, double scholarshipAmount,
              int studentsCount, int teachersCount, int year,
              boolean online, boolean accredited, boolean governmentApproved) {

        this.level = level;
        this.courseName = courseName;
        this.institution = institution;
        this.mode = mode;
        this.duration = duration;
        this.syllabus = syllabus;
        this.language = language;
        this.certification = certification;
        this.country = country;
        this.department = department;
        this.fees = fees;
        this.rating = rating;
        this.attendance = attendance;
        this.scholarshipAmount = scholarshipAmount;
        this.studentsCount = studentsCount;
        this.teachersCount = teachersCount;
        this.year = year;
        this.online = online;
        this.accredited = accredited;
        this.governmentApproved = governmentApproved;
    }

    void showEducationInfo(){
        System.out.println("Level: " + level);
        System.out.println("Course Name: " + courseName);
        System.out.println("Institution: " + institution);
        System.out.println("Mode: " + mode);
        System.out.println("Duration: " + duration);
        System.out.println("Syllabus: " + syllabus);
        System.out.println("Language: " + language);
        System.out.println("Certification: " + certification);
        System.out.println("Country: " + country);
        System.out.println("Department: " + department);
        System.out.println("Fees: " + fees);
        System.out.println("Rating: " + rating);
        System.out.println("Attendance: " + attendance);
        System.out.println("Scholarship Amount: " + scholarshipAmount);
        System.out.println("Students Count: " + studentsCount);
        System.out.println("Teachers Count: " + teachersCount);
        System.out.println("Year: " + year);
        System.out.println("Online: " + online);
        System.out.println("Accredited: " + accredited);
        System.out.println("Government Approved: " + governmentApproved);
 
    }
}