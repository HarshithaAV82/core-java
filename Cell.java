class Cell{
    String type;
    String function;
    String shape;
    String structure;
    String nucleusType;
    String membraneType;
    String cytoplasm;
    String organism;
    String reproductionType;
    String energySource;
    double size;
    double lifespan;
    double activityLevel;
    double oxygenUse;
    int chromosomeCount;
    int mitochondriaCount;
    int age;
    boolean living;
    boolean dividing;
    boolean healthy;

    Cell(String type, String function, String shape, String structure,
         String nucleusType, String membraneType, String cytoplasm,
         String organism, String reproductionType, String energySource,
         double size, double lifespan, double activityLevel, double oxygenUse,
         int chromosomeCount, int mitochondriaCount, int age,
         boolean living, boolean dividing, boolean healthy) {

        this.type = type;
        this.function = function;
        this.shape = shape;
        this.structure = structure;
        this.nucleusType = nucleusType;
        this.membraneType = membraneType;
        this.cytoplasm = cytoplasm;
        this.organism = organism;
        this.reproductionType = reproductionType;
        this.energySource = energySource;
        this.size = size;
        this.lifespan = lifespan;
        this.activityLevel = activityLevel;
        this.oxygenUse = oxygenUse;
        this.chromosomeCount = chromosomeCount;
        this.mitochondriaCount = mitochondriaCount;
        this.age = age;
        this.living = living;
        this.dividing = dividing;
        this.healthy = healthy;
    }

    void showCellInfo() {
        System.out.println("Type: " + type);
        System.out.println("Function: " + function);
        System.out.println("Shape: " + shape);
        System.out.println("Structure: " + structure);
        System.out.println("Nucleus Type: " + nucleusType);
        System.out.println("Membrane Type: " + membraneType);
        System.out.println("Cytoplasm: " + cytoplasm);
        System.out.println("Organism: " + organism);
        System.out.println("Reproduction Type: " + reproductionType);
        System.out.println("Energy Source: " + energySource);
        System.out.println("Size: " + size);
        System.out.println("Lifespan: " + lifespan);
        System.out.println("Activity Level: " + activityLevel);
        System.out.println("Oxygen Use: " + oxygenUse);
        System.out.println("Chromosome Count: " + chromosomeCount);
        System.out.println("Mitochondria Count: " + mitochondriaCount);
        System.out.println("Age: " + age);
        System.out.println("Living: " + living);
        System.out.println("Dividing: " + dividing);
        System.out.println("Healthy: " + healthy);

    }
}