package ua.delevi.calc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void addsTwoNumbers() {
        assertEquals(17, Calculator.calculate(12, "+", 5), 1e-9);
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(60, Calculator.calculate(12, "*", 5), 1e-9);
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(7, Calculator.calculate(12, "-", 5), 1e-9);
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(2.4, Calculator.calculate(12, "/", 5), 1e-9);
    }

    @Test
    void dividesByFractionalNumber() {
        assertEquals(5, Calculator.calculate(12, "/", 2.4), 1e-9);
    }

    @Test
    void dividesByNegativeNumber() {
        assertEquals(-5, Calculator.calculate(12, "/", -2.4), 1e-9);
    }

    @Test
    void throwsOnDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.calculate(5, "/", 0));
    }

    @Test
    void throwsOnUnknownOperator() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(5, "s", 5));
    }
}
