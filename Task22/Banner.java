class Banner{

    String[] titles;
    Stand[] stands;

    Banner(String[] titles, Stand[] stands){
        this.titles = titles;
        this.stands = stands;
    }

    void display(){

        System.out.println("Banner Details");
        if(this.titles != null){
            System.out.println("Total Titles: " + this.titles.length);
            for(String title : this.titles){
                System.out.println("Banner Title: " + title);
            }
        }

        if(this.stands != null){
            System.out.println("Total Stands: " + this.stands.length);
            for(Stand stand : this.stands){
                System.out.println("Stand Type: " + stand.type);
                System.out.println("Height: " + stand.height);
            }
        }
    }
}