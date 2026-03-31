package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianMobileCount {
    static void main() throws IOException {
        FileReader fr = new FileReader("D:\\java\\encapsulation\\src\\FileHandling\\B.txt");
        BufferedReader br = new BufferedReader(fr);
        int count =0;
        String line;
        String regex="([6-9][0-9]{9})";
        Pattern p =Pattern.compile(regex);

        while ((line = br.readLine()) != null)
        {
            Matcher matcher = p.matcher(line);
            while(matcher.find()){
                count++;
            }

        }
        br.close();
        System.out.println("count:"+count);
    }
}
