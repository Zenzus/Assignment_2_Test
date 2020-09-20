package string_utility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class String_utilityTest {
    private String_utility test;

    @BeforeEach
    public void setup() {
        test = new String_utility();
    }

    @Test
    public void reverse_Test() {
        String input = "aBc";
        assertEquals("cBa", test.reverse(input));
    }

    @Test
    public void capitalize_Test() {
        String input = "aBc";
        assertEquals("ABC", test.capitalize(input));
    }

    @Test
    public void lowercase_Test() {
        String input = "aBc";
        assertEquals("abc", test.lowercase(input));
    }

}