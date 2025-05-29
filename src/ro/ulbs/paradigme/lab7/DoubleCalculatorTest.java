package ro.ulbs.paradigme.lab7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleCalculatorTest {

    @Test
    void testAddPositive() {
        DoubleCalculator calc = new DoubleCalculator(10.0);
        double result = (Double) calc.add(5.0).result();
        assertEquals(15.0, result, 0.0001);
    }

    @Test
    void testAddNegatives() {
        DoubleCalculator calc = new DoubleCalculator(-10.0);
        double result = (Double) calc.add(-5.0).result();
        assertEquals(-15.0, result, 0.0001);
    }

    @Test
    void testSubtractPositives() {
        DoubleCalculator calc = new DoubleCalculator(10.0);
        double result = (Double) calc.subtract(3.0).result();
        assertEquals(7.0, result, 0.0001);
    }

    @Test
    void testSubtractNegatives() {
        DoubleCalculator calc = new DoubleCalculator(-10.0);
        double result = (Double) calc.subtract(-5.0).result();
        assertEquals(-5.0, result, 0.0001);
    }

    @Test
    void testMultiplyPositives() {
        DoubleCalculator calc = new DoubleCalculator(3.0);
        double result = (Double) calc.multiply(4.0).result();
        assertEquals(12.0, result, 0.0001);
    }

    @Test
    void testMultiplyNegatives() {
        DoubleCalculator calc = new DoubleCalculator(-3.0);
        double result = (Double) calc.multiply(-4.0).result();
        assertEquals(12.0, result, 0.0001);
    }

    @Test
    void testMultiplyBy0() {
        DoubleCalculator calc = new DoubleCalculator(5.0);
        double result = (Double) calc.multiply(0.0).result();
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    void testDividePositives() {
        DoubleCalculator calc = new DoubleCalculator(10.0);
        double result = (Double) calc.divide(2.0).result();
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testDivideNegatives() {
        DoubleCalculator calc = new DoubleCalculator(-10.0);
        double result = (Double) calc.divide(-2.0).result();
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    void testDivideBy0() {
        DoubleCalculator calc = new DoubleCalculator(10.0);
        assertThrows(ArithmeticException.class, () -> calc.divide(0.0));
    }
}