class CarrotHalwaRunner {

    public static void main(String[] args){

        String[] varieties = {"Classic Halwa", "Dry Fruit Halwa", "Milk Halwa"};

        Ingredient[] ingredients = new Ingredient[3];
        ingredients[0] = new Ingredient("Carrot", 500);
        ingredients[1] = new Ingredient("Sugar", 200);
        ingredients[2] = new Ingredient("Ghee", 100);

        CarrotHalwa halwa = new CarrotHalwa(varieties, ingredients);
        halwa.display();
    }
}