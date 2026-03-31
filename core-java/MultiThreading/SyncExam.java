package MultiThreading;

public class SyncExam{
    static void main() {
        Synchronization1 s1 = new Synchronization1();
        Synchronization1 s2 = new Synchronization1();
        Myth t1 = new Myth(s1,"t1");
        Myth t2 = new Myth(s2,"t2");
        t1.start();
        t2.start();
    }
}
