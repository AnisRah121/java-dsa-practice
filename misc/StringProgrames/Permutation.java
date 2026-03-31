package StringProgrames;

public class Permutation {
    static void main() {
        String s ="abcd";
        permute(s,0,s.length()-1);


//        int count = 0;
//        for (int i = 0; i <=s.length()-1 ; i++) {
//            String s1 = swap (s,0,i);
//            for (int j = 1; j <= s.length()-1; j++) {
//                String s2 = swap (s1,1,j);
//                for (int k = 2; k <=s.length()-1 ; k++) {
//                    String s3 = swap (s2,2,k);
//                    count++;
//                    System.out.println(s3);
//                    System.out.println(count);
//
//                }
//            }

//        }
    }
    public  static void permute(String s, int start , int end) {
        if (start == end) {
            System.out.println(s);
            return;
        }

        for (int i = start; i <= end; i++) {
            String s1 = swap(s, start, i);
            permute(s1, start + 1, end);

        }


    }

    public static String swap(String s, int  i, int  j)
    {
        char [] a =s.toCharArray();
        while(i<=j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return new String(a);
    }

}
