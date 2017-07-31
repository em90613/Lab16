import java.util.Scanner;

/**
 * Created by ericm on 7/27/2017.
 */
public class PrimeFinderApp {
    public static void main(String[] args) {
        PrimeFinder primeFinder = new PrimeFinder();
        Scanner scnr = new Scanner(System.in);
        InputValidator validator = new InputValidator();
        int userNum = 0;

        System.out.println("Let's locate some primes!");

        do{
            System.out.println("Which prime are you looking for?");
            userNum = validator.getValidPositiveInt();

            System.out.println("The prime at index " + userNum + " is " + primeFinder.findPrime(userNum));


            validator.checkForUserContinue("Do you want to find another prime? (y/n)");
        } while(validator.isUserCont());

        System.out.println("Goodbye.");
    }
}
