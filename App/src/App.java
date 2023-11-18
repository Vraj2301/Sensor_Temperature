public class App {
    public static void main(String[] args) throws Exception {
        // create sensor objects
        Sensor registeredSensor1 = new Sensor(0001);
        Sensor registeredSensor2 = new Sensor(0002);
        Sensor notRegisteredSensor = new Sensor(0005);

        Location registeredLocation1 = new Location(0001, "Location1");
        Location registeredLocation2 = new Location(0002, "Location2");
        Location registeredLocation3 = new Location(0003, "Location3");
        Location notRegisteredLocation = new Location(0005, "Location5");

        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature();
        Temperature t3 = new Temperature();
        Temperature t4 = new Temperature();
        Temperature t5 = new Temperature();
        Temperature t6 = new Temperature();
        Temperature t7 = new Temperature();

        // initialize System terminal
        SystemTerminal sys = new SystemTerminal();

        // Use case 1: deploy sensor
        // expected output: Ok. Deployed Sensor with ID: 1
        System.out.println("Use case 1: Deploy Sensor");
        System.out.println("Deploy registered Sensor to an uncovered location that is registered.\n");
        sys.DeploySensor(registeredSensor1, registeredLocation1,t1);

        // Sensor is not in registry
        System.out.println("\nAttempting to deploy an unregistered Sensor.");
        sys.DeploySensor(notRegisteredSensor, registeredLocation2, t2);

        // Location is not in registry
        System.out.println("\nAttempting to deploy a registered Sensor to a unregistered Location.\n");
        sys.DeploySensor(registeredSensor2, notRegisteredLocation, t3);

        // Location already covered
        System.out.println("\nAttempting to deploy an unregistered Sensor to a previously covered location.\n");
        sys.DeploySensor(notRegisteredSensor, registeredLocation1,t4);

        // Location already covered
        System.out.println("\nAttempting to deploy an registered Sensor to a covered location.\n");
        sys.DeploySensor(registeredSensor2, registeredLocation1, t5);

        // Sensor already deployed
        System.out.println("\nAttempting to re-deploy a sensor at location.\n");
        sys.DeploySensor(registeredSensor1, registeredLocation2, t6);

        // Ok. Deployed Sensor with ID: 2
        System.out.println("\nAttempting to Deploy a  registered sensor at registered location.\n");
        sys.DeploySensor(registeredSensor2, registeredLocation2, t7);

        // Use case 2: read temperature Success scenario: read temperature at covered
        // location
        System.out.println("\nUse case 2: Read Temperature");
        System.out.println("Read temperature at covered first covered location. \n");
        sys.ReadTemperature(registeredLocation1);

        System.out.println("\nRead temperature at covered second covered locations. \n");
        sys.ReadTemperature(registeredLocation2);

        // attempting to read temperature value from an uncovered location
        System.out.println("\nAttempting to read temperature value from an uncovered location.\n");
        sys.ReadTemperature(registeredLocation3);

        // Use case 3: Replace Sensor
        // System.out.println("\nUse case 3: Replace old sensor at covered locations with new sensor");
        // sys.ReplaceSensor();

        // Use case 4: Return Location and Temperature collection
        // System.out.println("\nUse case 4: Read all temperatures at covered locations");
        // sys.ReturnAllTemperaturesAndLocations();
    }
}
