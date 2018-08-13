package pl.sda.tests;

import org.assertj.core.api.Assertions;

import org.junit.Test;
import pl.sda.tests.calculator.Calculator;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void firstCalcTest() {
        Assertions.assertThat(calc.add(5, 5))
                .isNotEqualTo(11)
                .isLessThan(11)
                .isGreaterThan(9)
                .isBetween(0, 100)
                .isEqualTo(10);

    }

}
