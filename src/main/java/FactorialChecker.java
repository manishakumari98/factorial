public class FactorialChecker {
    private int number;

    public FactorialChecker(int number) {
        this.number = number;
    }

    public int calculator() throws IllegalArgumentException {
        if (isLessThanZero()) {
            throw new IllegalArgumentException("Negative Numbers Not Allowed!");
        } else if (isEqualToZero()) {
            return 1;
        } else {
            int ans = 1;
            while (isGreaterThanZero()) {
                ans *= (number--);
            }

            return ans;
        }
    }

    private boolean isLessThanZero() {
        return number < 0;
    }

    private boolean isEqualToZero() {
        return number == 0;
    }

    private boolean isGreaterThanZero() {
        return number > 0;
    }
}
