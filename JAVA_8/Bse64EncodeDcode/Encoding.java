package JAVA_8.Bse64EncodeDcode;

import java.util.Base64;

public class Encoding {
    static void main() {
        String message= "my name is Anis";
        String s = Base64.getEncoder().encodeToString(message.getBytes());
        System.out.println(s);
        //Encode = bXkgbmFtZSBpcyBBbmlz

        String url = "https://www.youtube.com/";
        String encoded = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println(encoded);

        //Encode = aHR0cHM6Ly93d3cueW91dHViZS5jb20v
    }
}
