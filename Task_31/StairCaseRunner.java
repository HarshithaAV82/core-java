class StairCaseRunner{

    public static void main(String[] args){

       
        Escalator escalator = new Escalator();
        System.out.println(escalator.stepWidth);
        System.out.println(escalator.numberOfTurns);
        System.out.println(escalator.stairShape);

      

        Escalator escalator1 = new Escalator(4.5);
        System.out.println(escalator1.stepWidth);
        System.out.println(escalator1.numberOfTurns);
        System.out.println(escalator1.stairShape);

       
        Escalator escalator2 = new Escalator(5.5, 2, "Straight");
        System.out.println(escalator2.stepWidth);
        System.out.println(escalator2.numberOfTurns);
        System.out.println(escalator2.stairShape);
    }
}