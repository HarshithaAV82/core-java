class Walnut{

    int weight;
    Consumer consumer;
    WalnutType walnutType;

    Walnut(int weight, Consumer consumer, WalnutType walnutType){
        this.weight = weight;
        this.consumer = consumer;
        this.walnutType = walnutType;
    }

    void printInfo(){

        System.out.println("Weight: " + this.weight);

        if (consumer != null){
            System.out.println("Walnut Price: " + this.consumer.wallnutPrice);
        } else {
            System.out.println("Consumer is null...");
        }

        if (walnutType != null){
            System.out.println("WalnutType: " +this.walnutType);
        } else {
            System.out.println("WalnutType is null...");
        }
    }
}

