import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMICalculatorTest {

    private static double delta = 0.01;

    @Test
    public void test_underweight_upper_bound() {
        BMICalculator calculator = new BMICalculator(1.8, 59);
        assertEquals(18.2, calculator.calculate(), delta);
        assertEquals(BMIResult.UNDERWEIGHT.toString(), calculator.interpret());
    }

    @Test
    public void test_normal_weight_lower_bound() {
        BMICalculator calculator = new BMICalculator(1.8, 60);
        assertEquals(18.51, calculator.calculate(), delta);
        assertEquals(BMIResult.CORRECT_WEIGHT.toString(), calculator.interpret());
    }

    @Test
    public void test_normal_weight_upper_bound() {
        BMICalculator calculator = new BMICalculator(1.8, 80);
        assertEquals(24.69, calculator.calculate(), delta);
        assertEquals(BMIResult.CORRECT_WEIGHT.toString(), calculator.interpret());
    }

    @Test
    public void test_overweight_lower_bound() {
        BMICalculator calculator = new BMICalculator(1.8, 81);
        assertEquals(25, calculator.calculate(), delta);
        assertEquals(BMIResult.OVERWEIGHT.toString(), calculator.interpret());
    }
}
