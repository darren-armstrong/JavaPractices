
public class NumericInput extends TextInput {
	public void add(char input)
    {
        if (Character.isDigit(input))
        {
            Builder.append(input);
        }
    }
}
