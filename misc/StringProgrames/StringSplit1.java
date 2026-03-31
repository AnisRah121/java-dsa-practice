package StringProgrames;

public class StringSplit1 {
    static void main() {
        String s = "java is very easy";
        String[] a = s.split(" ");
        for (String c:a)
        {
            System.out.println(c);
        }
    }
}
