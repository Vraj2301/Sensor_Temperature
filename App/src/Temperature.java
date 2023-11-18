public class Temperature {

    private Double tempValue;

    public Temperature() {
        tempValue = 0.0;
    }

    public Temperature(Double tempValue) {
        this.tempValue = tempValue;
    }

    public void assignRandomValue() {
        double min = 0.0;
        double max = 100.0;
        tempValue = (Math.random() * ((max - min) + 1)) + min;
    }

    public double getTempValue() {
        return tempValue;
    }

    public void setTempValue(double tempValue) {
        this.tempValue = tempValue;
    }

    public String toString() {
        return "Temp: " + this.tempValue;
    }
}
