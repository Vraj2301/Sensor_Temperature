public class App {
    public static void main(String[] args) throws Exception {
        // initialize System terminal
        SystemTerminal sys = new SystemTerminal();

        // create sensor objects
        SensorRegistry sensorRegistry = SensorRegistry.getInstance();
        Sensor registeredSensor1 = sensorRegistry.returnSensorList().get(0);
        Sensor registeredSensor2 = sensorRegistry.returnSensorList().get(1);
        Sensor newSensor = sensorRegistry.returnSensorList().get(2);
        Sensor notRegisteredSensor = new Sensor(0005);

        LocationRegistry locationRegistry = LocationRegistry.getInstance();
        Location registeredLocation1 = locationRegistry.returnLocationList().get(0);
        Location registeredLocation2 = locationRegistry.returnLocationList().get(1);
        Location locationNotCovered = locationRegistry.returnLocationList().get(2);
        Location locationNotRegistered = new Location(0005, "Location5");

        TemperatureRegistry temperatureRegistry = TemperatureRegistry.getInstance();
        Temperature temperatureAtLocation1 = temperatureRegistry.returnTemperatureList().get(0);
        Temperature temperatureAtLocation2 = temperatureRegistry.returnTemperatureList().get(1);
        Temperature temperatureNotDeployed = temperatureRegistry.returnTemperatureList().get(2);

        // Use case 1: deploy sensor
        // expected output: Ok. Deployed Sensor with ID: 1
        System.out.println("Use case 1: Deploy Sensor\n");
        System.out.println("Deploy registered Sensor to an uncovered location that is registered.");
        sys.DeploySensor(registeredSensor1, registeredLocation1, temperatureAtLocation1);

        // Sensor is not in registry
        System.out.println("\nFail scenario: Attempting to deploy an unregistered Sensor.");
        sys.DeploySensor(notRegisteredSensor, registeredLocation2, temperatureNotDeployed);

        // Location is not in registry
        System.out.println("\nFail scenario: Attempting to deploy a registered Sensor to a unregistered Location.");
        sys.DeploySensor(registeredSensor2, locationNotRegistered, temperatureNotDeployed);

        // Location already covered
        System.out.println("\nFail scenario: Attempting to deploy an unregistered Sensor to a previously covered location.");
        sys.DeploySensor(notRegisteredSensor, registeredLocation1,temperatureNotDeployed);

        // Location already covered
        System.out.println("\nFail scenario: Attempting to deploy an registered Sensor to a covered location.");
        sys.DeploySensor(registeredSensor2, registeredLocation1, temperatureNotDeployed);

        // Sensor already deployed
        System.out.println("\nFail scenario: Attempting to re-deploy a sensor at location.");
        sys.DeploySensor(registeredSensor1, registeredLocation2, temperatureNotDeployed);

        // Ok. Deployed Sensor with ID: 2
        System.out.println("\nSuccess scenario: Attempting to Deploy a  registered sensor at registered location.");
        sys.DeploySensor(registeredSensor2, registeredLocation2, temperatureAtLocation2);

        System.out.println("------------------------------------------------------------------------------------------");

        // Use case 2: read temperature Success scenario: read temperature at covered
        // location
        System.out.println("Success scenario: Use case 2: Read Temperature\n");
        System.out.println("Read temperature at covered first covered location. ");
        sys.ReadTemperature(registeredLocation1);

        System.out.println("\nSuccess scenario: Read temperature at covered second covered locations. ");
        sys.ReadTemperature(registeredLocation2);

        // attempting to read temperature value from an uncovered location
        System.out.println("\nFail scenario: Attempting to read temperature value from an uncovered location.");
        sys.ReadTemperature(locationNotCovered);

        System.out.println("------------------------------------------------------------------------------------------");

        // Use case 3: Replace Sensor
        System.out.println("Use case 3: Replace Sensor");

        System.out.println("\nFail scenario: Replace sensor at covered locations with unregistered sensor");
        sys.ReplaceSensor(notRegisteredSensor, registeredLocation2, temperatureAtLocation2);

        System.out.println("\nFail scenario: Replace sensor at covered locations with registered sensor and different temperature");
        sys.ReplaceSensor(newSensor, registeredLocation2, temperatureAtLocation1);

        System.out.println("\nFail scenario: Replace sensor at uncovered locations with registered sensor");
        sys.ReplaceSensor(newSensor, locationNotCovered, temperatureAtLocation1);

        System.out.println("\nFail scenario: Replace sensor at uncovered locations with already deployed sensor");
        sys.ReplaceSensor(registeredSensor1, registeredLocation2, temperatureAtLocation2);

        System.out.println("\nSuccess scenario: Replace sensor at covered locations with new sensor and temperature at location " + registeredLocation2.getlocation());
        sys.ReplaceSensor(newSensor, registeredLocation2, temperatureAtLocation2);

        System.out.println("------------------------------------------------------------------------------------------");

        // Use case 4: Return Location and Temperature collection
        System.out.println("Use case 4: Read all temperatures at covered locations\n");
        sys.returnAllTemperatureAndLocations();
    }
}
