import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturnNthCharacterTest {

    final String word = "ITCLiNicAl";
    final String specialWord = "!tCL1Nical";

    ReturnNthCharacter service;

    @Before
    public void setUp() {
        service = new ReturnNthCharacter();
    }

    /*
        Project instructions

        Write a java service using a TDD approach that, given a text,
        returns every Nth character from that text that is uppercase. N is a configurable parameter.

        For example:
        Given "ITCLiNicAl" and N = 1, the return value will be "ITCLNA";
        Given "ITCLiNicAl" and N = 2, the return value will be "TLN";
        Given "ITCLiNicAl" and N = 3, the return value will be "CNA";
        Given "ITCLiNicAl" and N = 100, the return value will be "";
        Given "ITCLiNicAl" and N = -1, the return value will be "";
    */

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

}
