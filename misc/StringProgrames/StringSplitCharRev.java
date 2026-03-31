package StringProgrames;

public class StringSplitCharRev {
    static void main() {
        String s = "java is very easy";
        char[] a =s.toCharArray();
        String s1 = "";

        int  i = a.length-1;
        int j = a.length-1;
        while(i>=0)
        {
            while(i>=0 && a[i] != ' ')
            {
                i--;
            }
            String t = "";
            for (int k = i+1; k <=j ; k++) {
                t=t+a[k];
            }
            s1=s1+t;
            if(i>=0)s1=s1+" ";
            i--;
            j=i;
        }
        System.out.println(s1);
    }
}
