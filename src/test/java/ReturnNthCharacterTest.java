import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturnNthCharacterTest {

    final String word = "ITCLiNicAl";
    final String counterWord = "ItCLINiCAL";
    final String specialWord = "!tCL1Nical";

    ReturnNthCharacter service;

    @Before
    public void setUp() {
        service = new ReturnNthCharacter();
    }

    @Test
    public void testReturnNthCharacterNegative() {
        assertEquals(service.returnNthCharacterFrom(word, -1), "");
    }

    @Test
    public void testReturnNthCharacterBiggerThanWord() {
        assertEquals(service.returnNthCharacterFrom(word, 100), "");
    }

    @Test
    public void testReturnNthCharacter() {
        assertEquals(service.returnNthCharacterFrom(word, 1), "ITCLNA");
        assertEquals(service.returnNthCharacterFrom(word, 2), "TLN");
        assertEquals(service.returnNthCharacterFrom(word, 3), "CNA");
        assertEquals(service.returnNthCharacterFrom(word, 10), "");
    }

    @Test
    public void testSpecialReturnNthCharacter() {
        assertEquals(service.returnNthCharacterFrom(specialWord, 1), "!CL1N");
    }

    @Test
    public void testCounter() {
        assertEquals(service.returnNthCharacterFrom(counterWord, 1), "ICLINCAL");
    }

}
