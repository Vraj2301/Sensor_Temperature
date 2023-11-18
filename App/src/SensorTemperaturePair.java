public class SensorTemperaturePair {
    private Pair<Sensor,Temperature> sensorTemperaturePair;

    public SensorTemperaturePair(Sensor sensor, Temperature Temperature) {
        sensorTemperaturePair= new Pair<>(sensor,Temperature);
        
    }

    public Sensor getSensor() {
        return sensorTemperaturePair.getFirst();
    }

    public Temperature getTemperature() {
        return sensorTemperaturePair.getSecond();
    }
}