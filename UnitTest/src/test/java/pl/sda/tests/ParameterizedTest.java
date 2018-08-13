package pl.sda.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.sda.tests.calculator.Calculator;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class ParameterizedTest {

    private Calculator calculator;
    private Integer value;
    private Integer value2;

    public ParameterizedTest(Integer value, Integer value2) {
        this.value = value;
        this.value2 = value2;
    }

    @Parameterized.Parameters
    public static Collection getParameters() {
        return Arrays.asList(
                new Integer[][] {
                        {100, 15},
                        {200, 23},
                        {300, 45}
                });
    }

    @Test
    public void addingTest() {
        calculator = new Calculator();

        int result = calculator.add(value, value);
        Assert.assertEquals(value + value, result);
    }

}