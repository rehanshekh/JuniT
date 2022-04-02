import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenAnyMood_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "Happy";
        Assert.assertEquals(expected, actual);
    }
}
