import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void testThatGreeterReturnsCorrectResultsWithEmptyString() {
        assertEquals("Hello, World!", new Greeter().getGreeting(""));
    }

    @Test
    public void testThatGreeterReturnsCorrectResultsWithNullString() {
        assertEquals("Hello, World!", new Greeter().getGreeting(null));
    }

    @Test
    public void testThatGreeterReturnsCorrectResultsWithCustomString() {
        assertEquals("Hello, Bob!", new Greeter().getGreeting("Bob"));
    }

}
