import java.util.ArrayList;
import java.util.List;

public class TemperatureRegistry {
    private List<Temperature> temperatureList;

    // Private constructor
  private TemperatureRegistry() {
    this.temperatureList = new ArrayList<Temperature>();
    // create temperature objects and add to temperatureRegistry
    temperatureList.add(new Temperature());
    temperatureList.add(new Temperature());
    temperatureList.add(new Temperature());
    temperatureList.add(new Temperature());
    temperatureList.add(new Temperature());
    temperatureList.add(new Temperature());
    temperatureList.add(new Temperature());
    temperatureList.add(new Temperature());
  }

  static TemperatureRegistry temperatureRegistry = null;

  // Static getInstance method
  static public TemperatureRegistry getInstance() {
    if (temperatureRegistry == null)
      temperatureRegistry = new TemperatureRegistry();

    return temperatureRegistry;
  }
}
