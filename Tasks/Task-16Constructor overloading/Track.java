class Track{

    String type;
    String location;
    double length;
    double width;
    boolean isIndoor;

    Track(String type, String location, double length, double width, boolean isIndoor){
        this.type = type;
        this.location = location;
        this.length = length;
        this.width = width;
        this.isIndoor = isIndoor;
    }

    Track(String type){
        this.type = type;
    }

    Track(String location, double length){
        this.location = location;
        this.length = length;
    }

    Track(double width, boolean isIndoor){
        this.width = width;
        this.isIndoor = isIndoor;
    }

    Track(String location, double length, double width){
        this.location = location;
        this.length = length;
        this.width = width;
    }

    Track(){  
    }
}