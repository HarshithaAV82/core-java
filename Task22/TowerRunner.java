class TowerRunner{

    public static void main(String[] args){

        String[] towerNames = {"Sky Tower", "City Tower", "Lake Tower"};

        Floor[] floors = new Floor[3];
        floors[0] = new Floor("Residential", 10);
        floors[1] = new Floor("Office", 12);
        floors[2] = new Floor("Parking", 8);

        Tower tower = new Tower(towerNames, floors);
        tower.display();
    }
}