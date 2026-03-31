package ExceptionHandling;

public class NullPointer {
    static void main() {
        String s = null;
        //System.out.println(s.charAt(0));
        try {
            System.out.println(s.charAt(1));
        }
        catch (NullPointerException e ){
            System.out.println(e );
            System.out.println("nahi hoga reh" );
        }
        System.out.println("bhag");
    }
}
