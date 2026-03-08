class Training{

    String name;
    int noOfStudents;

    Training(String name, int noOfStudents){
        this.name = name;
        this.noOfStudents = noOfStudents;
    }

    void getCoach(){
        System.out.println("Training Name: " + this.name);
        System.out.println("No Of Students: " + this.noOfStudents);
    }
}