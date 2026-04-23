class Rain{

    String type;
    double intensity;
    String season;
    double duration;
    boolean isHeavy;

   
    Rain(String type, double intensity, String season, double duration, boolean isHeavy){
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.duration = duration;
        this.isHeavy = isHeavy;
    }

  
    Rain(String type){
        this.type = type;
    }

   
    Rain(double intensity, String season){
        this.intensity = intensity;
        this.season = season;
    }

    Rain(double duration, boolean isHeavy){
        this.duration = duration;
        this.isHeavy = isHeavy;
    }


    Rain(String season, double duration, boolean isHeavy){
        this.season = season;
        this.duration = duration;
        this.isHeavy = isHeavy;
    }

  
    Rain(){
    }
}