class StoreCylinder{

    String[] cylinderNames;
    int currentIndex;

    StoreCylinder(String[] cylinderNames) {
        this.cylinderNames = cylinderNames;
    }

    void getCylinderName(String cylinderName) {

        System.out.println("Executing getCylinderName in StoreCylinder");
        System.out.println("Cylinder name: " + cylinderName);

        if (this.cylinderNames != null) {

            int index = this.cylinderNames.length - 1;
            System.out.println("Array last index: " + index);

            if (this.currentIndex <= index) {

                this.cylinderNames[currentIndex] = cylinderName;

                System.out.println("Stored '" + cylinderName + "' at index: " + currentIndex);

                currentIndex++;

                System.out.println("Next storing index: " + currentIndex);

            } else {
                System.out.println("Cylinder array is full, cannot store more");
            }

        } else {
            System.out.println("Cylinder array is null");
        }
    }

    boolean searchCylinderName(String cylinderName) {

        if (cylinderName != null) {

            System.out.println("Searching for '" + cylinderName + "'");

            if (this.cylinderNames != null) {

                for (String name : this.cylinderNames) {

                    System.out.println("Comparing " + name + " with " + cylinderName);

                    if (name != null && name == cylinderName) {

                        System.out.println("Found: " + cylinderName);
                        return true;
                    }
                }

                System.out.println("Not Found: " + cylinderName);
            }
        } else {
            System.out.println("Search value is null");
        }

        return false;
    }

    boolean update(int index, String newName) {

        System.out.println("Updating by index");

        if (this.cylinderNames != null) {

            if (index >= 0 && index < this.cylinderNames.length) {

                if (newName != null) {

                    System.out.println("Old value: " + this.cylinderNames[index]);

                    this.cylinderNames[index] = newName;

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

        if (this.cylinderNames != null && newName != null && oldName != null) {

            int index = 0;

            for (String name : this.cylinderNames) {

                System.out.println("Comparing " + name + " with " + oldName);

                if (name != null && name == oldName) {

                    this.cylinderNames[index] = newName;

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

        if (this.cylinderNames != null) {

            if (index >= 0 && index < this.cylinderNames.length) {

                String deleted = this.cylinderNames[index];

                this.cylinderNames[index] = null;

                System.out.println("Deleted: " + deleted);

                return deleted;
            }
        }

        System.out.println("Delete failed");
        return null;
    }

    String delete(String name) {

        System.out.println("Deleting by name");

        if (this.cylinderNames != null && name != null) {

            int index = 0;

            for (String value : this.cylinderNames) {

                System.out.println("Comparing " + value + " with " + name);

                if (value != null && value == name) {

                    this.cylinderNames[index] = null;

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