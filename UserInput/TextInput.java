
public class TextInput {
	protected StringBuilder Builder = new StringBuilder();
    
    public void add(char input)
    {
        Builder.append(input);
    }

    public String getValue()
    {
        return Builder.toString();
    }
}
