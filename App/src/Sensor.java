public class Sensor {
  private Integer sensorID;
  private Boolean isDeployed;

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
