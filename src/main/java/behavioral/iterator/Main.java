package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        StationList stations = new StationList();
        stations.addStation(new RadioStation(89));
        stations.addStation(new RadioStation(101));
        stations.addStation(new RadioStation(102));
        stations.addStation(new RadioStation(103.2));

        while (stations.valid()) {
            System.out.println(stations.current().getFrequency());
            stations.next();
        }
    }
}
