package ExceptionHandling;

public class Throw3 {
    static void main() {
        int balance = 5000;
        int debit = 6000;
        if(debit<=balance)
        {
            System.out.println("withdraw successful");
        }
        else
        {
            try
            {
                throw new InvalidDebitException("invalid");
            }
            catch (InvalidDebitException e)
            {
                System.out.println(e.getMessage());
                System.out.println("handle2");
            }

        }
    }
}


