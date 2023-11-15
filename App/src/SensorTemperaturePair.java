public class SensorTemperaturePair {
    private Pair<Sensor,Temperature> sensorTemperaturePair;

    public SensorTemperaturePair(Sensor sensor, Temperature Temperature) {
        sensorTemperaturePair= new Pair<>(sensor,Temperature);
        
    }

    public Sensor getSensor() {
        return sensorTemperaturePair.first;
    }

    public Temperature getTemperature() {
        return sensorTemperaturePair.second;
    }
}