public enum BMIResult {
    UNDERWEIGHT("Niedowaga"), CORRECT_WEIGHT("Wartość prawidłowa"), OVERWEIGHT("Nadwaga");

    private String result;

    BMIResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return result;
    }
}
