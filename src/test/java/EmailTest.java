import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {
    private String email2test;
    private boolean expectedResult;

    public EmailTest(String email, boolean expectedResult) {
        this.email2test = email;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{"rehanshekh@gmail.com", true},
                {"rozminsayyed00@gmail.com", true}});
    }

    @Test
    public void givenEmailAsVar_WhenValid_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress(this.email2test);
        Assert.assertEquals(this.expectedResult, result);
    }
}
