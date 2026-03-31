package ExceptionHandling;

public class IndexOOBound {
    static void main() {
//        int[] a= {10,20,30};
//        //System.out.println(a[10]);
//        try{
//            System.out.println(a[10]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//            System.out.println("Not possible");
//
//        }
//        System.out.println("end");


        String s ="Raju";
        System.out.println(s.charAt(0));
        try {
            System.out.println(s.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e )
        {
            System.out.println(e);
            System.out.println("nahi  hoga reh");
        }
        System.out.println("end");
    }
}
