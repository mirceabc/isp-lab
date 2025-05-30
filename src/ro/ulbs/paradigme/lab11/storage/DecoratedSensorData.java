package ro.ulbs.paradigme.lab11.storage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DecoratedSensorData implements ISensorData {
    private final ISensorData decorated;

    public DecoratedSensorData(ISensorData decorated) {
        this.decorated = decorated;
    }

    @Override
    public int getStepsCount() {
        return 20 + decorated.getStepsCount();
    }

    @Override
    public long getTimestamp() {
        return decorated.getTimestamp();
    }

    @Override
    public String toString() {
        Date date = new Date(getTimestamp());
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        return "DecoratedSensorData{stepsCount=" + getStepsCount() +
                ", time=" + sdf.format(date) + "}";
    }
}
