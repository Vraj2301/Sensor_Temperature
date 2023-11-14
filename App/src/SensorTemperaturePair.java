public class SensorTemperaturePair {
    private Pair<Sensor,Temperature> sensorTemperaturePair;
    private SensorTemperatureTable sensorTemperatureTable;

    public SensorTemperaturePair(Sensor sensor, Temperature Temperature) {
        sensorTemperaturePair= new Pair<>(sensor,Temperature);
        sensorTemperatureTable = SensorTemperatureTable.getInstance();
        storeSensorTemperaturePair(sensor, Temperature);
    }

    public void storeSensorTemperaturePair(Sensor sensor, Temperature Temperature) {
        sensorTemperatureTable.storeSensorTemperaturePair(sensor, Temperature);
    }

}