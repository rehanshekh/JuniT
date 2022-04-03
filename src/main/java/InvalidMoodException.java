public class InvalidMoodException extends Exception {
    public String message;
    ExceptionType type;
    InvalidMoodException(ExceptionType type, String msg) {
        this.message = msg;
        this.type = type;
    }

    @Override
    public String getMessage() {
        return message;
    }

    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }
}
