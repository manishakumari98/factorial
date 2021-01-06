import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCheckerTest {
    @Test
    void shouldReturnExceptionWhenNumberIsNegative() {
        FactorialChecker factorialChecker = new FactorialChecker(-1);
        assertThrows(IllegalArgumentException.class, factorialChecker::calculator);
    }

    @Test
    void factorialOfZeroShouldBeOne() {
        FactorialChecker factorialChecker = new FactorialChecker(0);
        int factorial = factorialChecker.calculator();
        assertEquals(1,factorial);
    }

    @Test
    void factorialOfOneShouldBeOne() {
        FactorialChecker factorialChecker = new FactorialChecker(1);
        int factorial = factorialChecker.calculator();

        assertEquals(1,factorial);
    }

    @Test
    void factorialOfTwoShouldBeTwo() {
        FactorialChecker factorialChecker = new FactorialChecker(2);
        int factorial = factorialChecker.calculator();

        assertEquals(2,factorial);
    }

    @Test
    void factorialOfThreeShouldBeSix() {
        FactorialChecker factorialChecker = new FactorialChecker(3);
        int factorial = factorialChecker.calculator();

        assertEquals(6,factorial);
    }

    @Test
    void factorialOfFourShouldBeTwentyFour() {
        FactorialChecker factorialChecker = new FactorialChecker(4);
        int factorial = factorialChecker.calculator();

        assertEquals(24,factorial);
    }
}
