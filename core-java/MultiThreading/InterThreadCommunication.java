package MultiThreading;

public class InterThreadCommunication {
    int bal;

    public InterThreadCommunication(int bal) {
        this.bal = bal;
    }
    public synchronized void deposit(int amount)
    {
        System.out.println("doing to deposit");
        bal=bal+amount;
        System.out.println("done ");
        notify();
    }
    public synchronized void withdraw(int amount)
    {
        if(amount>bal){
            System.out.println("less money");
        }
        try{
            wait();
        } catch (InterruptedException e) {

        }
        bal=bal-amount;
        System.out.println(amount+" withdwar done");
        System.out.println("balance="+bal);

    }
}


class Main {
    public static void main(String[] args) {

        InterThreadCommunication account =
                new InterThreadCommunication(2000);

        // Withdraw thread
        Thread t1 = new Thread(() -> {
            account.withdraw(5000);
        });

        // Deposit thread
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.deposit(10000);
        });

        t1.start();
        t2.start();
    }
}
