import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<SensorLocationPair> sensorLocationTable;

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

    public int getMaplength() {
        return sensorLocationTable.size();
    }

    public void makeSensorLocationPair(Sensor sensor, Location location) {
        sensorLocationTable.add(new SensorLocationPair(sensor, location));
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

    public List<SensorLocationPair> returnSLTable() {
        return sensorLocationTable;
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

    public void deleteSLPairFromMap(Sensor sensor, Location location) {
        for(int i = 0 ; i < sensorLocationTable.size() ; i++) {
            if((sensorLocationTable.get(i).getSensor()).equals(sensor) && (sensorLocationTable.get(i).getLocation()).equals(location)) {
                sensorLocationTable.remove(i);
                break;
            }
        }
    }

}
