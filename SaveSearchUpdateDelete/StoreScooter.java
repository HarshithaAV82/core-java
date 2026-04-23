class StoreScooter{

    String[] scooterNames;
    int currentIndex;

    StoreScooter(String[] scooterNames){
        this.scooterNames = scooterNames;
    }


    void getScooterName(String scooterName){
        System.out.println("Executing getScooterName");

        if (this.scooterNames != null){
            int index = this.scooterNames.length - 1;

            if (this.currentIndex <= index){
                this.scooterNames[currentIndex] = scooterName;
                System.out.println("Stored '" + scooterName + "' at index: " + currentIndex);
                currentIndex++;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Array is null");
        }
    }

    boolean searchScooterName(String scooterName) {
        if (scooterName != null && this.scooterNames != null) {

            for (String name : this.scooterNames) {
                if (name != null && name.equals(scooterName)) {
                    System.out.println("Found: " + scooterName);
                    return true;
                }
            }
            System.out.println("Not Found: " + scooterName);
        }
        return false;
    }

    
    boolean update(int index, String newName) {
        System.out.println("Update by Index");

        if (this.scooterNames != null) {
            if (index >= 0 && index < this.scooterNames.length) {
                if (newName != null) {
                    System.out.println("Old: " + this.scooterNames[index]);
                    this.scooterNames[index] = newName;
                    System.out.println("Updated to: " + newName);
                    return true;
                }
            }
        }
        System.out.println("Update failed");
        return false;
    }

    
    boolean update(String newName, String oldName) {
        System.out.println("Update by Name");

        if (this.scooterNames != null && newName != null && oldName != null) {

            int index = 0;

            for (String name : this.scooterNames) {
                if (name != null && name.equals(oldName)) {
                    this.scooterNames[index] = newName;
                    System.out.println("Updated " + oldName + " to " + newName);
                    return true;
                }
                index++;
            }
        }

        System.out.println("Update failed");
        return false;
    }

    String delete(int index) {
        System.out.println("Delete by Index");

        if (this.scooterNames != null) {
            if (index >= 0 && index < this.scooterNames.length){

                String deleted = this.scooterNames[index];
                this.scooterNames[index] = null;

                System.out.println("Deleted: " + deleted);
                return deleted;
            }
        }
        System.out.println("Delete failed");
        return null;
    }

    
    String delete(String name){
        System.out.println("Delete by Name");

        if (this.scooterNames != null && name != null){

            int index = 0;

            for (String value : this.scooterNames) {
                if (value != null && value.equals(name)){
                    this.scooterNames[index] = null;
                    System.out.println("Deleted: " + name);
                    return name;
                }
                index++;
            }
        }

        System.out.println("Delete failed");
        return null;
    }
}