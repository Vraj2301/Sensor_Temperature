import java.util.ArrayList;
import java.util.List;

public class SystemTerminal {

    private List<Sensor> deployedSensors;
    private SensorRegistry sensorRegistry;
    private LocationRegistry locationRegistry;
    private SensorLocationTable sensorLocationTable;
    private SensorTemperatureTable sensorTemperatureTable;

    public SystemTerminal() {
        deployedSensors = new ArrayList<Sensor>();
        sensorRegistry = SensorRegistry.getInstance();
        locationRegistry = LocationRegistry.getInstance();
        sensorLocationTable = SensorLocationTable.getInstance();
        sensorTemperatureTable = SensorTemperatureTable.getInstance();
    }

    //TODO: public void DeploySensor(Sensor sensor, Location location) {}
    //TODO: public double ReadTemperature(Location location) {}

    public Boolean isSensorInRegistry(Sensor sensor) {
        boolean sensorInRegistry = false;
        if(sensorRegistry.isSensorInRegistry(sensor) == true) {
            sensorInRegistry = true;
        }
        return sensorInRegistry;
    }

    public Boolean isLocationInRegistry(Location location) {
        boolean locationInRegistry = false;
        if(locationRegistry.isLocationInRegistry(location) == true) {
            locationInRegistry = true;
        }
        return locationInRegistry;
    }

    public Sensor getSensorFromSensorLocationTable(Location location) {
        Sensor sensor = getSensorFromSensorLocationTable(location);
        return sensor;
    }

    public Boolean isLocationInTable(Location location) {
        boolean locationInSensorLocationTable = false;
        if(sensorLocationTable.isLocationInTable(location) == true) {
            locationInSensorLocationTable = true;
        }
        return locationInSensorLocationTable;
    }

    public Boolean isSensorInTable(Sensor sensor) {
        boolean sensorInSensorLocationTable = false;
        if(sensorLocationTable.isSensorInTable(sensor) == true) {
            sensorInSensorLocationTable = true;
        }
        return sensorInSensorLocationTable;
    }

    public Temperature getTemperatureFromSensorTemperatureTable(Sensor sensor) {
        Temperature temperature = getTemperatureFromSensorTemperatureTable(sensor);
        return temperature;
    }


    public List<Sensor> getDeployedSensors() {
        return deployedSensors;
    }

    public void setDeployedSensors(List<Sensor> deployedSensors) {
        this.deployedSensors = deployedSensors;
    }


}