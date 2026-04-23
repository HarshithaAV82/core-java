class StoreTree{

    String[] treeNames;
    int currentIndex;

    StoreTree(String[] treeNames){
        this.treeNames = treeNames;
    }

    void getTreeName(String treeName){
        if (this.treeNames != null) {
            int index = this.treeNames.length - 1;

            if (this.currentIndex <= index){
                this.treeNames[currentIndex] = treeName;
                currentIndex++;
            }
        }
    }

    boolean searchTreeName(String treeName){
        if (treeName != null && this.treeNames != null){

            for (String name : this.treeNames) {
                if (name != null && name == treeName){
                    return true;
                }
            }
        }
        return false;
    }

    boolean update(int index, String newName){
        if (this.treeNames != null) {
            if (index >= 0 && index < this.treeNames.length){
                if (newName != null) {
                    this.treeNames[index] = newName;
                    return true;
                }
            }
        }
        return false;
    }

    boolean update(String newName, String oldName){
        if (this.treeNames != null && newName != null && oldName != null){

            int index = 0;

            for (String name : this.treeNames){
                if (name != null && name == oldName){
                    this.treeNames[index] = newName;
                    return true;
                }
                index++;
            }
        }
        return false;
    }

    String delete(int index){
        if (this.treeNames != null){
            if (index >= 0 && index < this.treeNames.length){
                String deleted = this.treeNames[index];
                this.treeNames[index] = null;
                return deleted;
            }
        }
        return null;
    }

    String delete(String name){
        if (this.treeNames != null && name != null){

            int index = 0;

            for (String value : this.treeNames){
                if (value != null && value == name){
                    this.treeNames[index] = null;
                    return name;
                }
                index++;
            }
        }
        return null;
    }
}