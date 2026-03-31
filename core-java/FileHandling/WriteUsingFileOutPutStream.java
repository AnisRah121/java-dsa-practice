package FileHandling;


import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingFileOutPutStream {
    static void main() throws IOException {
        FileOutputStream f = new FileOutputStream("D:\\java\\encapsulation\\src\\FileHandling\\B.txt");
        //f.write("Anis");
        String s="RamaSita";
        byte[] bytes = s.getBytes();
        f.write(bytes);
        f.close();
    }
}
