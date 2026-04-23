class PenDriveRunner{

    public static void main(String[] args) {

        PenDrive penDrive1 = new PenDrive();

        penDrive1.brand = "SanDisk";
        penDrive1.model = "Ultra Flair";
        penDrive1.price = 799;
        penDrive1.storage = 64;
        penDrive1.color = "Silver";
        penDrive1.weight = 10.5;
        penDrive1.warranty = true;
        penDrive1.working = true;
        penDrive1.type = "USB 3.0";
        penDrive1.material = "Metal";
        penDrive1.country = "India";
        penDrive1.speed = "150MB/s";
        penDrive1.usbType = "Type-A";
        penDrive1.version = 3;
        penDrive1.packaging = "Box";
        penDrive1.waterproof = false;
        penDrive1.shockproof = true;
        penDrive1.compatibility = "Windows/Mac";
        penDrive1.shape = "Rectangle";
        penDrive1.design = "Compact";

        penDrive1.supportedDevices = new String[]{"Laptop", "Desktop", "Smart TV"};
        penDrive1.availableStores = new String[]{"Amazon", "Flipkart"};
        penDrive1.features = new String[]{"High Speed", "Durable", "Lightweight"};
        System.out.println("Brand: " + penDrive1.brand);
        System.out.println("Model: " + penDrive1.model);
        System.out.println("Price: " + penDrive1.price);
        System.out.println("Storage: " + penDrive1.storage + "GB");
        System.out.println("Color: " + penDrive1.color);
        System.out.println("Weight: " + penDrive1.weight);
        System.out.println("Warranty: " + penDrive1.warranty);
        System.out.println("Working: " + penDrive1.working);
        System.out.println("Type: " + penDrive1.type);
        System.out.println("Material: " + penDrive1.material);
        System.out.println("Country: " + penDrive1.country);
        System.out.println("Speed: " + penDrive1.speed);
        System.out.println("USB Type: " + penDrive1.usbType);
        System.out.println("Version: " + penDrive1.version);
        System.out.println("Packaging: " + penDrive1.packaging);
        System.out.println("Waterproof: " + penDrive1.waterproof);
        System.out.println("Shockproof: " + penDrive1.shockproof);
        System.out.println("Compatibility: " + penDrive1.compatibility);
        System.out.println("Shape: " + penDrive1.shape);
        System.out.println("Design: " + penDrive1.design);

        System.out.println("Supported Devices:");
        for(int i=0;i<penDrive1.supportedDevices.length;i++){
            System.out.println(penDrive1.supportedDevices[i]);
        }

        System.out.println("Available Stores:");
        for(int i=0;i<penDrive1.availableStores.length;i++){
            System.out.println(penDrive1.availableStores[i]);
        }

        System.out.println("Features:");
        for(int i=0;i<penDrive1.features.length;i++){
            System.out.println(penDrive1.features[i]);
        }

       
        PenDrive penDrive2 = new PenDrive();

        penDrive2.brand = "HP";
        penDrive2.model = "v236w";
        penDrive2.price = 499;
        penDrive2.storage = 32;
        penDrive2.color = "Black";
        penDrive2.weight = 8.2;
        penDrive2.warranty = true;
        penDrive2.working = true;
        penDrive2.type = "USB 2.0";
        penDrive2.material = "Plastic";
        penDrive2.country = "China";
        penDrive2.speed = "80MB/s";
        penDrive2.usbType = "Type-A";
        penDrive2.version = 2;
        penDrive2.packaging = "Cover Pack";
        penDrive2.waterproof = false;
        penDrive2.shockproof = false;
        penDrive2.compatibility = "Windows";
        penDrive2.shape = "Slim";
        penDrive2.design = "Basic";

        penDrive2.supportedDevices = new String[]{"Laptop", "Car Stereo"};
        penDrive2.availableStores = new String[]{"Croma", "Reliance Digital"};
        penDrive2.features = new String[]{"Affordable", "Easy to Use"};
        System.out.println("Brand: " + penDrive2.brand);
        System.out.println("Model: " + penDrive2.model);
        System.out.println("Price: " + penDrive2.price);
        System.out.println("Storage: " + penDrive2.storage + "GB");
        System.out.println("Color: " + penDrive2.color);
        System.out.println("Weight: " + penDrive2.weight);
        System.out.println("Warranty: " + penDrive2.warranty);
        System.out.println("Working: " + penDrive2.working);
        System.out.println("Type: " + penDrive2.type);
        System.out.println("Material: " + penDrive2.material);
        System.out.println("Country: " + penDrive2.country);
        System.out.println("Speed: " + penDrive2.speed);
        System.out.println("USB Type: " + penDrive2.usbType);
        System.out.println("Version: " + penDrive2.version);
        System.out.println("Packaging: " + penDrive2.packaging);
        System.out.println("Waterproof: " + penDrive2.waterproof);
        System.out.println("Shockproof: " + penDrive2.shockproof);
        System.out.println("Compatibility: " + penDrive2.compatibility);
        System.out.println("Shape: " + penDrive2.shape);
        System.out.println("Design: " + penDrive2.design);

        System.out.println("Supported Devices:");
        for(int i=0;i<penDrive2.supportedDevices.length;i++){
            System.out.println(penDrive2.supportedDevices[i]);
        }

        System.out.println("Available Stores:");
        for(int i=0;i<penDrive2.availableStores.length;i++){
            System.out.println(penDrive2.availableStores[i]);
        }

        System.out.println("Features:");
        for(int i=0;i<penDrive2.features.length;i++){
            System.out.println(penDrive2.features[i]);
        }
    }
}