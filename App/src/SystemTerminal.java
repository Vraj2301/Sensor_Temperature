import java.util.ArrayList;
import java.util.List;

public class SystemTerminal {

    private List<Sensor> deployedSensors;

    public SystemTerminal() {
        deployedSensors = new ArrayList<Sensor>();
    }

    // PUT DEFAULT FUNCTION CODE TO REMOVE ERRORS
    // TODO: REPLACE FUNCTION CODE WITH PROPER IMPLEMENTATION FOR THE USE CASES
    public void DeploySensor(Sensor sensor, Location location) {}

    public double ReadTemperature(Location location) { return 0.0; }

    public Boolean isSensorInRegistry(Sensor sensor) { return true; }

    public Boolean isLocationInRegistry() { return true; }

    public Sensor getSensorFrom_SL_Table() { Sensor s1 = new Sensor(); return s1; }

    public Sensor getSensorFrom_ST_Table() { Sensor s1 = new Sensor(); return s1; }

    public Location getLocationFrom_SL_Table() { Location l1 = new Location(); return l1; }

    public double getTemperatureFrom_ST_Table() { return 0.0; }

    public List<Sensor> getDeployedSensors() {
        return deployedSensors;
    }

    public void setDeployedSensors(List<Sensor> deployedSensors) {
        this.deployedSensors = deployedSensors;
    }


}
