package MultiThreading;

public class RunnableExample implements Runnable {
    @Override
    public void run(){
        for (char ch ='A'; ch <='z' ; ch++) {
            System.out.println(ch);
        }
    }
}
class TEst{
    static void main() {
        Runnable rn =new RunnableExample();
        Thread t1 = new Thread(rn);
        t1.start();
    }
}
