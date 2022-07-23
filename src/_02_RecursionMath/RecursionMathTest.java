package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(24, RecursionMath.recursiveMultiplication(4, 6));
        assertEquals(36, RecursionMath.recursiveMultiplication(6, 6));
        assertEquals(144, RecursionMath.recursiveMultiplication(12, 12));
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
        assertEquals(4, RecursionMath.recursiveDivision(24, 6));
        assertEquals(2, RecursionMath.recursiveDivision(12, 6));
        assertEquals(5, RecursionMath.recursiveDivision(60, 12));
        assertEquals(3, RecursionMath.recursiveDivision(27, 9));
    	//fail("Write some tests!");
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(25, RecursionMath.recursivePower(5, 2));
    	assertEquals(125, RecursionMath.recursivePower(5, 3));
    	assertEquals(8, RecursionMath.recursivePower(2, 3));
    	assertEquals(343, RecursionMath.recursivePower(7, 3));
        //fail("Write some tests!");
    }
}
