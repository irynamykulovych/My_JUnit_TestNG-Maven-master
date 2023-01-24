package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        int expectedResult = 15;
        assertEquals( actualResult, expectedResult, "10 + 5 must be 15");
    }

    @Test
    public void testSubtractTwoPositiveValues() {
        int actualResult = calc.subtract(10, 5);
        int expectedResult = 5;
        assertEquals( actualResult, expectedResult, "10 - 5 must be 5");
    }
    @Test
    public void testMultiplyTwoPositiveValues() {
        int actualResult = calc.multiply(10, 5);
        int expectedResult = 50;
        assertEquals( actualResult, expectedResult, "10 * 5 must be 50");
    }

    @Test
    public void testDivisionTwoPositiveValues() {
        int actualResult = calc.division(10, 5);
        int expectedResult = 2;
        assertEquals( actualResult, expectedResult, "10 / 5 must be 2");
    }
    @Test
    public void testExtentPositiveValues() {
        int actualResult = calc.extent(10);
        int expectedResult = 100;
        assertEquals( actualResult, expectedResult, "10*10 must be 100");
    }
    }}
    @Test
    public void testExtentNegativeValues() {
        int actualResult = calc.extent(-10);
        int expectedResult = 100;
        assertEquals( actualResult, expectedResult, "-10*-10 must be 100");
    }


    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)


}
