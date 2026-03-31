package ExceptionHandling;

public class InvalidWeightException extends Exception
{
    private String message;
    public InvalidWeightException(String message)
    {
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
