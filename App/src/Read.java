import java.util.ArrayList;
import java.util.List;

public class Read {
    private List<SensorTemperaturePair> sensorTemperatureTable;

    private Read() {
        sensorTemperatureTable = new ArrayList<>();
    }

    static Read ReadInstance = null;

    // Static getInstance method
    static public Read getInstance() {
        if (ReadInstance == null)
            ReadInstance = new Read();

        return ReadInstance;
    }

    public Temperature getTemperatureFromRead(Sensor sensor) {
        Temperature temperature = new Temperature();
        for (SensorTemperaturePair pair : sensorTemperatureTable) {
            if ((pair.getSensor()).equals(sensor)) {
                temperature = pair.getTemperature();
                break;
            }
        }
        return temperature;
    }

    public void makeSensorTemperaturePair(Sensor sensor, Temperature temperature) {
        sensorTemperatureTable.add(new SensorTemperaturePair(sensor, temperature));
    }

    public void deleteSTPairFromRead(Sensor sensor) {
        for(int i = 0 ; i < sensorTemperatureTable.size() ; i++) {
            if((sensorTemperatureTable.get(i).getSensor()).equals(sensor) ) {
                sensorTemperatureTable.remove(i);
                break;
            }
        }
    }

}