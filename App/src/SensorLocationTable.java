import java.util.ArrayList;
import java.util.List;

public class SensorLocationTable {
    List<SensorLocationPair> sensorLocationTable; 
    
    private SensorLocationTable() {
        sensorLocationTable = new ArrayList<>();
    }

    static SensorLocationTable sensorLocationTableInstance = null;

    // Static getInstance method
    static public SensorLocationTable getInstance() {
    if (sensorLocationTableInstance == null)
        sensorLocationTableInstance = new SensorLocationTable();

    return sensorLocationTableInstance;
    }

    public boolean isLocationInTable(Location location) {
        boolean isInTable = false;
        for (SensorLocationPair pair : sensorLocationTable) {
            if ((pair.getLocation()).equals(location)) {
                isInTable = true;
                break;
            }
        }
        return isInTable;
    }

    public boolean isSensorInTable(Sensor sensor) {
        boolean isInTable = false;
        for (SensorLocationPair pair : sensorLocationTable) {
            if ((pair.getSensor()).equals(sensor)) {
                isInTable = true;
                break;
            }
        }
        return isInTable;
    }

    public Sensor getSensorFromSensorLocationTable(Location location) {
        Sensor sensor = null;
        for (SensorLocationPair pair : sensorLocationTable) {
            if ((pair.getLocation()).equals(location)) {
                sensor = pair.getSensor();
                break;
            }
        }
        return sensor;
    }

}
