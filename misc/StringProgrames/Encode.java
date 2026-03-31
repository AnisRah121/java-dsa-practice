package StringProgrames;

public class Encode {
    static void main() {

        System.out.println(encode("java",6));

    }
    public static String encode(String s , int level)
    {
        char[] c ="abcdefghijklmnopqrstuvwxyz".toCharArray();
        String s1 ="";
        char[] a =s.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            int index = a[i] - 'a';
            index = index + level;
            index = index % 26;
            s1 = s1 + c[index];
        }
        return s1;
    }
}
