package ExceptionHandling;

public class Throwss2 {
    public static void num() throws InterruptedException
    {
        for (int i = 0; i <10 ; i++) {
            Thread.sleep(1000);
            System.out.println(i);

        }
    }

    static void main() throws InterruptedException{
        System.out.println("hi");
        try{
            Throwss2.num();
        }catch (Exception e)
        {
            System.out.println("hlw");
            System.out.println(e.getMessage());
        }

    }
}
