package pl.sda.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sda.tests.calculator.Calculator;

public class ExceptionsTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test(expected = ArithmeticException.class)
    public void testDivision() {
        double result = calculator.divide(new Integer(1), new Integer(0));

        Assert.assertNull(result);
    }

}
