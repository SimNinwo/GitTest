
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        int n = input.nextInt();
        
        if (n <=1) {
            System.out.println( n + " is a prime number");  
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
            }
            else {
                System.out.println(n + " is a prime number");
            }
        }
    }
}