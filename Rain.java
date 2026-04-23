class Rain{
    
	int drops;
	boolean heavy;
	
	Rain(int drops, boolean heavy){
		
		this.drops = drops;
		this.heavy = heavy;
	}
	
	void getCloud(){
		
		System.out.println("Drops: " + this.drops);
		System.out.println("Heavy: " + this.heavy);
		System.out.println("Created Rain using constructor");
	}
}