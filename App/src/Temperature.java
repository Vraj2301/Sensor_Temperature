public class Temperature {

    private Sensor sensor;
    private Location location;
    private double tempValue;
    private SensorTemperatureTable sensorTemperatureTable;
    private SensorLocationTable sensorLocationTable;

    public Temperature(Sensor sensor, Location location) {
        this.sensor = sensor;
        this.location = location;
        sensorTemperatureTable = SensorTemperatureTable.getInstance();
        sensorLocationTable = SensorLocationTable.getInstance();
    }

    public void storeSensorTemperaturePair(Sensor sensor, Temperature temperature) {
        sensorTemperatureTable.storeSensorTemperaturePair(sensor, temperature);
    }

    public void storeSensorLocationPair(Sensor sensor, Location location) {
        sensorLocationTable.storeSensorLocationPair(sensor, location);
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getTempValue() {
        return tempValue;
    }

    public void setTempValue(double tempValue) {
        this.tempValue = tempValue;
    }
}
