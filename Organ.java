class Organ{

    String name;
    String function;
    String system;
    String location;
    String color;
    String tissueType;
    String protection;
    String shape;
    String structure;
    String bloodSupply;
    double weight;
    double size;
    double efficiency;
    double oxygenUse;
    int cellCount;
    int age;
    int capacity;
    boolean vital;
    boolean healthy;
    boolean transplantable;

    Organ(String name, String function, String system, String location,
          String color, String tissueType, String protection,
          String shape, String structure, String bloodSupply,
          double weight, double size, double efficiency, double oxygenUse,
          int cellCount, int age, int capacity,
          boolean vital, boolean healthy, boolean transplantable) {

        this.name = name;
        this.function = function;
        this.system = system;
        this.location = location;
        this.color = color;
        this.tissueType = tissueType;
        this.protection = protection;
        this.shape = shape;
        this.structure = structure;
        this.bloodSupply = bloodSupply;
        this.weight = weight;
        this.size = size;
        this.efficiency = efficiency;
        this.oxygenUse = oxygenUse;
        this.cellCount = cellCount;
        this.age = age;
        this.capacity = capacity;
        this.vital = vital;
        this.healthy = healthy;
        this.transplantable = transplantable;
    }

    void displayInfo(){ 
        System.out.println("Name: " + name);
        System.out.println("Function: " + function);
        System.out.println("System: " + system);
        System.out.println("Location: " + location);
        System.out.println("Color: " + color);
        System.out.println("Tissue Type: " + tissueType);
        System.out.println("Protection: " + protection);
        System.out.println("Shape: " + shape);
        System.out.println("Structure: " + structure);
        System.out.println("Blood Supply: " + bloodSupply);
        System.out.println("Weight: " + weight);
        System.out.println("Size: " + size);
        System.out.println("Efficiency: " + efficiency);
        System.out.println("Oxygen Use: " + oxygenUse);
        System.out.println("Cell Count: " + cellCount);
        System.out.println("Age: " + age);
        System.out.println("Capacity: " + capacity);
        System.out.println("Vital: " + vital);
        System.out.println("Healthy: " + healthy);
        System.out.println("Transplantable: " + transplantable);

    }
}