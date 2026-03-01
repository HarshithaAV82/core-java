class BrainRunner{

    public static void main(String[] args) {

        Brain brain1 = new Brain("Cerebrum","Thinking","Left","Frontal",
            "Gray","Complex","Motor","Skull","Electrical","Short Term",
            1.4,20.0,85.0,1400.0,860000000,25,110,true,true,false);
        brain1.printDetails();

        Brain brain2 = new Brain("Cerebellum","Balance","Right","Occipital",
            "Pink","Folded","Sensory","Skull","Chemical","Long Term",
            1.3,18.0,75.0,1300.0,800000000,30,105,true,true,false);
        brain2.printDetails();

        Brain brain3 = new Brain("Medulla","Breathing","Left","Temporal",
            "Gray","Simple","Autonomic","Skull","Electrical","Reflex",
            1.2,17.0,70.0,1250.0,700000000,35,100,true,false,false);
        brain3.printDetails();

        Brain brain4 = new Brain("Frontal Cortex","Decision","Right","Frontal",
            "Gray","Layered","Motor","Skull","Electrical","Working",
            1.5,21.0,90.0,1500.0,900000000,28,115,true,true,false);
        brain4.printDetails();

        Brain brain5 = new Brain("Temporal Lobe","Hearing","Left","Temporal",
            "Gray","Curved","Sensory","Skull","Chemical","Auditory",
            1.25,19.0,80.0,1350.0,750000000,32,108,true,true,false);
        brain5.printDetails();

        Brain brain6 = new Brain("Occipital Lobe","Vision","Right","Occipital",
            "Gray","Flat","Sensory","Skull","Electrical","Visual",
            1.28,18.5,78.0,1320.0,720000000,29,102,true,true,false);
        brain6.printDetails();

        Brain brain7 = new Brain("Parietal Lobe","Sensation","Left","Parietal",
            "Gray","Layered","Motor","Skull","Chemical","Sensory",
            1.35,19.5,82.0,1380.0,780000000,27,109,true,true,false);
        brain7.printDetails();

        Brain brain8 = new Brain("Brain Stem","Control","Right","Stem",
            "Pink","Simple","Autonomic","Skull","Electrical","Reflex",
            1.1,16.0,65.0,1200.0,650000000,40,98,true,false,false);
        brain8.printDetails();

        Brain brain9 = new Brain("Hippocampus","Memory","Left","Temporal",
            "Gray","Curved","Sensory","Skull","Chemical","Long Term",
            1.22,17.5,74.0,1280.0,690000000,31,104,true,true,false);
        brain9.printDetails();

        Brain brain10 = new Brain("Amygdala","Emotion","Right","Temporal",
            "Gray","Round","Autonomic","Skull","Chemical","Emotional",
            1.18,16.8,72.0,1230.0,670000000,33,101,true,true,false);
        brain10.printDetails();
    }
}