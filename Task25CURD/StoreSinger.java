class StoreSinger {

    String[] singerNames;
    int currentIndex;

    StoreSinger(String[] singerNames) {
        this.singerNames = singerNames;
    }

    void getSingerName(String singerName) {

        if (this.singerNames != null) {

            int index = this.singerNames.length - 1;

            if (this.currentIndex <= index) {
                this.singerNames[currentIndex] = singerName;
                currentIndex++;
            }
        }
    }

    boolean searchSingerName(String singerName) {

        if (singerName != null && this.singerNames != null) {

            for (String name : this.singerNames) {

                if (name != null && name == singerName) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean update(int index, String newName) {

        if (this.singerNames != null) {

            if (index >= 0 && index < this.singerNames.length) {

                if (newName != null) {
                    this.singerNames[index] = newName;
                    return true;
                }
            }
        }
        return false;
    }

    boolean update(String newName, String oldName) {

        if (this.singerNames != null && newName != null && oldName != null) {

            int index = 0;

            for (String name : this.singerNames) {

                if (name != null && name == oldName) {
                    this.singerNames[index] = newName;
                    return true;
                }

                index++;
            }
        }
        return false;
    }

    String delete(int index) {

        if (this.singerNames != null) {

            if (index >= 0 && index < this.singerNames.length) {

                String deleted = this.singerNames[index];
                this.singerNames[index] = null;
                return deleted;
            }
        }
        return null;
    }

    String delete(String name) {

        if (this.singerNames != null && name != null) {

            int index = 0;

            for (String value : this.singerNames) {

                if (value != null && value == name) {
                    this.singerNames[index] = null;
                    return name;
                }

                index++;
            }
        }
        return null;
    }
}