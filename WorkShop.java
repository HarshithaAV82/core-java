class WorkShop{

    String type;
    int noOfWorkShop;

    WorkShop(String type, int noOfWorkShop){
        this.type = type;
        this.noOfWorkShop = noOfWorkShop;
    }

    void getCoach(){
        System.out.println("Workshop Type: " + this.type);
        System.out.println("No Of Workshop: " + this.noOfWorkShop);
    }
}