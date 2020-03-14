package formula_calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpotentialFunctionTest {

    @Test
    void test_e_pow_2() {
        Formula formula = new ExpotentialFunction();
        double result = formula.calc(2.0);
        assertEquals(7.389, RoundValue.round(result, 3));
    }

    @Test
    void test_e_pow_3() {
        Formula formula = new ExpotentialFunction();
        double result = formula.calc(3.0);
        assertEquals(20.086, RoundValue.round(result, 3));
    }

    @Test
    void test_e_pow_4() {
        Formula formula = new ExpotentialFunction();
        double result = formula.calc(4.0);
        assertEquals(54.598, RoundValue.round(result, 3));
    }
}
