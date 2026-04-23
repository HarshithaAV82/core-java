class AntRunner{

    public static void main(String[] args) {

        Ant ant = new Ant("Black", 6, 0.5);

        System.out.println("Ant Color: " + ant.color);
        System.out.println("Ant Legs: " + ant.legs);
        System.out.println("Ant Size: " + ant.size);
    }
}