class LionRunner{

    public static void main(String[] args){

        Animal animal = new Animal("Lion", 4);
        Carnivores carnivores = new Carnivores(1, "MeatEater");
        Forest forest = new Forest(100, "Amazon");
        Roar roar = new Roar(true);
        King king = new King("Lion", "JungleKing");

        Lion lion = new Lion(animal, carnivores, forest, roar, king);
        lion.getInfo();
    }

}