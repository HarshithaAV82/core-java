class StoreTurbine{

    String[] turbineNames;
    int currentIndex;

    StoreTurbine(String[] turbineNames) {
        this.turbineNames = turbineNames;
    }

    void getTurbineName(String turbineName) {
        System.out.println("Executing getTurbineName");

        if(this.turbineNames != null){
            int index = this.turbineNames.length - 1;

            if(this.currentIndex <= index){
                this.turbineNames[currentIndex] = turbineName;
                System.out.println("Stored " + turbineName + " at index: " + currentIndex);
                currentIndex++;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Array is null");
        }
    }

    boolean searchTurbineName(String turbineName){
        if (turbineName != null && this.turbineNames != null){

            for (String name : this.turbineNames){
                if (name != null && name == turbineName){
                    System.out.println("Found: " + turbineName);
                    return true;
                }
            }

            System.out.println("Not Found: " + turbineName);
        }
        return false;
    }

    boolean update(int index, String newName) {
        System.out.println("Update by Index");

        if (this.turbineNames != null) {
            if (index >= 0 && index < this.turbineNames.length) {
                if (newName != null) {
                    System.out.println("Old: " + this.turbineNames[index]);
                    this.turbineNames[index] = newName;
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

        if (this.turbineNames != null && newName != null && oldName != null) {

            int index = 0;

            for (String name : this.turbineNames) {
                if (name != null && name == oldName) {
                    this.turbineNames[index] = newName;
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

        if (this.turbineNames != null) {
            if (index >= 0 && index < this.turbineNames.length) {

                String deleted = this.turbineNames[index];
                this.turbineNames[index] = null;

                System.out.println("Deleted: " + deleted);
                return deleted;
            }
        }

        System.out.println("Delete failed");
        return null;
    }

    String delete(String name){
        System.out.println("Delete by Name");

        if (this.turbineNames != null && name != null){

            int index = 0;

            for (String value : this.turbineNames){
                if (value != null && value == name){
                    this.turbineNames[index] = null;
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