class StoreKettle{

    String[] kettleNames;
    int currentIndex;

    StoreKettle(String[] kettleNames){
        this.kettleNames = kettleNames;
    }

    void getKettleName(String kettleName){
        System.out.println("Executing getKettleName");

        if (this.kettleNames != null) {
            int index = this.kettleNames.length - 1;

            if (this.currentIndex <= index) {
                this.kettleNames[currentIndex] = kettleName;
                System.out.println("Stored " + kettleName + " at index: " + currentIndex);
                currentIndex++;
            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Array is null");
        }
    }

    boolean searchKettleName(String kettleName) {
        if (kettleName != null && this.kettleNames != null) {

            for (String name : this.kettleNames) {
                if (name != null && name== kettleName) {
                    System.out.println("Found: " + kettleName);
                    return true;
                }
            }

            System.out.println("Not Found: " + kettleName);
        }
        return false;
    }

    boolean update(int index, String newName) {
        System.out.println("Update by Index");

        if (this.kettleNames != null) {
            if (index >= 0 && index < this.kettleNames.length) {
                if (newName != null) {
                    System.out.println("Old: " + this.kettleNames[index]);
                    this.kettleNames[index] = newName;
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

        if (this.kettleNames != null && newName != null && oldName != null) {

            int index = 0;

            for (String name : this.kettleNames) {
                if (name != null && name == oldName) {
                    this.kettleNames[index] = newName;
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

        if (this.kettleNames != null) {
            if (index >= 0 && index < this.kettleNames.length) {

                String deleted = this.kettleNames[index];
                this.kettleNames[index] = null;

                System.out.println("Deleted: " + deleted);
                return deleted;
            }
        }

        System.out.println("Delete failed");
        return null;
    }

    String delete(String name) {
        System.out.println("Delete by Name");

        if (this.kettleNames != null && name != null) {

            int index = 0;

            for (String value : this.kettleNames) {
                if (value != null && value == name) {
                    this.kettleNames[index] = null;
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