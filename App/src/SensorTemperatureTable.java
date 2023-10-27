import java.util.ArrayList;
import java.util.List;

public class SensorTemperatureTable {
    List<Pair<Sensor,Double>> sensorTemperatureTable;
    
    private SensorTemperatureTable() {
        sensorTemperatureTable = new ArrayList<>();
    }

    static SensorTemperatureTable sensorTemperatureTableInstance = null;

    // Static getInstance method
    static public SensorTemperatureTable getInstance() {
    if (sensorTemperatureTableInstance == null)
        sensorTemperatureTableInstance = new SensorTemperatureTable();

    return sensorTemperatureTableInstance;
    }

    public double getTemperatureFromSensorTemperatureTable(Sensor sensor) {
        double temperature = 0.0;
        for (Pair<Sensor, Double> pair : sensorTemperatureTable) {
            if ((pair.first).equals(sensor)) {
                temperature = pair.second;
                break;
            }
        }
        return temperature;
    }

    public void storeSensorTemperaturePair(Sensor sensor, Double tempValue) {
        Pair<Sensor,Double> sensorTemperaturePair = new Pair<>(sensor, tempValue);
        sensorTemperatureTable.add(sensorTemperaturePair);
    }
}