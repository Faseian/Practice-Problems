package chapter_17;

import java.io.*;
import java.util.Random;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\nab4n\\IdeaProjects\\Practice Problems\\src\\chapter_17\\Exercise17_1.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file), false);
        Random rand = new Random();
        int randomNumber;
        for (int i = 0; i < 100; i++) {
            randomNumber = rand.nextInt(100);
            printWriter.print(randomNumber + " ");
        }
        printWriter.close();
    }
}
