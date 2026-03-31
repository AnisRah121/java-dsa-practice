package ExceptionHandling;

public class NestedTryCatch {
    static void main() {
        int[] a ={1,2,3,4};
        try{
            try{
                System.out.println(a[4]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println(a[5]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(a[3]);
        }
    }
}
