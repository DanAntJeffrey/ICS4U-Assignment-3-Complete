/*
* The Recursion program that prints tribonacci sequence numbers
*
* @author  D Jeffrey
* @version 1.0
* @since   2025-12-15
*/


import java.util.Scanner;


/**
* Tribonacci class that holds all necessary functions
*/
public final class Tribonacci {


   /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
   private Tribonacci() {
       throw new IllegalStateException("Cannot be instantiated");
   }


   /**
    * This method uses recursion to calculate the following tribonacci term.
    *
    * @param counter counter of how many tribonacci terms to calculate
    * @param termNumberMinusThree represents T(n-3)
    * @param termNumberMinusTwo represents T(n-2)
    * @param termNumberMinusOne represents T(n-1)
    */
   static void tribonacciCalc(int counter, int termNumberMinusThree, int termNumberMinusTwo, int termNumberMinusOne) {
        // if statement to only generate terms when counter is still greater than 0
        if (counter > 0) {
            // calculate the next tribonacci number, and then use that number and two before it to calculate the tribonacci number after that
            int nextTerm = termNumberMinusOne
            + termNumberMinusTwo
            + termNumberMinusThree;
            System.out.print(nextTerm + " ");

            tribonacciCalc(counter - 1, termNumberMinusTwo,
            termNumberMinusOne, nextTerm);
        }
   }

    /**
    * This is the main function to get user input of number of terms to generate,
    * print out base cases and call tribonacciCalc() to generate terms.
    *
    * @param args no args will be used
    */
   public static void main(String[] args) {
       while (true) {
           try {
                // input
               Scanner scanner = new Scanner(System.in);
               System.out.print("Enter a positive integer: ");
               String counterAsString = scanner.nextLine();
               int counter = Integer.parseInt(counterAsString);
               if (counter <= 0) {
                   System.out.println("That was not a positive integer.");
               } else {
                    // print base cases
                   if (counter == 1) {
                       System.out.print("Tribonacci Sequence for " + counter + " terms:\n");
                       System.out.println(0);
                   } else if (counter == 2) {
                       System.out.print("Tribonacci Sequence for " + counter + " terms:\n");
                       System.out.println(0 + " " + 0);
                   } else if (counter == 3) {
                       System.out.print("Tribonacci Sequence for " + counter + " terms:\n");
                       System.out.println(0 + " " + 0 + " " + 1);
                   } else {
                       // call for tribonacciCalc() if counter > 3
                       System.out.print("Tribonacci Sequence for " + counter + " terms:\n");
                       System.out.print(0 + " " + 0 + " " + 1 + " ");
                       tribonacciCalc(counter - 3, 0, 0, 1);
                       System.out.println();
                   }
               }
           } catch (NumberFormatException e) {
               System.out.printf("The error was: %s.%n", e.getMessage());
           } finally {
               System.out.println("\nDone.\n");
           }
        }
    }
}



