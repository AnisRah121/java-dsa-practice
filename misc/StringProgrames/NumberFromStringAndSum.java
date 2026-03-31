package StringProgrames;

public class NumberFromStringAndSum {
    static void main() {
        String s = "as12233sadw2134d";
        char[] a=s.toCharArray();
        int sum=0;
        for (char c:a)
        {
            if (c>='0' && c<='9') {
                sum = sum + (c - '0');
            }
        }
        System.out.println(sum);
    }
}
