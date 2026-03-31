package MultiThreading;

class T2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println("T2 execute"+i);
        }
    }
}