//class A {
//    public static void main(String[] args) {
//        System.out.println(m1(1));
//    }
//
//    static int m1(int i) {
//        System.out.println(i);
//        if (i >= 3) {
//            return i; // returning the last value
//        }
//        return m1(i + 1);
//    }
//}
class  Sum

{
    public static void add (int i, float j )
    {
        System.out.println(i+j);
    }
    public static void add (int i, float j,char k )
    {
        System.out.println(i+j+k);
    }
    public static void add (int i, float j,char k,double d )
    {
        System.out.println(i+j+k+d);
    }

    public static void main(String[] args)
    {
        Sum.add(13,13.5f);
        Sum.add(13,13.5f,'a');
        Sum.add(13,13.5f,'a',12.32423d);
    }
}
