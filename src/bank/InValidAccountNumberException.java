package bank;

public class InValidAccountNumberException extends Exception{

    public InValidAccountNumberException(String message) {
        super(message);
    }
}
