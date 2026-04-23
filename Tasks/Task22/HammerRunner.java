class HammerRunner{

    public static void main(String[] args){

        String[] names = new String[3];
        names[0] = "Small Hammer";
        names[1] = "Medium Hammer";
        names[2] = "Big Hammer";

        Size[] sizes = new Size[3];
        sizes[0] = new Size("Small", 1.5);
        sizes[1] = new Size("Medium", 2.5);
        sizes[2] = new Size("Large", 3.5);

        Hammer hammer = new Hammer(names, sizes);
        hammer.display();
    }
}