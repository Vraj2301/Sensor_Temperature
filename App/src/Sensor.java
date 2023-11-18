public class Sensor {

  // Private attributes
  private Integer sensorID;
  private Boolean isDeployed;

  // public constructor
  public Sensor() {
    sensorID = 0000;
    isDeployed = false;
  }

  public Sensor(Integer sensorID) {
    this.sensorID = sensorID;
    isDeployed = false;
  }

  // Getter
  public Boolean getisDeployed() {
    return this.isDeployed;
  }

  // Getter
  public Integer getsensorID() {
    return this.sensorID;
  }

  // Setter
  public void setisDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
  }

  // Setter
  public void setlocationID(Integer sensorID) {
    this.sensorID = sensorID;
  }

  // Override equals method of object class
  public Boolean equals(Sensor s) {
    if (this.sensorID == s.sensorID) {
      return true;
    }
    return false;
  }

}
