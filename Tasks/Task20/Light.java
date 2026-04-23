class Light{

    boolean on;
    int power;

    Light(boolean on, int power){
        this.on = on;
        this.power = power;
    }

    void getAquarium(){
        System.out.println("Light On: " + this.on);
        System.out.println("Power: " + this.power);
    }
}