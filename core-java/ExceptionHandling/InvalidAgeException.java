package ExceptionHandling;

public class InvalidAgeException extends RuntimeException{
    private String message;
    InvalidAgeException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
