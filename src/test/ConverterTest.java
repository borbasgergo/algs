package test;

import main.Converter;
import main.IllegalRangeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class ConverterTest {

    // mocking the class
    private static Converter converter;

    @BeforeEach
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void setIntegerNumber_check_if_rangeLimitation_throwsException_for4000() {
        assertThrows(IllegalRangeException.class, () -> converter.setIntegerNumber(4000));
    }

    @Test
    public void setIntegerNumber_check_if_rangeLimitation_throwsException_for0() {
        assertThrows(IllegalRangeException.class, () -> converter.setIntegerNumber(0));
    }

    @Test
    public void setIntegerNumber_rangeLimitation_shouldNot_throwException() throws IllegalRangeException {
        // setup
        int input = 2500;

        // action
        converter.setIntegerNumber(input);

        // goal
        int desiredResult = 2500;

        // actual
        int actual = converter.getIntegerNumber();

        // assertion
        assertEquals(actual, desiredResult);
    }
    @Test
    public void convertToRomans_should_throwException_forNullNumber() {
        assertThrows(IllegalArgumentException.class, () -> converter.convertToRomans());
    }

    @Test
    public void convertToRomans_should_returnString_forNumber() throws IllegalRangeException {
        // setup
        converter.setIntegerNumber(1514);

        // goal
        String desiredResult = "MDXIV";

        // actual
        String actual = converter.convertToRomans();

        // assertion
        assertEquals(actual, desiredResult);

    }

}