package behavioral.iterator;

import java.util.LinkedList;

public class StationList {
    private LinkedList<RadioStation> stations = new LinkedList<>();
    private int counter = 0;

    public void addStation(RadioStation station){
        this.stations.add(station);
    }

    public void removeStation(RadioStation stationToRemove){
        double frequency = stationToRemove.getFrequency();
        this.stations.removeIf(station -> station.getFrequency() == frequency);
    }

    public int count(){
        return this.stations.size();
    }

    public RadioStation current(){
        return this.stations.get(this.counter);
    }

    public int key(){
        return this.counter;
    }

    public void next(){
        this.counter++;
    }

    public void rewind(){
        this.counter = 0;
    }

    public boolean valid(){
        return this.stations.size() > this.counter;
    }
}
