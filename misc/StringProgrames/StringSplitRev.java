package StringProgrames;

public class StringSplitRev {
    static void main() {
        String s = "java is very easy";
        String[] a = s.split(" ");
        String str =a[a.length-1];

        for (int i =a.length-2; i>=0 ; i--) {
            str = str + " "+a[i];
        }
        System.out.println(str);








    }
}
