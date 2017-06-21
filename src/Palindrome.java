
public class Palindrome {
	public static boolean IsPalindrome(String word){
		if(word.length() == 0){
			return false;
		}
		String first = word.substring(0, word.length() / 2);
		char [] arr = word.toCharArray();
        char[] revArray = new char[word.length()];
        int i=0;
        for (int l=word.length()-1 ;l >= 0 ; l--)
        {
        	revArray[i] =arr[l];
        	i++;
        }
        String temp = new String(revArray);
        String second = temp.substring(0, temp.length() / 2);
        return first.equalsIgnoreCase(second);
	}
}
