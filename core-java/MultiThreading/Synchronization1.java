package MultiThreading;

public class Synchronization1 {
    public static synchronized void m1(String s)
    {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("executed by :"+s);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){

            }
        }
    }
}

class Myth extends Thread{
    Synchronization1 s1 ;
    String s ;
    public Myth(Synchronization1 s1 , String s)
    {
        this.s=s;
        this.s1=s1;
    }
    @Override
    public void run()
    {
        for (int i = 0; i <=10 ; i++) {
            Synchronization1.m1(s);;
        }
    }

}


