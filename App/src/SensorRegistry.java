import java.util.ArrayList;
import java.util.List;

public class SensorRegistry {
  private List<Sensor> sensorlist = new ArrayList<Sensor>();

  public Boolean islocationInRegistry(Sensor sensorf) {
    for (Sensor sensor : sensorlist) {
      if (sensor.equals(sensorf)) {
        return true;
      }
    }
    return false;
  }
}
