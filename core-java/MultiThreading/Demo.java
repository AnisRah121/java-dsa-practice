package MultiThreading;

public class Demo {
    public  static T2 t2;
    static void main() throws InterruptedException{
        T1 t1 = new T1();
         t2 =new T2();
        t1.start();
        t2.start();
        t1.join();

        for (int i = 0; i <=10 ; i++) {
            System.out.println("Main thread"+i);
        }
    }
}
