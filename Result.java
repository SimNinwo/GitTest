/** if number is Positive or Negative
Author: Simeon O.
Created: 13'05'19 4.55PM
*/

import java.util.Scanner; // program uses class Scanner

public class Result {
// main method begins execution of main method
    public static void main(String[] args) {
//
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number: ");
    int number = input.nextInt();

    if (number >= 5) {
        System.out.println("Positive");
    }
    else {
        System.out.println("Negative");
    }
    } // end main method
} // end class Result