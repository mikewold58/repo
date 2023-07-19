package demo;

import static org.junit.Assert.*;

import org.junit.Test;

/*these imports are the framework for JUnit testing and the assertEquals functionality*/

public class PrimeNumberMethodTest {
	
	
	@Test
	public void testMethodTest1() {
	boolean prime=PrimeNumberMethod.isPrime(8);
	assertEquals(false,prime);
	/*this test invokes the isPrime public method from the PrimeNumberMethod class and tests it*/
	/*8 is not a prime number so the value of boolean prime should be false if the isPrime method is running successfully*/
	}
	
	@Test
	public void testMethodTest2() {
	boolean prime=PrimeNumberMethod.isPrime(2);
	assertEquals(true,prime);
	/*this tests runs successfully since 2 is a prime number and 2 is greater than one so the method will actually run*/
	}
	
	@Test
	public void testMethodTest3() {
	boolean prime=PrimeNumberMethod.isPrime(-2);
	assertEquals(false,prime);
	/*this test fails since isPrime inaccurately returns a true value for negative numbers since the method cannot run with a negative value*/
	}
	
	
	@Test
	public void testMethodTest4() {
	boolean prime=PrimeNumberMethod.isPrime(1);
	assertEquals(false,prime);
	/*this test fails even though 1 is not a prime number for the same reason as the negative input*/
	/* the isPrime method works successfully for all values that are greater than 1 since it will actually run*/
	}
}
