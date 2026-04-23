package Compressor;

public class ZipCompressRunner {

    public static void main(String[] args) {
        ZipCompressor zipCompressor = new ZipCompressor();
        zipCompressor.compress();
        zipCompressor.decompress();
        zipCompressor.showPercentage();
    }
}
