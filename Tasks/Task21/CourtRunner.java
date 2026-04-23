class CourtRunner{

    public static void main(String[] args){

        SeniorJudge judge1 = new SeniorJudge(20);
        SeniorJudge judge2 = new SeniorJudge(15);

        Court court1 = new Court(120, judge1, CourtType.DISTRICT);
        Court court2 = new Court(80, judge2, CourtType.HIGH);
        Court court3 = new Court(60, null, CourtType.SUPREME);
        Court court4 = new Court(40, judge2, CourtType.FAMILY);

        court1.printInfo();
        court2.printInfo();
        court3.printInfo();
        court4.printInfo();
    }
}