package storage;

import java.util.ArrayList;
import java.util.List;

/**
 * Persists sensor data.
 */
public class DataRepository {

    private static DataRepository instance;
    private final List<SensorData> records = new ArrayList<>();

    private DataRepository() {}

    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }

    public void addData(SensorData dataRecord){
        records.add(dataRecord);
    }

    public List<SensorData> getRecords() {
        return new ArrayList<>(records);
    }
}


