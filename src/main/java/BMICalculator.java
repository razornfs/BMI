import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class BMICalculator implements Calculator<Double> {
    private double bmi;
    private static final SortedMap<Double, BMIResult> bmiResults = new TreeMap<>();

    static {
        bmiResults.put(18.5, BMIResult.UNDERWEIGHT);
        bmiResults.put(25.0, BMIResult.CORRECT_WEIGHT);
        bmiResults.put(Double.POSITIVE_INFINITY, BMIResult.OVERWEIGHT);
    }

    public BMICalculator(double height, double weight) {
        bmi = weight / (height * height);
    }

    public Double calculate() {
        return bmi;
    }

    public String interpret() {
        for (Map.Entry<Double, BMIResult> entry : bmiResults.entrySet()) {
            if (bmi < entry.getKey()) {
                return entry.getValue().toString();
            }
        }
        throw new IllegalArgumentException("Should never happen");
    }
}
