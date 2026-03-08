class Academy{

    String name;
    int noOfAcademy;

    Academy(String name, int noOfAcademy){
        this.name = name;
        this.noOfAcademy = noOfAcademy;
    }

    void getCoach(){
        System.out.println("Academy Name: " + this.name);
        System.out.println("No Of Academy: " + this.noOfAcademy);
    }
}