import java.util.ArrayList;
import java.util.List;

public class SensorTemperatureTable {
    List<SensorTemperaturePair> sensorTemperatureTable;
    
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
        for (SensorTemperaturePair pair : sensorTemperatureTable) {
            if ((pair.getSensor()).equals(sensor)) {
                temperature = pair.getTemperature();
                break;
            }
        }
        return temperature;
    }

}