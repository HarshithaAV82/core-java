class BucketRunner{

    public static void main(String[] args) {

        Bucket bucket = new Bucket("Plastic", "Blue", 20, 250.50, true);

        System.out.println("Bucket Material: " + bucket.material);
        System.out.println("Bucket Color: " + bucket.color);
        System.out.println("Bucket Capacity: " + bucket.capacity + " Liters");
        System.out.println("Bucket Price: " + bucket.price);
        System.out.println("Bucket Has Handle: " + bucket.hasHandle);
    }
}