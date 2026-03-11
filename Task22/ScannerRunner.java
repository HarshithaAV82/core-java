class ScannerRunner{

    public static void main(String[] args){

        String[] fileNames = new String[3];
        fileNames[0] = "Photo";
        fileNames[1] = "Certificate";
        fileNames[2] = "Document";

        Image[] images = new Image[3];
        images[0] = new Image("JPEG", 300);
        images[1] = new Image("PNG", 600);
        images[2] = new Image("PDF", 400);

        Scanner scanner = new Scanner(fileNames, images);
        scanner.display();
    }
}