package StringProgrames;

public class RemoveDuplicate {
    static void main() {
        String s1 = "banana";
        String s2 ="";
        char[] a =s1.toCharArray();
        for (int i= 0 ; i<s1.length();i++)
        {
            if(s2.indexOf(a[i])==-1)
            {
              s2=s2+a[i];
            }
        }
        System.out.println(s2);
    }
}
