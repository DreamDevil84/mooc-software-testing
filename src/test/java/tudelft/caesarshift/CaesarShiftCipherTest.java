package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "input={0},output={1}")
    @CsvSource({"abc,def","xyz,abc"})
    public void caesarShiftCipherTest(String input, String output){
        CaesarShiftCipher caesar = new CaesarShiftCipher();
        String result = caesar.CaesarShiftCipher(input, 3);
        Assertions.assertEquals(output, result);
    }

    @Test
    public void invalidInput(){
        CaesarShiftCipher caesar = new CaesarShiftCipher();
        String result = caesar.CaesarShiftCipher("ABC", 3);
        Assertions.assertEquals("invalid", result);
    }
}
