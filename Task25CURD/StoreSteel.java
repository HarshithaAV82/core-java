class StoreSteel{

    String[] steelNames;
    int currentIndex;

    StoreSteel(String[] steelNames){
        this.steelNames = steelNames;
    }

    void getSteelName(String steelName){

        System.out.println("Executing getSteelName");
        System.out.println("Steel name: " + steelName);

        if (this.steelNames != null) {

            int index = this.steelNames.length - 1;

            if (this.currentIndex <= index){

                this.steelNames[currentIndex] = steelName;

                System.out.println("Stored at index: " + currentIndex);

                currentIndex++;

            } else {
                System.out.println("Array is full");
            }

        } else {
            System.out.println("Array is null");
        }
    }

   
    boolean searchSteelName(String steelName){

        if (steelName != null && this.steelNames != null) {

            for (String name : this.steelNames) {

                System.out.println("Comparing " + name + " with " + steelName);

                if (name != null && name == steelName) {
                    System.out.println("Found: " + steelName);
                    return true;
                }
            }

            System.out.println("Not Found: " + steelName);
        }

        return false;
    }

    boolean update(int index, String newName) {

        System.out.println("Update by Index");

        if (this.steelNames != null) {

            if (index >= 0 && index < this.steelNames.length) {

                if (newName != null) {

                    System.out.println("Old Value: " + this.steelNames[index]);

                    this.steelNames[index] = newName;

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

        if (this.steelNames != null && newName != null && oldName != null) {

            int index = 0;

            for (String name : this.steelNames) {

                System.out.println("Comparing " + name + " with " + oldName);

                if (name != null && name == oldName) {

                    this.steelNames[index] = newName;

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

        if (this.steelNames != null) {

            if (index >= 0 && index < this.steelNames.length){

                String deleted = this.steelNames[index];

                this.steelNames[index] = null;

                System.out.println("Deleted: " + deleted);

                return deleted;
            }
        }

        System.out.println("Delete failed");
        return null;
    }

    
    String delete(String name){

        System.out.println("Delete by Name");

        if (this.steelNames != null && name != null){

            int index = 0;

            for (String value : this.steelNames){

                System.out.println("Comparing " + value + " with " + name);

                if (value != null && value == name){

                    this.steelNames[index] = null;

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