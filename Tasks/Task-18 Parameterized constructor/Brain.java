class Brain{

    String partName;
    String function;
    String hemisphere;
    String lobe;
    String color;
    String structure;
    String nerveType;
    String protectionLayer;
    String signalType;
    String memoryType;
    double weight;
    double oxygenUsage;
    double activityLevel;
    double size;
    int neuronsCount;
    int age;
    int iqLevel;
    boolean healthy;
    boolean active;
    boolean damaged;

    Brain(String partName, String function, String hemisphere, String lobe,
          String color, String structure, String nerveType, String protectionLayer,
          String signalType, String memoryType,
          double weight, double oxygenUsage, double activityLevel, double size,
          int neuronsCount, int age, int iqLevel,
          boolean healthy, boolean active, boolean damaged) {

        this.partName = partName;
        this.function = function;
        this.hemisphere = hemisphere;
        this.lobe = lobe;
        this.color = color;
        this.structure = structure;
        this.nerveType = nerveType;
        this.protectionLayer = protectionLayer;
        this.signalType = signalType;
        this.memoryType = memoryType;
        this.weight = weight;
        this.oxygenUsage = oxygenUsage;
        this.activityLevel = activityLevel;
        this.size = size;
        this.neuronsCount = neuronsCount;
        this.age = age;
        this.iqLevel = iqLevel;
        this.healthy = healthy;
        this.active = active;
        this.damaged = damaged;
    }

    void printDetails() {

        System.out.println("Part Name: " + partName);
        System.out.println("Function: " + function);
        System.out.println("Hemisphere: " + hemisphere);
        System.out.println("Lobe: " + lobe);
        System.out.println("Color: " + color);
        System.out.println("Structure: " + structure);
        System.out.println("Nerve Type: " + nerveType);
        System.out.println("Protection Layer: " + protectionLayer);
        System.out.println("Signal Type: " + signalType);
        System.out.println("Memory Type: " + memoryType);
        System.out.println("Weight: " + weight);
        System.out.println("Oxygen Usage: " + oxygenUsage);
        System.out.println("Activity Level: " + activityLevel);
        System.out.println("Size: " + size);
        System.out.println("Neurons Count: " + neuronsCount);
        System.out.println("Age: " + age);
        System.out.println("IQ Level: " + iqLevel);
        System.out.println("Healthy: " + healthy);
        System.out.println("Active: " + active);
        System.out.println("Damaged: " + damaged);

        
    }
}