package ro.ulbs.paradigme.lab7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NewIntCalculatorTest {

    @Test
    void testAddPositive() {
        NewIntCalculator calc = new NewIntCalculator(10);
        int result = (Integer) calc.add(5).result();
        assertEquals(15, result);
    }

    @Test
    void testAddNegatives() {
        NewIntCalculator calc = new NewIntCalculator(-10);
        int result = (Integer) calc.add(-5).result();
        assertEquals(-15, result);
    }

    @Test
    void testSubtractPositives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        int result = (Integer) calc.subtract(3).result();
        assertEquals(7, result);
    }

    @Test
    void testSubtractNegatives() {
        NewIntCalculator calc = new NewIntCalculator(-10);
        int result = (Integer) calc.subtract(-5).result();
        assertEquals(-5, result);
    }

    @Test
    void testMultiplyPositives() {
        NewIntCalculator calc = new NewIntCalculator(3);
        int result = (Integer) calc.multiply(4).result();
        assertEquals(12, result);
    }

    @Test
    void testMultiplyNegatives() {
        NewIntCalculator calc = new NewIntCalculator(-3);
        int result = (Integer) calc.multiply(-4).result();
        assertEquals(12, result);
    }

    @Test
    void testMultiplyBy0() {
        NewIntCalculator calc = new NewIntCalculator(5);
        int result = (Integer) calc.multiply(0).result();
        assertEquals(0, result);
    }

    @Test
    void testDividePositives() {
        NewIntCalculator calc = new NewIntCalculator(10);
        int result = (Integer) calc.divide(2).result();
        assertEquals(5, result);
    }

    @Test
    void testDivideNegatives() {
        NewIntCalculator calc = new NewIntCalculator(-10);
        int result = (Integer) calc.divide(-2).result();
        assertEquals(5, result);
    }

    @Test
    void testDivideBy0() {
        NewIntCalculator calc = new NewIntCalculator(10);
        assertThrows(ArithmeticException.class, () -> calc.divide(0));
    }
}