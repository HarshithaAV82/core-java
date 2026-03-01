class Organizer{
    String brand;
    String type;
    String material;
    String color;
    String usage;
    String shape;
    String country;
    String model;
    String sizeType;
    String category;
    double price;
    double weight;
    double height;
    double width;
    int compartments;
    int stock;
    int year;
    boolean foldable;
    boolean waterproof;
    boolean durable;

    Organizer(String brand, String type, String material, String color,
              String usage, String shape, String country, String model,
              String sizeType, String category,
              double price, double weight, double height, double width,
              int compartments, int stock, int year,
              boolean foldable, boolean waterproof, boolean durable) {

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.usage = usage;
        this.shape = shape;
        this.country = country;
        this.model = model;
        this.sizeType = sizeType;
        this.category = category;
        this.price = price;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.compartments = compartments;
        this.stock = stock;
        this.year = year;
        this.foldable = foldable;
        this.waterproof = waterproof;
        this.durable = durable;
    }

    void showOrganizerDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Usage: " + usage);
        System.out.println("Shape: " + shape);
        System.out.println("Country: " + country);
        System.out.println("Model: " + model);
        System.out.println("Size Type: " + sizeType);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Compartments: " + compartments);
        System.out.println("Stock: " + stock);
        System.out.println("Year: " + year);
        System.out.println("Foldable: " + foldable);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Durable: " + durable);
    }
}