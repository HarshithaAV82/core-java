class StorePetroleum{

    String[] petroleumNames;
    int currentIndex;

    StorePetroleum(String[] petroleumNames){
        this.petroleumNames = petroleumNames;
    }

    void getPetroleumName(String petroleumName){
        System.out.println("Executing getPetroleumName");

        if (this.petroleumNames != null){
            int index = this.petroleumNames.length - 1;

            if (this.currentIndex <= index){
                this.petroleumNames[currentIndex] = petroleumName;
                System.out.println("Stored '" + petroleumName + "' at index: " + currentIndex);
                currentIndex++;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Array is null");
        }
    }

    boolean searchPetroleumName(String petroleumName){
        if (petroleumName != null && this.petroleumNames != null){

            for (String name : this.petroleumNames) {
                if (name != null && name == petroleumName){
                    System.out.println("Found: " + petroleumName);
                    return true;
                }
            }

            System.out.println("Not Found: " + petroleumName);
        }
        return false;
    }

    boolean update(int index, String newName) {
        System.out.println("Update by Index");

        if (this.petroleumNames != null) {
            if (index >= 0 && index < this.petroleumNames.length) {
                if (newName != null) {
                    System.out.println("Old: " + this.petroleumNames[index]);
                    this.petroleumNames[index] = newName;
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

        if (this.petroleumNames != null && newName != null && oldName != null) {

            int index = 0;

            for (String name : this.petroleumNames) {
                if (name != null && name == oldName) {
                    this.petroleumNames[index] = newName;
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

        if (this.petroleumNames != null){
            if (index >= 0 && index < this.petroleumNames.length){

                String deleted = this.petroleumNames[index];
                this.petroleumNames[index] = null;

                System.out.println("Deleted: " + deleted);
                return deleted;
            }
        }

        System.out.println("Delete failed");
        return null;
    }

    String delete(String name){
        System.out.println("Delete by Name");

        if (this.petroleumNames != null && name != null){

            int index = 0;

            for (String value : this.petroleumNames){
                if (value != null && value == name) {
                    this.petroleumNames[index] = null;
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