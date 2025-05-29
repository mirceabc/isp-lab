package ro.ulbs.paradigme.lab6;

public class DoubleCalculator extends ACalculator {
    public DoubleCalculator(double initial) {
        this.state = initial;
    }

    public DoubleCalculator add(double value) {
        state = (Double) state + value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        state = (Double) state - value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        state = (Double) state * value;
        return this;
    }

    @Override
    protected void init() {
        state = 0.0;
    }
}
