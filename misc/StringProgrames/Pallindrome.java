package StringProgrames;

public class Pallindrome {
    static void main() {
        System.out.println(isPallindrome("MaDAM"));
    }

    public static boolean isPallindrome(String s )
    {
        char[] c = s.toLowerCase().toCharArray();
        int  i=0;
        int j = c.length-1;
        while(i<=j) {
            if(c[i]!=c[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
