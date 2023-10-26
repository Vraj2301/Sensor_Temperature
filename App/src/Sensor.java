public class Sensor {

  // Private attributes
  private Integer sensorID;
  private Boolean isDeployed;

  // public constructor
  public Sensor() {
    this.sensorID = 0000;
    this.isDeployed = false;
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
      System.out.print("Sensor with sensorId " + this.sensorID + " exist in Sensor registry and is ");
      if (this.isDeployed) {
        System.out.println("already deployed");
      } else {
        System.out.println("not deployed.");
      }
      return true;
    }
    return false;
  }

}
