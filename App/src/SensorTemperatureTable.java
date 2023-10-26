import java.util.ArrayList;
import java.util.List;

public class SensorTemperatureTable {
    List<Pair<Sensor,Temperature>> sensorTemperatureTable; 
    
    public SensorTemperatureTable() {
        sensorTemperatureTable = new ArrayList<>();
    }

    public Temperature getTemperatureFromSensorTemperatureTable(Sensor sensor) {
        Temperature temperature = null;
        for (Pair<Sensor, Temperature> pair : sensorTemperatureTable) {
            if ((pair.first).equals(sensor)) {
                temperature = pair.second;
                break;
            }
        }
        return temperature;
    }

    public void storeSensorTemperaturePair(Sensor sensor, Temperature temperature) {
        Pair<Sensor,Temperature> sensorTemperaturePair = new Pair<>(sensor,temperature);
        sensorTemperatureTable.add(sensorTemperaturePair);
    }
}