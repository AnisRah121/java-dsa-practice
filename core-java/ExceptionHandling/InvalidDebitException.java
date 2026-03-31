package ExceptionHandling;

public class InvalidDebitException extends Exception
{
    private String message;
    public InvalidDebitException(String message)
    {
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
