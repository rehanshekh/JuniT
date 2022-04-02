import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-cA-z]+[_+.\\-]?[a-zA-Z0-9]+@[a-zA-z0-9]+\\.[a-z]+[.]?[a-z]{2,3}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String fName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fName).matches();
    }

    public boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateLastName(String lName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lName).matches();
    }
}
