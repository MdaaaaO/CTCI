package ctci_arrays_strings;

/**
 * Algorithms to determine if a string has all unique characters.
 *
 * @author mdaaaa
 *
 */
public class UniqueCharacters {

  public UniqueCharacters() {}

  /**
   * Checks all characters of a string whether they exists twice.
   * @param str
   * @return boolean
   */
  public boolean isUniqueCharsNonSpecific(String str) {
    for (int choose = 0; choose < str.length(); choose++) {
      char choosenCharacter = str.charAt(choose);
      for (int check = choose+1; check < str.length(); check++) {
        // here we can use char instead of int
        int choosenCheck = str.charAt(check);
        if(choosenCharacter == choosenCheck) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Checks all characters of a ASCII string whether they exists.
   * @param ascii_string
   * @return boolean
   */
  public boolean isUniqueCharsASCII(String ascii_string) {
    if (ascii_string.length() > 128) {
      return false;
    }
    boolean[] ascii_table = new boolean[128];
    for (int choose = 0; choose <ascii_string.length(); choose++) {
      int choosenCharacter = ascii_string.charAt(choose);
      // Check if current character was used before
      if (ascii_table[choosenCharacter] == true) {
        return false;
      }
      // Mark current character as used in our table
      ascii_table[choosenCharacter] = true;
    }
    return true;
  }
}
