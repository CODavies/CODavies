package MyresBriggs;

public class ExceptionClass extends Exception{
    public ExceptionClass() {
    }

    public ExceptionClass(String message) {
        super(message);
    }

    public ExceptionClass(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionClass(Throwable cause) {
        super(cause);
    }
}
