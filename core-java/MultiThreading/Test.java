package MultiThreading;
class Mythread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Mythread :"+i);
        }
    }
}

public class Test {
    static void main() {
        Mythread t = new Mythread();
        t.start();
        for (int i = 0; i <=10 ; i++) {
            System.out.println("MainThread :"+i);
        }
    }
}
