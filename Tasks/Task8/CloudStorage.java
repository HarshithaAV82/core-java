class CloudStorage {

    static void upload(String fileName) {
        System.out.println("Uploading: " + fileName);
    }

    static void upload(String fileName, double size) {
        System.out.println("Uploading " + fileName + " | Size: " + size + "MB");
    }

    static void upload(String fileName, double size, boolean encrypted) {
        System.out.println("Uploading " + fileName + " | Size: " + size + "MB | Encrypted: " + encrypted);
    }
}