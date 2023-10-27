import java.util.ArrayList;
import java.util.List;

public class SensorRegistry {

  // Private list of sensor object
  private List<Sensor> sensorlist;

  private SensorRegistry() {
    this.sensorlist = new ArrayList<Sensor>();
  }

  static SensorRegistry sensorRegistry = null;

  // Static getInstance method
  static public SensorRegistry getInstance() {
    if (sensorRegistry == null)
      sensorRegistry = new SensorRegistry();

    return sensorRegistry;
  }

  // Checks if the sensor already in registry or not
  public Boolean isSensorInRegistry(Sensor sensorf) {
    for (Sensor sensor : sensorlist) {
      if (sensor.equals(sensorf)) {
        return true;
      }
    }
    return false;
  }

  // Removes sensor from registry
  public void removesensor(Sensor sensor) {
    this.sensorlist.remove(sensor);
  }

  // Add sensor to registry
  public void addSensor(Sensor s) {
    if (!this.isSensorInRegistry(s)) {
      this.sensorlist.add(s);
    }
  }

}
