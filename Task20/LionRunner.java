class LionRunner{
	
	public static void main(String[] args){
		
		Animal animal = new Animal("Lion", 4);
		animal.getAnimal();
		Carnivores carnivores = new Carnivores();
		Forest forest = new Forest();
		Roar roar = new Roar();
		King king = new King();
		
		
		
		Lion lion = new Lion(animal, carnivores, forest, roar, king);
	}
	
	
}