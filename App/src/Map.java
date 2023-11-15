import java.util.ArrayList;
import java.util.List;

public class Map {
    List<SensorLocationPair> sensorLocationTable; 
    
    private Map() {
        sensorLocationTable = new ArrayList<>();
    }

    static Map mapInstance = null;

    // Static getInstance method
    static public Map getInstance() {
    if (mapInstance == null)
        mapInstance = new Map();

    return mapInstance;
    }

    public boolean isLocationInMap(Location location) {
        boolean isInTable = false;
        for (SensorLocationPair pair : sensorLocationTable) {
            if ((pair.getLocation()).equals(location)) {
                isInTable = true;
                break;
            }
        }
        return isInTable;
    }

    public boolean isSensorInMap(Sensor sensor) {
        boolean isInTable = false;
        for (SensorLocationPair pair : sensorLocationTable) {
            if ((pair.getSensor()).equals(sensor)) {
                isInTable = true;
                break;
            }
        }
        return isInTable;
    }

    public Sensor getSensorFromMap(Location location) {
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
