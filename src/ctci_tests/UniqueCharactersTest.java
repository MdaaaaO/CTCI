package ctci_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ctci_arrays_strings.UniqueCharacters;

public class UniqueCharactersTest {

	UniqueCharacters uc = new UniqueCharacters();
	boolean checker;
	
	@Test
	public void testIsUniqueCharsNonSpecific() {
		checker = uc.isUniqueCharsNonSpecific("abc");
		assertEquals(checker, true);

		checker = uc.isUniqueCharsNonSpecific("abcABC");
		assertEquals(checker, true);

		checker = uc.isUniqueCharsNonSpecific("aAbBcC");
		assertEquals(checker, true);

		checker = uc.isUniqueCharsNonSpecific("aAbBcC");
		assertEquals(checker, true);
		
		checker = uc.isUniqueCharsNonSpecific("aAbBcC1!2@3#");
		assertEquals(checker, true);
		
		checker = uc.isUniqueCharsNonSpecific("abca");
		assertEquals(checker, false);
	
		checker = uc.isUniqueCharsNonSpecific("abcABCa");
		assertEquals(checker, false);
		
		checker = uc.isUniqueCharsNonSpecific("aAbBcCA");
		assertEquals(checker, false);
		
		checker = uc.isUniqueCharsNonSpecific("aAbBcC1!2@3#!");
		assertEquals(checker, false);
	}

	@Test
	public void testIsUniqueCharsASCII() {
		checker = uc.isUniqueCharsASCII("abc");
		assertEquals(checker, true);

		checker = uc.isUniqueCharsASCII("abcABC");
		assertEquals(checker, true);

		checker = uc.isUniqueCharsASCII("aAbBcC");
		assertEquals(checker, true);

		checker = uc.isUniqueCharsASCII("aAbBcC");
		assertEquals(checker, true);
		
		checker = uc.isUniqueCharsASCII("aAbBcC1!2@3#");
		assertEquals(checker, true);
		
		checker = uc.isUniqueCharsASCII("abca");
		assertEquals(checker, false);
	
		checker = uc.isUniqueCharsASCII("abcABCa");
		assertEquals(checker, false);
		
		checker = uc.isUniqueCharsASCII("aAbBcCA");
		assertEquals(checker, false);
		
		checker = uc.isUniqueCharsASCII("aAbBcC1!2@3#!");
		assertEquals(checker, false);
	}
}
