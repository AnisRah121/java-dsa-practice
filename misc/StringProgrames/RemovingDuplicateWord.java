
package StringProgrames;

public class RemovingDuplicateWord {

    public static void main(String[] args) {

        String str = "java is very very easy java";
        String[] a = str.split(" ");
        String s1 = "";

        for (int i = 0; i < a.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (a[i].equals(a[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                s1 = s1 + a[i] + " ";
            }
        }

        System.out.println(s1.trim());
    }
}

