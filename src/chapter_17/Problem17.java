package chapter_17;

import java.io.File;
import java.io.IOException;

public class Problem17 {
    public static void main(String[] args) throws IOException {
        File datPath = new File("C:\\Users\\nab4n\\IdeaProjects\\Practice Problems\\src\\chapter_17\\Exercise17_17.dat");
        BitOutputStream bitOutputStream = new BitOutputStream(datPath);
        bitOutputStream.writeBit('0');
        bitOutputStream.writeBit("100010101010");
        bitOutputStream.writeBit("100111111010101010");
        bitOutputStream.close();
    }
}
