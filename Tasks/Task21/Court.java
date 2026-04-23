class Court{
	
	int casesCount;
	SeniorJudge seniorJudge;
	CourtType courtType;
	
	Court(int casesCount, SeniorJudge seniorJudge, CourtType courtType){
		this.casesCount=casesCount;
		this.seniorJudge=seniorJudge;
		this.courtType=courtType;
	}
	
	void printInfo(){
		System.out.println("Cases count:" + this.casesCount);
		if(seniorJudge != null){
			System.out.println("seniorJudge:" +this.seniorJudge.yearsOfExperience);
		}else{
			System.out.println("SeniorJudge is not null..");
		}
		if(courtType != null){
			System.out.println("courtType:" +this.courtType);
		}else{
			System.out.println("courtType is not null..");
		}
	}
	
}