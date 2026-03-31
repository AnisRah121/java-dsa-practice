package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    static void main() throws IOException {
        FileReader fr= new FileReader("D:\\java\\encapsulation\\src\\FileHandling\\B.txt");
        BufferedReader br= new BufferedReader(fr);
        int count =  0;
        String line ;
        while((line= br.readLine())!=null){
            String [] words = line.split(" ");
            count=count+words.length;
        }
        br.close();
        System.out.println("count :"+count);
    }
}
