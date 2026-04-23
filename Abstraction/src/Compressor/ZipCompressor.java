package Compressor;

public class ZipCompressor implements  Compressor{
    @Override
    public void compress() {
        System.out.println("compress is running...");
    }

    @Override
    public void decompress() {
        System.out.println("decompress is running....");
    }
}
