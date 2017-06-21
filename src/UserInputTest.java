import static org.junit.Assert.*;

import org.junit.Test;

public class UserInputTest {

	@Test
	public void GetValueFromTextInput()
    {
        TextInput input = new TextInput();
        input.add('1');
        input.add('a');
        input.add('0');

        assertEquals("1a0", input.getValue());
    }

	@Test
    public void GetValueFromNumericInput()
    {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');

        assertEquals("10", input.getValue());
    }

    @Test
    public void GetValueFromTextInputWithWhitespaceChar()
    {
    	TextInput input = new TextInput();
        input.add(' ');

        assertEquals(" ", input.getValue());
    }

    @Test
    public void GetValueFromNumericInputWithWhitespaceChar()
    {
        TextInput input = new NumericInput();
        input.add(' ');

        assertEquals("", input.getValue());
    }

}
