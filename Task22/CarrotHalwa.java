class CarrotHalwa{

    String[] varieties;
    Ingredient[] ingredients;

    CarrotHalwa(String[] varieties, Ingredient[] ingredients){
        this.varieties = varieties;
        this.ingredients = ingredients;
    }

    void display(){

        System.out.println("Carrot Halwa Details");

        if(this.varieties != null){
            System.out.println("Total Varieties: " + this.varieties.length);
            for(String variety : this.varieties){
                System.out.println("Halwa Type: " + variety);
            }
        }

        if(this.ingredients != null){
            System.out.println("Total Ingredients: " + this.ingredients.length);
            for(Ingredient ingredient : this.ingredients){
                System.out.println("Ingredient: " + ingredient.name);
                System.out.println("Quantity: " + ingredient.quantity);
            }
        }
    }
}