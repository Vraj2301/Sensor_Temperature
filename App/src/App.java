public class App {
    public static void main(String[] args) throws Exception {
        //initialize System terminal
        SystemTerminal sys = new SystemTerminal();
        
        //create sensor objects
        Sensor s1 = new Sensor(0001);
        Sensor s2 = new Sensor(0002);
        Sensor s3 = new Sensor(0003);
        Sensor s4 = new Sensor(0004);
        Sensor s5 = new Sensor(0005);
        Sensor s6 = new Sensor(0006);
        Sensor s7 = new Sensor(0007);

        //create location objects
        Location l1 = new Location(0001, "Location1");
        Location l2 = new Location(0002,"Location2");
        Location l3 = new Location(0003,"Location3");
        Location l4 = new Location(0004,"Location4");       //add Location to registries

        // Deploy first four sensors
        sys.DeploySensor(s1,l1);
        sys.DeploySensor(s2,l2);
        sys.DeploySensor(s3,l3);
        sys.DeploySensor(s4,l4);
    }
}