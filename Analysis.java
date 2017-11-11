
package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File file;
    private Scanner reader;
    
    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() throws Exception{
        reader = new Scanner(file);
        int lineCount = 0;
        
        while(reader.hasNextLine()) {
            lineCount++;
            reader.nextLine();
        }
        return lineCount;
    }
    
    public int characters() throws Exception{
        reader = new Scanner(file);
        int charCount = 0;
        
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            charCount += line.length();
        }
        
        return charCount + this.lines();
    }
    
}
