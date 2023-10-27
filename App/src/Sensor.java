public class Sensor {
  private Integer sensorID;
  private Boolean isDeployed;

  public Sensor() {
    sensorID = 0000;
    isDeployed = false;
  }

  public Sensor(Integer sensorID) {
    this.sensorID = sensorID;
  }

  public Boolean getisDeployed() {
    return this.isDeployed;
  }

  public Integer getsensorID() {
    return this.sensorID;
  }

  public void setisDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
  }

  public void setlocationID(Integer sensorID) {
    this.sensorID = sensorID;
  }
}
