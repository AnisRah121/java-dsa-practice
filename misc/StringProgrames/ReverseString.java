package StringProgrames;

public class ReverseString {
    static void main() {
        String s ="java";
        String str= "";
        for (int i = s.length()-1; i >=0 ; i--) {
            str= str + s.charAt(i);

        }
        System.out.println(str);
        System.out.println(swap("java"));
    }

    public static String swap(String s)
    {
        char[] c = s.toCharArray();
        int  i=0;
        int j = c.length-1;
        while(i<=j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return new String(c);

    }
}
