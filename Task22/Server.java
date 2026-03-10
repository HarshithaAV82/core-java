class Server{

    String[] systems;
    Power[] powers;

    Server(String[] systems, Power[] powers){
        this.systems = systems;
        this.powers = powers;
    }

    void display(){

        System.out.println("Server Details");

        if(this.systems != null){
            System.out.println("Total Systems: " + this.systems.length);
         for(String system : this.systems){
                System.out.println("System Name: " + system);
            }
        }

        if(this.powers != null){
            System.out.println("Total Power Units: " + this.powers.length);
          for(Power power : this.powers){
             System.out.println("Power Type: " + power.type);
                System.out.println("Power Capacity: " + power.capacity);
            }
        }
    }
}