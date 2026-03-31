package MultiThreading;

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException
    {
        MyT1 t1 =new MyT1();
        t1.setDaemon(true);
        t1.start();
        for (int i = 0; i <=10 ; i++) {
            Thread.sleep(3000);
            System.out.println("main="+i);

        }
    }
}
