package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ReadData {
    static void main() throws IOException {
        File file  = new File("D:\\CJD_M95\\Final\\Test.java");
        FileInputStream f = new FileInputStream(file);
        FileWriter bf = new FileWriter("D:\\CJD_M95\\Final\\Test.txt");
        if (file.canRead())
        {
            int n = f.read();
            while(n!=-1)
            {
                bf.write((char)n);
                n= f.read();

            }
        }else
            System.out.println("can't Read");
        f.close();
        bf.close();
    }
}
