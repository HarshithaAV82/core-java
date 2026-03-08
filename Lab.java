class Lab{

    String name;
    int noOfExperiments;

    Lab(String name, int noOfExperiments){
        this.name = name;
        this.noOfExperiments = noOfExperiments;
    }

    void getCoach(){
        System.out.println("Lab Name: " + this.name);
        System.out.println("No Of Experiments: " + this.noOfExperiments);
    }
}