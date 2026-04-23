class ForestTreeRunner {

    public static void main(String[] args) {

        ForestTree tree1 = new ForestTree();
        System.out.println("Default Tree Name: " + tree1.treeName);
        System.out.println("Default Age: " + tree1.age);
        System.out.println("Default Height: " + tree1.height);
        System.out.println("Default Season Type: " + tree1.seasonType);
        tree1.treeName = "Oak";
        tree1.age = 50;
        tree1.height = 25.5;
        tree1.seasonType = "Autumn";
        System.out.println("After re-initialization");
        System.out.println("Tree Name: " + tree1.treeName);
        System.out.println("Age: " + tree1.age);
        System.out.println("Height: " + tree1.height);
        System.out.println("Season Type: " + tree1.seasonType);

        ForestTree tree2 = new ForestTree();
        System.out.println("Default Tree Name: " + tree2.treeName);
        System.out.println("Default Age: " + tree2.age);
        System.out.println("Default Height: " + tree2.height);
        System.out.println("Default Season Type: " + tree2.seasonType);
        tree2.treeName = "Pine";
        tree2.age = 30;
        tree2.height = 18.2;
        tree2.seasonType = "Winter";
        System.out.println("After re-initialization");
        System.out.println("Tree Name: " + tree2.treeName);
        System.out.println("Age: " + tree2.age);
        System.out.println("Height: " + tree2.height);
        System.out.println("Season Type: " + tree2.seasonType);

        ForestTree tree3 = new ForestTree();
        System.out.println("Default Tree Name: " + tree3.treeName);
        System.out.println("Default Age: " + tree3.age);
        System.out.println("Default Height: " + tree3.height);
        System.out.println("Default Season Type: " + tree3.seasonType);
        tree3.treeName = "Maple";
        tree3.age = 40;
        tree3.height = 20.7;
        tree3.seasonType = "Spring";
        System.out.println("After re-initialization");
        System.out.println("Tree Name: " + tree3.treeName);
        System.out.println("Age: " + tree3.age);
        System.out.println("Height: " + tree3.height);
        System.out.println("Season Type: " + tree3.seasonType);


        ForestTree tree4 = new ForestTree();
        System.out.println("Default Tree Name: " + tree4.treeName);
        System.out.println("Default Age: " + tree4.age);
        System.out.println("Default Height: " + tree4.height);
        System.out.println("Default Season Type: " + tree4.seasonType);
        tree4.treeName = "Cedar";
        tree4.age = 60;
        tree4.height = 28.9;
        tree4.seasonType = "Summer";
        System.out.println("After re-initialization");
        System.out.println("Tree Name: " + tree4.treeName);
        System.out.println("Age: " + tree4.age);
        System.out.println("Height: " + tree4.height);
        System.out.println("Season Type: " + tree4.seasonType);

        ForestTree tree5 = new ForestTree();
        System.out.println("Default Tree Name: " + tree5.treeName);
        System.out.println("Default Age: " + tree5.age);
        System.out.println("Default Height: " + tree5.height);
        System.out.println("Default Season Type: " + tree5.seasonType);
        tree5.treeName = "Birch";
        tree5.age = 25;
        tree5.height = 15.3;
        tree5.seasonType = "Rainy";
        System.out.println("After re-initialization");
        System.out.println("Tree Name: " + tree5.treeName);
        System.out.println("Age: " + tree5.age);
        System.out.println("Height: " + tree5.height);
        System.out.println("Season Type: " + tree5.seasonType);
    }
}
