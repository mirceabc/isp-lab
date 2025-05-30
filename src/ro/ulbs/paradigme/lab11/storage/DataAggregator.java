package ro.ulbs.paradigme.lab11.storage;


import ro.ulbs.paradigme.lab11.dataprocessing.StepCountStrategy;
import java.util.Observer;
import java.util.Observable;

public class DataAggregator implements Observer {
    private final StepCountStrategy strategy;

    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof ISensorData) {
            strategy.consumeMessage((ISensorData) arg);
        }
    }

    public String getResults() {
        return "Total steps: " + strategy.getTotalSteps();
    }
}
