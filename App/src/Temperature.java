public class Temperature {

    private Sensor sensor;
    private Location location;
    private double tempValue;

    public Temperature() {

    }

    public void storeSensorTemperaturePair(Sensor sensor, Temperature temperature) {

    }

    public void storeSensorLocationPair(Sensor sensor, Location location) {

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
