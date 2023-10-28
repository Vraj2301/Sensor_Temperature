public class App {
    public static void main(String[] args) throws Exception {
        //initialize sensorRegistry instance
        SensorRegistry sensorRegistry = SensorRegistry.getInstance();
        
        //create sensor objects
        Sensor s1 = new Sensor(0001); 
        Sensor s2 = new Sensor(0002); 
        Sensor s3 = new Sensor(0003);   // will not be registered 

        //add sensors s1 and s2 to sensor registry
        sensorRegistry.addSensor(s1);
        sensorRegistry.addSensor(s2);
      
        //initialize sensorRegistry instance
        LocationRegistry locationRegistry = LocationRegistry.getInstance();

        //create location objects
        Location l1 = new Location(0001, "Location1");
        Location l2 = new Location(0002,"Location2");  
        Location l3 = new Location(0003, "Location5"); // will not be registered

        //add locations l1 and l2 to sensor registry
        locationRegistry.addlocation(l1);
        locationRegistry.addlocation(l2);
        
        //initialize System terminal
        SystemTerminal sys = new SystemTerminal();

        // Use case 1: deploy sensor 
        // Success scenario: Deploy registered sensors to an uncovered locations that is registered
        sys.DeploySensor(s1,l1); 
        System.out.println("");

        // attempting to deploy an unregistered Sensor to a unregistered Location
        sys.DeploySensor(s3,l3); 
        System.out.println("");

        // attempting to deploy an unregistered Sensor to a registered Location
        sys.DeploySensor(s3,l2); 
        System.out.println("");

        // attempting to deploy a registered Sensor to a unregistered Location
        sys.DeploySensor(s2,l3); 
        System.out.println("");

        // attempting to deploy an unregistered Sensor to a previously covered location
        sys.DeploySensor(s3,l1); 
        System.out.println("");

        // attempting to deploy an registered Sensor to a covered location
        sys.DeploySensor(s2,l1); 
        System.out.println("");

        // attempting to re-deploy a sensor to a different location
        sys.DeploySensor(s1,l2); 
        System.out.println("");

        sys.DeploySensor(s2,l2); 
        System.out.println("");

        // Use case 2: read temperature Success scenario: read temperature at covered location
        sys.ReadTemperature(l1);
        System.out.println("");

        sys.ReadTemperature(l2);
        System.out.println("");

        // attempting to read temperature value from an uncovered location
        sys.ReadTemperature(l3);
        System.out.println("");
    }
}