import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-cA-z]+[_+.\\-]?[a-zA-Z0-9]+@[a-zA-z0-9]+\\.[a-z]+[.]?[a-z]{2,3}$";
    private static final String LAST_NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String PASSWORD_PATTERN = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])^[A-Za-z\\d@$!%*?&]{8,}$";

    public boolean validateFirstName(String fName) throws InvalidUserException {

        Predicate<String> check = f -> (f.matches(FIRST_NAME_PATTERN));
        if (check.test(fName)) {
            System.out.println("Valid UserName");
            return check.test(fName);
        } else {
            throw new InvalidUserException("Invalid User Name, User Name should have first letter Capital & it should consists of 3 letters");
        }
    }


    public boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateLastName(String lName) throws InvalidUserException {
        Predicate<String> check = f -> (f.matches(LAST_NAME_PATTERN));
        if (check.test(lName)) {
            System.out.println("Valid UserName");
            return check.test(lName);
        } else {
                throw new InvalidUserException("Invalid Last Name, Last Name should have first letter Capital & it should consists of 6 letters");
            }
        }

    public boolean validatePassword(String password) throws InvalidUserException {
        Predicate<String> check = f -> (f.matches(PASSWORD_PATTERN));
        if (check.test(password)) {
            System.out.println("Valid Password");
            return check.test(password);
        } else {
            throw new InvalidUserException("Invalid Password, Password should have min 8 characters, at least 1 Capital letter & one 1 special characters");
        }
    }
    }

