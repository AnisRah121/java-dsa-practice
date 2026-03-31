package ExceptionHandling;

public class Throw2 {
    static void main() {
        int id =123;
        int pass=321;
        if(id==123)
        {
            if(pass==321)
            {
                try{
                    throw new InvalidPassException("invalid");
                }
                catch (InvalidPassException e)
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
               throw new InvalidIdException("invalid");
            }
            catch (InvalidIdException e)
            {
                System.out.println(e.getMessage());
                System.out.println("handle2");
            }

        }
    }
}


