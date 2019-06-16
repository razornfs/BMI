import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Kalkulator BMI ===");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją wagę w kilogramach: ");
        double weight = scanner.nextDouble();
        System.out.println("Podaj swój wzrost w metrach: ");
        double height = scanner.nextDouble();

        BMICalculator calculator = new BMICalculator(height, weight);
        System.out.println(
                String.format("Twoje BMI to: %.2f. Wynik: %s", calculator.calculate(), calculator.interpret().toString()));
    }
}
