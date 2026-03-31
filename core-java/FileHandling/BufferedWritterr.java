package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterr {
    static void main() throws IOException {
        FileWriter f = new FileWriter("D:\\java\\encapsulation\\src\\FileHandling\\B.txt",true);
        BufferedWriter bw = new BufferedWriter(f);
        bw.write("Pro_Spider s,dnkj wefnwekjfh wekljfnekwjfn klwefnlwek lkwefnlwekfn weklfjwelk wekldfnwelknf k,efhni3oh ,wefniowehfkjnr32ui4yf kjh234rt 2uk");
        bw.close();
    }
}
