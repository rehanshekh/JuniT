import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result;
        try {
            result = validator.validateFirstName("Rehan");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception Occur: "+e.getMessage());
        }

    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("rehanshekh@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validateLastName("Shaikh");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println("Caught Exception");
            System.out.println(e.getMessage());
        }

    }@Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = false;
        try {
            result = validator.validatePassword("Shaikh@44");
            Assert.assertTrue(result);
        } catch (InvalidUserException e) {
            System.out.println("Caught Exception");
            System.out.println(e.getMessage());
        }

    }}
