package ExceptionHandling;

public class Throw4 {
    static void main() {
        double height =5.9;
        int weight=70;
        if(height>=6)
        {
            if(weight<=70)
            {
                try{
                    throw new InvalidWeightException("Less Weight");
                }
                catch (InvalidWeightException e)
                {
                    System.out.println(e.getMessage());
                    System.out.println("handle");

                }
            }

        }
        else
        {
            try
            {
                throw new InvalidHeightException("Less Height");
            }
            catch (InvalidHeightException e)
            {
                System.out.println(e.getMessage());
                System.out.println("handle2");
            }

        }
    }
}






