import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenSadMood_ShouldReturnSad() throws InvalidMoodException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in SAD mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "sad";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenHappy_ShouldReturnHappy() throws InvalidMoodException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "sad";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenNullMood_ShouldThrowInvalidMoodException() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            moodAnalyzer.analyzeMood();
        } catch (InvalidMoodException e) {
            System.out.println("catch block execute");
            String expected = "Please enter proper input";
            Assert.assertEquals(expected, e.message);
        }
    }

    @Test
    public void givenAnyMood_ShouldReturnHappy() throws InvalidMoodException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String actual = moodAnalyzer.analyzeMood();
        String expected = "happy";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void givenEmptyMood_ShouldThrowInvalidMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            moodAnalyzer.analyzeMood();
        } catch (InvalidMoodException exception) {
            Assert.assertEquals(InvalidMoodException.ExceptionType.ENTERED_EMPTY,exception.type);
        }

    }

}