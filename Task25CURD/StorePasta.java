class StorePasta{

    String[] pastaNames;
    int currentIndex;

    StorePasta(String[] pastaNames){
        this.pastaNames = pastaNames;
    }

    void getPastaName(String pastaName){

        System.out.println("Executing getPastaName in StorePasta");
        System.out.println("Pasta name: " + pastaName);

        if (this.pastaNames != null){

            int index = this.pastaNames.length - 1;
            System.out.println("Array last index: " + index);

            if (this.currentIndex <= index){

                this.pastaNames[currentIndex] = pastaName;

                System.out.println("Stored '" + pastaName + "' at index: " + currentIndex);

                currentIndex++;

                System.out.println("Next storing index: " + currentIndex);

            } else{
                System.out.println("Pasta array is full, cannot store more");
            }

        } else{
            System.out.println("Pasta array is null");
        }
    }

    boolean searchPastaName(String pastaName) {

        if (pastaName != null) {

            System.out.println("Searching for '" + pastaName + "'");

            if (this.pastaNames != null) {

                for (String name : this.pastaNames) {

                    System.out.println("Comparing " + name + " with " + pastaName);

                    if (name != null && name == pastaName) {

                        System.out.println("Found: " + pastaName);
                        return true;
                    }
                }

                System.out.println("Not Found: " + pastaName);
            }
        } else {
            System.out.println("Search value is null");
        }

        return false;
    }

    boolean update(int index, String newName) {

        System.out.println("Updating by index");

        if (this.pastaNames != null) {

            if (index >= 0 && index < this.pastaNames.length) {

                if (newName != null) {

                    System.out.println("Old value: " + this.pastaNames[index]);

                    this.pastaNames[index] = newName;

                    System.out.println("Updated to: " + newName);

                    return true;
                }
            }
        }

        System.out.println("Update failed");
        return false;
    }

    boolean update(String newName, String oldName) {

        System.out.println("Updating by name");

        if (this.pastaNames != null && newName != null && oldName != null) {

            int index = 0;

            for (String name : this.pastaNames) {

                System.out.println("Comparing " + name + " with " + oldName);

                if (name != null && name == oldName) {

                    this.pastaNames[index] = newName;

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

        System.out.println("Deleting by index");

        if (this.pastaNames != null) {

            if (index >= 0 && index < this.pastaNames.length) {

                String deleted = this.pastaNames[index];

                this.pastaNames[index] = null;

                System.out.println("Deleted: " + deleted);

                return deleted;
            }
        }

        System.out.println("Delete failed");
        return null;
    }

    String delete(String name){

        System.out.println("Deleting by name");

        if (this.pastaNames != null && name != null){

            int index = 0;

            for (String value : this.pastaNames){

                System.out.println("Comparing " + value + " with " + name);

                if (value != null && value == name){

                    this.pastaNames[index] = null;

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