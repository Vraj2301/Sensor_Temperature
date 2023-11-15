import java.util.ArrayList;
import java.util.List;

public class SensorTemperatureTable {
    List<Pair<Sensor,Temperature>> sensorTemperatureTable;
    
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

    public Temperature getTemperatureFromSensorTemperatureTable(Sensor sensor) {
        Temperature temperature = new Temperature();
        for (Pair<Sensor, Temperature> pair : sensorTemperatureTable) {
            if ((pair.first).equals(sensor)) {
                temperature = pair.second;
                break;
            }
        }
        return temperature;
    }

    public void storeSensorTemperaturePair(Sensor sensor, Temperature temperature) {
        Pair<Sensor,Temperature> sensorTemperaturePair = new Pair<>(sensor, temperature);
        sensorTemperatureTable.add(sensorTemperaturePair);
    }
}