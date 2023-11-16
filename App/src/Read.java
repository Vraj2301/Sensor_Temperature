import java.util.ArrayList;
import java.util.List;

public class Read {
    List<SensorTemperaturePair> Read;

    private Read() {
        Read = new ArrayList<>();
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
        for (SensorTemperaturePair pair : Read) {
            if ((pair.getSensor()).equals(sensor)) {
                temperature = pair.getTemperature();
                break;
            }
        }
        return temperature;
    }

}