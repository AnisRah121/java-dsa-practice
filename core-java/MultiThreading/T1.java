package MultiThreading;

public class T1 extends Thread  {
   @Override
    public void run(){
       try {
           Demo.t2.join();
       } catch (InterruptedException e) {

       }
       for (int i = 0; i <=10 ; i++) {
           System.out.println("T1 execute"+i);
       }
   }
}
