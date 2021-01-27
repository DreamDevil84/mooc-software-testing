package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    private GHappy gHappy;

    @BeforeEach
    public void initialize() {this.gHappy = new GHappy();}

    @ParameterizedTest(name = "{0}")
    @CsvSource({"xxggxx","ggxx","xxgg"})
    public void gHappyTestTrue(String string){
        boolean result = gHappy.gHappy(string);
        Assertions.assertTrue(result);
    }


    @ParameterizedTest(name = "{0}")
    @CsvSource({"xxgxx","xxggyygxx","gxx","xxg"})
    public void gHappyTestFalse(String string){
        boolean result = gHappy.gHappy(string);
        Assertions.assertFalse(result);
    }
}
