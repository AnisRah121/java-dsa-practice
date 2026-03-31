package MultiThreading;

public class TestSleep {
    static void main() throws InterruptedException {
        Mythread t = new Mythread();
        //sleep method executing
        t.start();
        for (int i = 0; i <=10 ; i++) {
            t.sleep(1000);
            System.out.println("MainThread :"+i);
        }
    }
}