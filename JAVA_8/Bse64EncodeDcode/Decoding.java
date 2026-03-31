package JAVA_8.Bse64EncodeDcode;

import java.util.Base64;

public class Decoding {
    static void main() {
        String decode ="bXkgbmFtZSBpcyBBbmlz";
        byte[] decode1 = Base64.getDecoder().decode(decode);
        String deco  = new String(decode1);
        System.out.println(deco);
        //Decode = my name is Anis


        String decodeUrl = "aHR0cHM6Ly93d3cueW91dHViZS5jb20v";
        byte[] decode2 = Base64.getUrlDecoder().decode(decodeUrl);
        String url = new String(decode2);
        System.out.println(url);
        //Decode = https://www.youtube.com/
    }
}
