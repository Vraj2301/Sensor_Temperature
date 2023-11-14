public class SensorLocationPair {
    private Pair<Sensor,Location> sensorLocationPair;
    private SensorLocationTable sensorLocationTable;

    public SensorLocationPair(Sensor sensor, Location location) {
        sensorLocationPair= new Pair<>(sensor,location);
        sensorLocationTable = SensorLocationTable.getInstance();
        storeSensorLocationPair(sensor, location);
    }

    public void storeSensorLocationPair(Sensor sensor, Location location) {
        sensorLocationTable.storeSensorLocationPair(sensor, location);
    }

}
