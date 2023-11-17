import java.util.ArrayList;
import java.util.List;

public class Read {
    List<SensorTemperaturePair> Read;

    private Read() {
        Read = new ArrayList<>();
    }

    private Read ReadInstance = null;

    // Static getInstance method
    public Read getInstance() {
        if (ReadInstance == null)
            ReadInstance = new Read();

        return ReadInstance;
    }

    public Temperature getTemperatureFromRead(Sensor sensor) {
        Temperature temperature = new Temperature();
        for (SensorTemperaturePair pair : Read) {
            if ((pair.getSensor()).equals(sensor)) {
                temperature = pair.getTemperature();
                break;
            }
        }
        return temperature;
    }

    public SensorTemperaturePair makeSensorTemperaturePair(Sensor sensor, Temperature temperature) {
        SensorTemperaturePair pair = new SensorTemperaturePair(sensor, temperature);
        Read.add(pair);
        return pair;
    }

}