import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ericm on 7/27/2017.
 */
public class PrimeFinderTest {
    @Test
    public void findPrime1() throws Exception {
        PrimeFinder primeFinder = new PrimeFinder();
        int expected = 2;
        int actual = primeFinder.findPrime(1);
        assertEquals("findPrime1 failed", expected, actual);
    }
    @Test
    public void findPrime2() throws Exception {
        PrimeFinder primeFinder = new PrimeFinder();
        int expected = 3;
        int actual = primeFinder.findPrime(2);
        assertEquals("findPrime1 failed", expected, actual);
    }
    @Test
    public void findPrime4() throws Exception {
        PrimeFinder primeFinder = new PrimeFinder();
        int expected = 7;
        int actual = primeFinder.findPrime(4);
        assertEquals("findPrime1 failed", expected, actual);
    }
    @Test
    public void findPrime10() throws Exception {
        PrimeFinder primeFinder = new PrimeFinder();
        int expected = 29;
        int actual = primeFinder.findPrime(10);
        assertEquals("findPrime1 failed", expected, actual);
    }

}