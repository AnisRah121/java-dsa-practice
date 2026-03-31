package StringProgrames;

public class SubstringPalindrom {
    static void main() {

        String s = "banana";
        for (int i = 0; i <s.length()-1 ; i++) {
            for (int j = i+1; j < s.length()-1; j++) {
                if (isPallindrome(s,i,j)) {
                    System.out.println(s.substring(i,j+1));
                }
            }
        }
    }

    public static boolean isPallindrome(String s,int start,int end )
    {
        char[] c = s.toLowerCase().toCharArray();
        int  i=start;
        int j = end;
        while(i<=j) {
            if(c[i]!=c[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
