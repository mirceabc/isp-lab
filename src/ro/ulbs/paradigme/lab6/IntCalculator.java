package ro.ulbs.paradigme.lab6;

public class IntCalculator {
    private int state;

    public IntCalculator(int initial) {
        this.state = initial;
    }

    public IntCalculator add(int value) {
        state += value;
        return this;
    }

    public IntCalculator subtract(int value) {
        state -= value;
        return this;
    }

    public IntCalculator multiply(int value) {
        state *= value;
        return this;
    }

    public int result() {
        return state;
    }

    public IntCalculator clear() {
        state = 0;
        return this;
    }
}
