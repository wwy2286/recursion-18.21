import static org.junit.Assert.assertEquals;

/**
 * Created by William Yu on 8/27/2017.
 */
public class DecimalToBinaryTest {
    @org.junit.Test
    public void toBinaryConverter() throws Exception {


        assertEquals("","1",DecimalToBinary.toBinaryConverter(1));
        assertEquals("","101",DecimalToBinary.toBinaryConverter(5));
        assertEquals("","1010",DecimalToBinary.toBinaryConverter(10));
        assertEquals("","1110100111010011",DecimalToBinary.toBinaryConverter(59859));
        assertEquals("","1110100111110101101011110100",DecimalToBinary.toBinaryConverter(245324532));
        assertEquals("","",DecimalToBinary.toBinaryConverter(0));

    }

    @org.junit.Test
    public void toBinary() throws Exception {
        assertEquals("","1",DecimalToBinary.toBinary(1));
        assertEquals("","101",DecimalToBinary.toBinary(5));
        assertEquals("","1010",DecimalToBinary.toBinary(10));
        assertEquals("","1110100111010011",DecimalToBinary.toBinary(59859));
        assertEquals("","1110100111110101101011110100",DecimalToBinary.toBinary(245324532));
        assertEquals("","0",DecimalToBinary.toBinary(0));
    }

}