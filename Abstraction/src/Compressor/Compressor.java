package Compressor;

public interface Compressor{

    void compress();

    void decompress();

    default void showPercentage(){

        System.out.println("executing show percentage in compressor..");
    }
}
