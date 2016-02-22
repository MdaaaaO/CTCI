package ctci_arrays_strings;

/**
 * Reverses a String.
 * Deals with 0 and \n
 * 
 * Date: Feb. 22 2016
 * @author mdaaaa
 * 
 */
public class ReverseString {
	
	public String reverseString(String str) {
		
		char[] reversed = new char[str.length()];
		int str_len = str.length();
		
		/*
		 * Dealing with '\n' character at the end of the String:
		 *     1. Reduce length of the String
		 *     2. Set '\n' at end of character array
		 */
		if (str.charAt(str_len-1) == '\n' ||
				str.charAt(str_len-1) == 0) {
			str_len -= 1;
			reversed[str_len] = '\n';
		}
		
		/*
		 * Iterate over the input string and fill the character array in 
		 * reversed order.
		 */
		for (int i = 0; i < str_len; i++) {
			reversed[str_len-1-i] = str.charAt(i);
		}
		
		return str = new String(reversed);
	}

}
