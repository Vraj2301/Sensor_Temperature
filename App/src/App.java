public class App {
    public static void main(String[] args) throws Exception {
        // initialize sensorRegistry instance
        SensorRegistry sensorRegistry = SensorRegistry.getInstance();

        // create sensor objects
        Sensor s1 = new Sensor(0001);
        Sensor s2 = new Sensor(0002);
        Sensor s3 = new Sensor(0003); // will not be registered
        Sensor s4 = new Sensor(0004);

        // add sensors s1 and s2 to sensor registry
        sensorRegistry.addSensor(s1);
        sensorRegistry.addSensor(s2);
        sensorRegistry.addSensor(s4); // Trying to add sensor with same id to registry

        // initialize locationRegistry instance
        LocationRegistry locationRegistry = LocationRegistry.getInstance();

        // create location objects
        Location l1 = new Location(0001, "Location1");
        Location l2 = new Location(0002, "Location2");
        Location l3 = new Location(0003, "Location3"); // will not be registered
        Location l4 = new Location(0004, "Location4");

        // add locations l1 and l2 to sensor registry
        locationRegistry.addlocation(l1);
        locationRegistry.addlocation(l2);
        locationRegistry.addlocation(l4); // trying to add sensor with same locationId to registry

        // initialize System terminal
        SystemTerminal sys = new SystemTerminal();

        // Use case 1: deploy sensor
        // Success scenario: Deploy registered sensors to an uncovered locations that is
        // registered
        System.out.println("Use case 1: Deploy Sensor \n");
        System.out.println("Deploy registered Sensor(s1) to an uncovered location(l1) that is registered.\n");
        sys.DeploySensor(s1, l1);
        System.out.println("");

        // attempting to deploy an unregistered Sensor to a unregistered Location
        System.out.println("Attempting to deploy an unregistered Sensor(s3).\n");
        sys.DeploySensor(s3, l3);
        System.out.println("");

        // attempting to deploy an unregistered Sensor to a registered Location
        System.out.println("Attempting to deploy an unregistered Sensor(s3) to a registered Location(l2).\n");
        sys.DeploySensor(s3, l2);
        System.out.println("");

        // attempting to deploy a registered Sensor to a unregistered location
        System.out.println("Attempting to deploy a registered Sensor(s2) to a unregistered Location(l3).\n");
        sys.DeploySensor(s2, l3);
        System.out.println("");

        // attempting to deploy an unregistered Sensor to a previously covered location
        System.out.println("Attempting to deploy an unregistered Sensor(s3) to a previously covered location(l1).\n");
        sys.DeploySensor(s3, l1);
        System.out.println("");

        // attempting to deploy an registered Sensor to a covered location
        System.out.println("Attempting to deploy an registered Sensor(s2) to a covered location(l1).\n");
        sys.DeploySensor(s2, l1);
        System.out.println("");

        // attempting to re-deploy a sensor to a different location
        System.out.println("Attempting to re-deploy a sensor(s1) at location(l2).\n");
        sys.DeploySensor(s1, l2);
        System.out.println("");

        System.out.println("Attempting to re-deploy a sensor(s2) at location(l2).\n");
        sys.DeploySensor(s2, l2);
        System.out.println("");

        // Use case 2: read temperature Success scenario: read temperature at covered
        // location
        System.out.println("Use case 2: Read Temperature \n");
        System.out.println("Read temperature at covered locations(l1). \n");
        sys.ReadTemperature(l1);
        System.out.println("");

        System.out.println("Read temperature at covered locations(l2). \n");
        sys.ReadTemperature(l2);
        System.out.println("");

        // attempting to read temperature value from an uncovered location
        System.out.println("Attempting to read temperature value from an uncovered location (l3).\n");
        sys.ReadTemperature(l3);
        System.out.println("");
    }
}
