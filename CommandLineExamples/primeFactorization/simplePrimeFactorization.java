public class simplePrimeFactorization {

  public static void main(String[] args) {
    // Prints "Hello, World" to the terminal window.
    System.out.println("Hello, World");

    int firstPrime = 8;
    System.out.printf("our first prime is %d.\n", firstPrime);
    int remainder = firstPrime;
    System.out.printf("our initial remainder is %d.\n", remainder);
    // 8 is 2 * 2 * 2.
    // so the sum of the factors is 6.

    System.out.println("Start of algorithm.");
    // is the remainder prime? if so, we quit.
    boolean remainderIsPrime = checkRemainder(remainder);
    if(remainderIsPrime)
    {
        System.out.printf("remainder is prime.\n");
    }
    else
    {
      System.out.printf("remainder is not prime.\n");
    }
    
    System.out.println("Thank you and good night.");
  }

  private static boolean checkRemainder(int remainder){
    System.out.println("Hello inside method.");
    boolean remainderIsPrime = true;
    for(int checkValue = 2; checkValue < remainder; checkValue++)
    {
      if(0 == (remainder%checkValue))
      {
        remainderIsPrime = false;
      }
    }
    return remainderIsPrime;
  }

}
