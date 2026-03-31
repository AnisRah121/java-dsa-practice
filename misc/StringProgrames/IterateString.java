package StringProgrames;

public class IterateString {
    static void main() {
        String s = "java developer";
        for (int i = 0; i <s.length() ; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        char [] c= s.toCharArray();
        for (char a : c)
        {
            System.out.print(a);
        }
    }

}
