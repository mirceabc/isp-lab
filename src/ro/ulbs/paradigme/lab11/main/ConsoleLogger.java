package ro.ulbs.paradigme.lab11.main;

import java.util.Observer;
import java.util.Observable;

public class ConsoleLogger implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ConsoleLogger: New data received: " + arg);
    }
}
