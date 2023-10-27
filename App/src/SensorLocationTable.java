import java.util.ArrayList;
import java.util.List;

public class SensorLocationTable {
    List<Pair<Sensor,Location>> sensorLocationTable; 
    
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
        for (Pair<Sensor, Location> pair : sensorLocationTable) {
            if ((pair.second).equals(location)) {
                isInTable = true;
                break;
            }
        }
        return isInTable;
    }

    public boolean isSensorInTable(Sensor sensor) {
        boolean isInTable = false;
        for (Pair<Sensor, Location> pair : sensorLocationTable) {
            if ((pair.first).equals(sensor)) {
                isInTable = true;
                break;
            }
        }
        return isInTable;
    }

    public Sensor getSensorFromSensorLocationTable(Location location) {
        Sensor sensor = null;
        for (Pair<Sensor, Location> pair : sensorLocationTable) {
            if ((pair.second).equals(location)) {
                sensor = pair.first;
                break;
            }
        }
        return sensor;
    }

    public void storeSensorLocationPair(Sensor sensor, Location location) {
        Pair<Sensor,Location> sensorLocationPair = new Pair<>(sensor,location);
        sensorLocationTable.add(sensorLocationPair);
    }
}
