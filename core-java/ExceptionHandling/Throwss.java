package ExceptionHandling;

public class Throwss {
    public  static void  div(){
        System.out.println(10/0);
    }

    static void main() {
        System.out.println("hi");
      try{
          Throwss.div();
      }catch (ArithmeticException e)
      {
          System.out.println(e.getMessage());
      }
    }
}
