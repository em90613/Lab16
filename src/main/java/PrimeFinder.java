/**
 * Created by ericm on 7/27/2017.
 */
public class PrimeFinder {
    public int findPrime(int userNum) {
        int candidate, count;
        for(candidate = 2, count = 0; count < userNum; ++candidate) {
            if (isPrime(candidate)) {
                ++count;
            }
        }
        // The candidate has been incremented once after the count reached n
        return candidate-1;
    }

    private boolean isPrime(int userNum) {
        boolean isPrime = true;

        for (int i = 2; i <= userNum / 2; i++) {
            if (userNum % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
