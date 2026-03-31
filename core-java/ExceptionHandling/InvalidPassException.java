package ExceptionHandling;

public class InvalidPassException extends Exception
{
    private String message;
    public InvalidPassException(String message)
    {
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
