class Plant{

    String color;
    int size;

    Plant(String color, int size){
        this.color = color;
        this.size = size;
    }

    void getAquarium(){
        System.out.println("Plant Color: " + this.color);
        System.out.println("Plant Size: " + this.size);
    }
}