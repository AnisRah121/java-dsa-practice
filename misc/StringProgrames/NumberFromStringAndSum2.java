package StringProgrames;

public class NumberFromStringAndSum2 {
    static void main() {
//        String s = "sd12bg24c2";
//        char[] a=s.toCharArray();
//        int sum=0;
//        int num = 0;
//        for (char c:a)
//        {
//            if (c>='0' && c<='9') {
//              num=num*10+(c-'0');
//            }
//            else {
//                sum = sum + num;
//                num=0;
//            }
//        }
//        sum=sum+num;
//        System.out.println(sum);


        String s = "sd12bg24c2";
        int sum=0;
        int num = 0;
        for (int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if (c>='0' && c<='9') {
                num=num*10+(c-'0');
            }
            else {
                sum = sum + num;
                num=0;
            }
        }
        sum=sum+num;
        System.out.println(sum);
    }
}
