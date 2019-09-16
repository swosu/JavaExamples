public class simplePrimeFactorization {

  public static void main(String[] args) {
    sayHello();

    int firstPrime = 24;
    int remainder = firstPrime;
    int nextFactor = 0;
    int sumOfFactors = 0;

    printNumberWeAreChecking(firstPrime);


    System.out.printf("our initial remainder is %d.\n",
    remainder);
    // 8 is 2 * 2 * 2.
    // so the sum of the factors is 6.

    boolean remainderIsPrime = false;
    while(!remainderIsPrime)
    {


      System.out.println("Start of algorithm.");
      // is the remainder prime? if so, we quit.
      remainderIsPrime = checkRemainder(remainder);
      if(remainderIsPrime)
      {
        System.out.printf("remainder is prime.\n");
        sumOfFactors += remainder;
        System.out.printf("our final sum of factors is %d.\n",
        sumOfFactors);
      }
      else
      {
        System.out.printf("remainder is not prime.\n");
        nextFactor = findNextFactor(remainder);
        System.out.printf("our next factor is %d.\n", nextFactor);
        sumOfFactors += nextFactor;
        System.out.printf("our current sum of factors is %d.\n",
        sumOfFactors);
        remainder = remainder / nextFactor;
        System.out.printf("our next remainder is %d.\n",
        remainder);
      }
    }

    System.out.println("Thank you and good night.");
  }

  private static void sayHello ()
  {
      System.out.println("Hello, World");
  }

  private static void printNumberWeAreChecking (int firstPrime)
  {
      System.out.printf("our first prime is %d.\n", firstPrime);
  }


  private static boolean checkRemainder(int remainder)
  {
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

  private static int findNextFactor(int remainder)
  {
    int nextFactor = 0;
    for(int checkValue = 2; checkValue < remainder; checkValue++)
    {
      if(0 == (remainder%checkValue))
      {
        nextFactor = checkValue;
        break;
      }

    }
    return nextFactor;
  }
}
