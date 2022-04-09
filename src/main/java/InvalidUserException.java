public class InvalidUserException extends Exception {
String message;

    @Override
    public String getMessage() {
        return message;
    }

    public InvalidUserException(String str) {
        this.message=str;
    }
}
