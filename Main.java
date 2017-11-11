package file;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/testfile.txt");

        Analysis analysis = new Analysis(file);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(analysis.lines());
            }

        } catch (Exception e) {

        }
    }
}
