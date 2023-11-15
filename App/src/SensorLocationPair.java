public class SensorLocationPair {
    private Pair<Sensor,Location> sensorLocationPair;

    public SensorLocationPair(Sensor sensor, Location location) {
        sensorLocationPair= new Pair<>(sensor,location);
    }

    public Sensor getSensor() {
        return sensorLocationPair.first;
    }

    public Location getLocation() {
        return sensorLocationPair.second;
    }
}
