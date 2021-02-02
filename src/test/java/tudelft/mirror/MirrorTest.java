package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

    @ParameterizedTest(name = "Input = {0}, Output = {1}")
    @CsvSource({"aba,aba","abba,abba","abXYZba,ab"})
    public void mirrorTest(String string, String expected){
        Mirror mirror = new Mirror();

        String result = mirror.mirrorEnds(string);

        Assertions.assertEquals(expected, result);
    }

}
