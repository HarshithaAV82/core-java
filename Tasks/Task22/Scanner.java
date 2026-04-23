class Scanner{

    String[] fileNames;
    Image[] images;

    Scanner(String[] fileNames, Image[] images){
        this.fileNames = fileNames;
        this.images = images;
    }

    void display(){

        System.out.println("Scanner Details");

        if(this.fileNames != null){
            System.out.println("Total Files: " + this.fileNames.length);
            for(String file : this.fileNames){
                System.out.println("File Name: " + file);
            }
        }

        if(this.images != null){
            System.out.println("Total Images: " + this.images.length);
            for(Image image : this.images){
                System.out.println("Image Type: " + image.type);
                System.out.println("Resolution: " + image.resolution);
            }
        }
    }
}