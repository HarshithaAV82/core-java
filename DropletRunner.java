class DropletRunner{
	
	public static void main(String[] args){
		
		Droplet droplet = new Droplet("Water", 5.5, "Transparent",  25.0, true);
		
		System.out.println("Liquid Type:" + droplet.liquidType);
		System.out.println("volume:" + droplet.volume);
		System.out.println("color:" + droplet.color);
		System.out.println("Temperature:" + droplet.temperature);
		System.out.println("isPure :" + droplet.isPure);

        Droplet droplet1 = new Droplet("Oil");
		System.out.println("Liquid Type:" + droplet1.liquidType);

		
		Droplet droplet2 = new Droplet(3.2 , "Yellow");
		System.out.println("Volume:" + droplet2.volume);
		System.out.println("color:" + droplet2.color);
		
		Droplet droplet3 = new Droplet(30.5 , false);
		System.out.println("temperature:" + droplet3.temperature);
		System.out.println("isPure:" + droplet3.isPure);

		Droplet droplet4 = new Droplet(4.5, "Blue", 20.0, true);
		System.out.println("volume:" + droplet4.volume);
		System.out.println("color:" + droplet4.color);
		System.out.println("Temperature:" + droplet4.temperature);
		System.out.println("isPure:" +droplet4.isPure);
		
		Droplet droplet5 = new Droplet();
		System.out.println("Liquid Type:" + droplet5.liquidType);
		System.out.println("volume:" + droplet5.volume);
		System.out.println("color:" + droplet5.color);
		System.out.println("Temperature:" + droplet5.temperature);
		System.out.println("isPure :" + droplet5.isPure);

	}
}    