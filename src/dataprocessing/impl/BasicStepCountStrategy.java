package dataprocessing.impl;

import dataprocessing.StepCountStrategy;
import storage.SensorData;

public class BasicStepCountStrategy implements StepCountStrategy {
    private int totalSteps = 0;

    @Override
    public void consumeMessage(SensorData data) {
        totalSteps += data.getStepsCount();
    }

    @Override
    public int getTotalSteps() {
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "Basic";
    }
}