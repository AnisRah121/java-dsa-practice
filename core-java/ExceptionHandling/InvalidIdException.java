package ExceptionHandling;

public class InvalidIdException extends Exception
{
    private String message;
    public InvalidIdException(String message)
    {
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
