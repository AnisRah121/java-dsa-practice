package ExceptionHandling;

public class InvalidHeightException extends Exception
{
    private String message;
    public InvalidHeightException(String message)
    {
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
