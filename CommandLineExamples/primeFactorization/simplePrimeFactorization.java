public class simplePrimeFactorization {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

        int firstPrime = 8;
        int remainder = firstPrime;
        // 8 is 2 * 2 * 2.
        // so the sum of the factors is 6.
        boolean remainderIsPrime = false;

        while(!remainderIsPrime)
        {
          remainderIsPrime = checkRemainder(remainder);
          System.out.println("Hello inside of loop.");

        }
        System.out.println("Thank you and good night.");
    }

    private static boolean checkRemainder(int remainder){
       System.out.println("Hello inside method.");
       boolean remainderIsPrime = true;
       return remainderIsPrime;
   }

}
