package com.hillel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */

public class CalculatorTest {
    private final Calculator calculator = new Calculator();
    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0), 0.001);
    }
    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.001);
    }
    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(1.0, 0.0);
    }
}
// ОНО СРАБОТАЛО!!