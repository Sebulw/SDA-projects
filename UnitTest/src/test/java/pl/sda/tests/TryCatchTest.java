package pl.sda.tests;

import org.junit.Test;

public class TryCatchTest {

    @Test
    public Double divide(Double a, Double b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("Incorrect value");
        }
        return a/b;
    }
}
