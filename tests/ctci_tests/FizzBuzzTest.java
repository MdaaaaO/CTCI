package ctci_tests;

import org.junit.*;
import ctci_fizzbuzz.FizzBuzz;
import static org.junit.Assert.*;

/**
 *
 * @author mdaaaa
 *
 */
public class FizzBuzzTest {

  FizzBuzz fizz = new FizzBuzz(15);
  String[] output = fizz.getFizzBuzzed();

  String fizzString = "Fizz";
  String buzzString = "Buzz";
  String fizzBuzzString = "FizzBuzz";

  @Test
  public void testFizzes() {
    assertEquals(fizzString, output[3-1]);
    assertEquals(fizzString, output[6-1]);
    assertEquals(fizzString, output[9-1]);
    assertEquals(fizzString, output[12-1]);
  }

  @Test
  public void testBuzzes() {
    assertEquals(buzzString, output[5-1]);
    assertEquals(buzzString, output[10-1]);
  }

  @Test
  public void testFizzBuzzes() {
    assertEquals(fizzBuzzString, output[15-1]);
  }
}
