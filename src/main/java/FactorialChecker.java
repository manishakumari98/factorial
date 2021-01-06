public class FactorialChecker {
    private int number;

    public FactorialChecker(int number) {
        this.number = number;
    }

    public int calculator() throws IllegalArgumentException {
        if (isLessThanZero(number)) {
            throw new IllegalArgumentException("Negative Numbers Not Allowed!");
        }else {
            return calculator(this.number);
        }
    }

    private int calculator(int number){
         if (isEqualToZero(number)) {
            return 1;
        } else {
            return number*calculator(number-1);
        }
    }

    private boolean isLessThanZero(int number) {
        return number < 0;
    }

    private boolean isEqualToZero(int number) {
        return number == 0;
    }
}
