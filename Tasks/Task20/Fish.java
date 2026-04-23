class Fish{

    String name;
    int count;

    Fish(String name, int count){

        this.name = name;
        this.count = count;
    }

    void getAquarium(){

        System.out.println("Fish Name: " + this.name);
        System.out.println("Count: " + this.count);

        System.out.println("Created Fish using constructor");
    }
}