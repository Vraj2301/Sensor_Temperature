import java.util.List;

public class SystemTerminal {

    private SensorRegistry sensorRegistry;
    private LocationRegistry locationRegistry;
    private TemperatureRegistry temperatureRegistry;
    private Map map;
    private Read read;

    public SystemTerminal() {
        sensorRegistry = SensorRegistry.getInstance();
        locationRegistry = LocationRegistry.getInstance();
        temperatureRegistry = TemperatureRegistry.getInstance();
        map = Map.getInstance();
        read = Read.getInstance();
    }

    public void DeploySensor(Sensor sensor, Location location, Temperature temperature) {
        if (isLocationInMap(location) == false) {
            if (isSensorInMap(sensor) == false) {
                if (isSensorInRegistry(sensor) == true) {
                    if (isLocationInRegistry(location) == true) {
                        map.makeSensorLocationPair(sensor, location);
                        temperature.assignRandomValue();
                        read.makeSensorTemperaturePair(sensor, temperature);
                        sensor.setisDeployed(true);
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
        if (isLocationInMap(location) == true) {
            Sensor s1 = getSensorFromMap(location);
            Temperature temperature = getTemperatureFromRead(s1);
            Double tempValue = temperature.getTempValue();
            System.out.println("OK. Temperature Value = " + tempValue.toString());
        } else {
            System.out.println("Location not covered.");
        }
    }

    public void returnAllTemperatureAndLocations() {
        for (int i = 0; i < map.getMaplength(); i++) {
            Location l = map.getLocationFromMap(i);
            Sensor s = map.getSensorFromMap(l);
            Temperature t = read.getTemperatureFromRead(s);
            System.out.println(l.toString() + "," + t.toString());

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

    public Sensor getSensorFromMap(Location location) {
        Sensor sensor = map.getSensorFromMap(location);
        return sensor;
    }

    public Boolean isLocationInMap(Location location) {
        boolean locationInMap = false;
        if (map.isLocationInMap(location) == true) {
            locationInMap = true;
        }
        return locationInMap;
    }

    public Boolean isSensorInMap(Sensor sensor) {
        boolean sensorInMap = false;
        if (map.isSensorInMap(sensor) == true) {
            sensorInMap = true;
        }
        return sensorInMap;
    }

    public Temperature getTemperatureFromRead(Sensor sensor) {
        Temperature temperature = read.getTemperatureFromRead(sensor);
        return temperature;
    }
}