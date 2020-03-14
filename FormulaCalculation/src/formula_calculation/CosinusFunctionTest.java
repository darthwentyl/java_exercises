package formula_calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CosinusFunctionTest {

    @Test
    void test_cos_pi_2() {
        Formula formula = new CosinusFunction();
        double result = formula.calc(Math.PI/2);
        assertEquals(0.0, RoundValue.round(result, 3));
    }

    @Test
    void test_cos_pi() {
        Formula formula = new CosinusFunction();
        double result = formula.calc(Math.PI);
        assertEquals(-1.0, RoundValue.round(result, 3));
    }

    @Test
    void test_cos_3_pi_2() {
        Formula formula = new CosinusFunction();
        double result = formula.calc(3*Math.PI/2);
        assertEquals(0.0, RoundValue.round(result, 3));
    }

    @Test
    void test_cos_pi_4() {
        Formula formula = new CosinusFunction();
        double result = formula.calc(Math.PI/4);
        assertEquals(0.707, RoundValue.round(result, 3));
    }

    @Test
    void test_cos_minus_pi_4() {
        Formula formula = new CosinusFunction();
        double result = formula.calc(-Math.PI/4);
        assertEquals(0.707, RoundValue.round(result, 3));
    }

    @Test
    void test_cos_minus_3_pi_2() {
        Formula formula = new CosinusFunction();
        double result = formula.calc(-3*Math.PI/2);
        assertEquals(0, RoundValue.round(result, 3));
    }
    
}
