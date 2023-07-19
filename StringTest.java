package demo;

import static org.junit.Assert.*;
import java.lang.String;
import org.junit.Test;

public class StringTest {
	
/*test the methods length, charAt, substring, and indexOf in the java.lang.String class.*/
	
	@Test
	public void testLength() {
		String test = "Hello World!";
		int length=test.length();
		assertEquals(12,length);
		/*this tests the length() method by checking if the length we expect to get is accurately returned by the method*/
	}
	@Test
	public void testCharAt() {
		String test = "Hello World!";
		char t=test.charAt(0);
		assertEquals('H',t);
		/*this tests the charAt() method by checking if the character we expect to get at that index is accurately returned by the method*/
	}
	@Test
    public void testSubString() {
    	String test="Hello World!";
    	String test2= test.substring(6);
    	assertEquals("World!",test2);
    	/*this tests the subString() method by checking if the sub string we expect to get when starting at that index of 6 is accurately returned by the method*/
    }
	@Test
	public void testIndexOf() {
		String test= "Hello World!";
		int test1= test.indexOf('o');
		assertEquals(4,test1);
		/*this tests the indexOf() method by checking if the index we expect to be correlated with the first instance of the character 'o' is accurately returned by the method*/
	}
}
