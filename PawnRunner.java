class PawnRunner{

    public static void main(String[] args) {

        Pawn pawn = new Pawn("White", "Wood", 5.0, 20.0, false);
        System.out.println("Color: " + pawn.color);
        System.out.println("Material: " + pawn.material);
        System.out.println("Height: " + pawn.height);
        System.out.println("Weight: " + pawn.weight);
        System.out.println("Is Promoted: " + pawn.isPromoted);

        Pawn pawn1 = new Pawn("Black");
        System.out.println("Color: " + pawn1.color);

        Pawn pawn2 = new Pawn("Plastic", 4.5);
        System.out.println("Material: " + pawn2.material);
        System.out.println("Height: " + pawn2.height);

        Pawn pawn3 = new Pawn(18.0, true);
        System.out.println("Weight: " + pawn3.weight);
        System.out.println("Is Promoted: " + pawn3.isPromoted);

        Pawn pawn4 = new Pawn("Metal", 5.5, 22.0);
        System.out.println("Material: " + pawn4.material);
        System.out.println("Height: " + pawn4.height);
        System.out.println("Weight: " + pawn4.weight);

        Pawn pawn5 = new Pawn();
        System.out.println("Color: " + pawn5.color);
        System.out.println("Material: " + pawn5.material);
        System.out.println("Height: " + pawn5.height);
        System.out.println("Weight: " + pawn5.weight);
        System.out.println("Is Promoted: " + pawn5.isPromoted);
    }
}