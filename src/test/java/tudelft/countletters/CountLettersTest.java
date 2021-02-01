package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @ParameterizedTest
    @CsvSource({"cats|dogs", "near|far"})
    public void multipleMatchingWords(String string) {
        int words = new CountLetters().count(string);
        Assertions.assertEquals(2, words);
    }

    @ParameterizedTest
    @CsvSource({"cats|dog", "near|away"})
    public void lastWordDoesNotMatch(String string) {
        int words = new CountLetters().count(string);
        Assertions.assertEquals(1, words);
    }

    @ParameterizedTest
    @CsvSource({"cat|dogs", "close|far"})
    public void notLastWordDoesNotMatch(String string) {
        int words = new CountLetters().count(string);
        Assertions.assertEquals(1, words);
    }

}