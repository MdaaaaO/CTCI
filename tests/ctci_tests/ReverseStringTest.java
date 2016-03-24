package ctci_tests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import ctci_arrays_strings.ReverseString;

public class ReverseStringTest {
	
	ReverseString rv = new ReverseString();
	String str;

	@Test
	public void reverseString_RegularString_ReversedCorrect() {
		str = rv.reverseString("ABCD");
		assertThat(str, is("DCBA"));
		str = rv.reverseString(str);
		assertThat(str, is("ABCD"));
	}
	
	@Test
	public void reverseString_StringWithNewLine_ReversedCorrect() {
		str = rv.reverseString("ABCD\n");
		assertThat(str, is("DCBA\n"));
		str = rv.reverseString(str);
		assertThat(str, is("ABCD\n"));
	}
	
	@Test
	public void reverseString_StringWithSigns_ReversedCorrect() {
		str = rv.reverseString("\n\nABCD");
		assertThat(str, is("DCBA\n\n"));
		str = rv.reverseString("  !   ");
		assertThat(str, is("   !  "));
	}
	
	@Test
	public void reverseString_StringWithNull_ReversedCorrect() {
		str = rv.reverseString("ABCD\0");
		assertThat(str, is("DCBA\n"));
		str = rv.reverseString("DCBA\0");
		assertThat(str, is("ABCD\n"));
	}
}
