class Hammer{

    String[] names;
    Size[] sizes;

    Hammer(String[] names, Size[] sizes){
        this.names = names;
        this.sizes = sizes;
    }

    void display(){

        System.out.println("Hammer Information");

        if(this.names != null){
            System.out.println("Total Hammers: " + this.names.length);
            for(String name : this.names){
                System.out.println("Hammer Name: " + name);
            }
        }

        if(this.sizes != null){
            System.out.println("Total Sizes: " + this.sizes.length);
            for(Size size : this.sizes){
                System.out.println("Size: " + size.type);
                System.out.println("Weight: " + size.weight);
            }
        }
    }
}