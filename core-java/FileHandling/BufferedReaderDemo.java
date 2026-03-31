
package FileHandling;

import java.io.*;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(
                "D:\\java\\encapsulation\\src\\FileHandling\\B.txt"
        );

        BufferedReader br = new BufferedReader(fr);

        String s = br.readLine();
        while (s != null) {
            System.out.println(s);
            s = br.readLine();
        }

        br.close();
    }
}
