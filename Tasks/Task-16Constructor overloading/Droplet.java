class Droplet{

    String liquidType;
    double volume;
    String color;
    double temperature;
    boolean isPure;

	Droplet(String liquidType, double volume, String color, double temperature, boolean isPure){
		
		this.liquidType=liquidType;
		this.volume=volume;
		this.color=color;
		this.temperature=temperature;
		this.isPure=isPure;	
		
	}
	Droplet(String liquidType){
		this.liquidType=liquidType;
	}
	Droplet(double volume, String color){
		this.volume=volume;
		this.color=color;
	}
	Droplet(double temperature, boolean isPure){
		this.temperature=temperature;
		this.isPure=isPure;
	}
	Droplet(double volume, String color, double temperature, boolean isPure){
		this.volume=volume;
		this.color=color;
		this.temperature=temperature;
		this.isPure=isPure;
	}
	Droplet(){
		
	}
}