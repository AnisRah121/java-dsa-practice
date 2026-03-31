package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    static void main() throws IOException {
        File file = new File("D:\\java\\encapsulation\\src\\FileHandling\\A.txt");
        FileWriter f =new FileWriter(file);
        if (file.canWrite()) {
            f.write("java is best\n");
            f.write("java is best\n");
            f.write("java is best\n");
            f.write("java is best\n");
        }
        else {
            System.out.println("can't write");
        }

        f.close();
    }
}
