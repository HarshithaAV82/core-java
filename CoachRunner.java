class CoachRunner{

    public static void main(String[] args){

        BootCamp bootCamp = new BootCamp("JavaFullStack", 4);
        bootCamp.getCoach();

        Academy academy = new Academy("Xworkz", 5);
        academy.getCoach();

        WorkShop workShop = new WorkShop("Coding", 10);
        workShop.getCoach();

        Lab lab = new Lab("Programming Lab", 20);
        lab.getCoach();

        Training training = new Training("Placement Training", 100);
        training.getCoach();

        Coach coach = new Coach(bootCamp, academy, workShop, lab, training);
    }
}