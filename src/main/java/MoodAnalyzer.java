public class MoodAnalyzer {

    public String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {
    }

    public String analyzeMood() throws InvalidMoodException {
        try {
            if (message.length() == 0) {
                throw new InvalidMoodException(InvalidMoodException.ExceptionType.ENTERED_EMPTY, "Please enter an input");
            }
            if (this.message.toLowerCase().contains("sad")) {
                return "sad";
            } else {
                return "happy";
            }
        } catch (NullPointerException e) {
            throw new InvalidMoodException(InvalidMoodException.ExceptionType.ENTERED_NULL, "Please enter proper input");
        }
    }
}
