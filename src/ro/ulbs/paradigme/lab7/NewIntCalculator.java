package ro.ulbs.paradigme.lab7;

import ro.ulbs.paradigme.lab6.ACalculator;

public class NewIntCalculator extends ACalculator {
    public NewIntCalculator(int initial) {
        this.state = initial;
    }

    public NewIntCalculator add(int value) {
        state = (Integer) state + value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        state = (Integer) state - value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        state = (Integer) state * value;
        return this;
    }

    public NewIntCalculator divide(int value) {
        if (value == 0) throw new ArithmeticException("Division by zero");
        state = (Integer) state / value;
        return this;
    }

    @Override
    protected void init() {
        state = 0;
    }
}
