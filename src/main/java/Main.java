import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Kalkulator BMI ===");
        System.out.println("Podaj swoją wagę w kilogramach: ");
        double weight = getPositiveDoubleFromUser();
        System.out.println("Podaj swój wzrost w metrach: ");
        double height = getPositiveDoubleFromUser();

        BMICalculator calculator = new BMICalculator(height, weight);
        System.out.println(
                String.format("Twoje BMI to: %.2f. Wynik: %s", calculator.calculate(),
                              calculator.interpret().toString()));
    }

    private static double getPositiveDoubleFromUser() {
        String userInput = "";
        while (true) {
            userInput = scanner.nextLine();
            try {
                double input = Double.parseDouble(userInput);
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Podałeś niedodatnią liczbę, spróbuj ponownie: ");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Nie podałeś poprawnej liczby, spróbuj ponownie: ");
            }
        }
    }
}
