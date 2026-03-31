package ExceptionHandling;

public class MultipleCatch {
    static void main() {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(2);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(4);
        }
        finally {
            System.out.println("hello");
        }
    }
}
