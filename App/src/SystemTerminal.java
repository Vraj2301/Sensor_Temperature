public class SystemTerminal {

    private SensorRegistry sensorRegistry;
    private LocationRegistry locationRegistry;
    private SensorLocationTable sensorLocationTable;
    private SensorTemperatureTable sensorTemperatureTable;

    public SystemTerminal() {
        sensorRegistry = SensorRegistry.getInstance();
        locationRegistry = LocationRegistry.getInstance();
        sensorLocationTable = SensorLocationTable.getInstance();
        sensorTemperatureTable = SensorTemperatureTable.getInstance();
    }

    public void DeploySensor(Sensor sensor, Location location, Temperature temperature) {
        if (isLocationInTable(location) == false) {
            if (isSensorInTable(sensor) == false) {
                if (isSensorInRegistry(sensor) == true) {
                    if (isLocationInRegistry(location) == true) {
                        SensorLocationPair sensorLocationPair = new SensorLocationPair(sensor, location);
                        temperature.assignRandomValue();
                        SensorTemperaturePair sensorTemperaturePair = new SensorTemperaturePair(sensor, temperature);
                        System.out.println("OK. Deployed Sensor with ID: " + sensor.getsensorID());
                    } else {
                        System.out.println("Location is not in registry");
                    }
                } else {
                    System.out.println("Sensor is not in registry");
                }
            } else {
                System.out.println("Sensor already deployed");
            }
        } else {
            System.out.println("Location already covered");
        }
    }

    public void ReadTemperature(Location location) {
        if (isLocationInTable(location) == true) {
            Sensor s1 = getSensorFromSensorLocationTable(location);
            Temperature temperature = getTemperatureFromSensorTemperatureTable(s1);
            Double tempValue = temperature.getTempValue();
            System.out.println("OK. Temperature Value = " + tempValue.toString());
        } else {
            System.out.println("Location not covered.");
        }
    }

    public Boolean isSensorInRegistry(Sensor sensor) {
        boolean sensorInRegistry = false;
        if (sensorRegistry.isSensorInRegistry(sensor) == true) {
            sensorInRegistry = true;
        }
        return sensorInRegistry;
    }

    public Boolean isLocationInRegistry(Location location) {
        boolean locationInRegistry = false;
        if (locationRegistry.isLocationInRegistry(location) == true) {
            locationInRegistry = true;
        }
        return locationInRegistry;
    }

    public Sensor getSensorFromSensorLocationTable(Location location) {
        Sensor sensor = sensorLocationTable.getSensorFromSensorLocationTable(location);
        return sensor;
    }

    public Boolean isLocationInTable(Location location) {
        boolean locationInSensorLocationTable = false;
        if (sensorLocationTable.isLocationInTable(location) == true) {
            locationInSensorLocationTable = true;
        }
        return locationInSensorLocationTable;
    }

    public Boolean isSensorInTable(Sensor sensor) {
        boolean sensorInSensorLocationTable = false;
        if (sensorLocationTable.isSensorInTable(sensor) == true) {
            sensorInSensorLocationTable = true;
        }
        return sensorInSensorLocationTable;
    }

    public Temperature getTemperatureFromSensorTemperatureTable(Sensor sensor) {
        Temperature temperature = sensorTemperatureTable.getTemperatureFromSensorTemperatureTable(sensor);
        return temperature;
    }
}