package ctci_fizzbuzz;

/*
 * Fizz buzz is a group word game for children to teach them about division.
 * Players take turns to count incrementally, replacing any number divisible
 * by three with the word "fizz", and any number divisible by five with the
 * word "buzz".
 *
 * @author mdaaaa
 *
*/

public class FizzBuzz {

  private String[] fizz;

  public FizzBuzz (int length) {
    this.fizz = new String[length];
  }

  public String[] getFizzBuzzed() {
    for (int i = 1; i < this.fizz.length + 1; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        this.fizz[i-1] = "FizzBuzz";
      } else if (i % 5 == 0) {
        this.fizz[i-1] = "Buzz";
      } else if (i % 3 == 0) {
        this.fizz[i-1] = "Fizz";
      } else {
        this.fizz[i-1] = new Integer(i).toString();
      }
    }
    return this.fizz;
  }
}

