package ro.ulbs.paradigme.lab11.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class DataRepository extends Observable {
    private static DataRepository instance;
    private final List<ISensorData> records = new ArrayList<>();

    private DataRepository() {}

    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }

    public void addData(ISensorData data) {
        records.add(data);
        setChanged();
        notifyObservers(data);
    }

    public List<ISensorData> getRecords() {
        return new ArrayList<>(records);
    }
}


