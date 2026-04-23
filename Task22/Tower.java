class Tower{

    String[] towerNames;
    Floor[] floors;

    Tower(String[] towerNames, Floor[] floors){
        this.towerNames = towerNames;
        this.floors = floors;
    }

    void display(){

        System.out.println("Tower Details");

        if(this.towerNames != null){
            System.out.println("Total Towers: " + this.towerNames.length);

            for(String tower : this.towerNames){
                System.out.println("Tower Name: " + tower);
            }
        }

        if(this.floors != null){
            System.out.println("Total Floors: " + this.floors.length);

            for(Floor floor : this.floors){
                System.out.println("Floor Type: " + floor.type);
                System.out.println("Height: " + floor.height);
            }
        }
    }
}