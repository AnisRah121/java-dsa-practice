package Test;

public class StringRev1 {
    static void main() {
        String s1 = "java";
        char[] a = s1.toCharArray();

        int i = 0;
        int j = a.length - 1;
        while (i<j) {
            char temp= a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
            
        }
        String s2= new String(a);
        System.out.println();
    }
}
