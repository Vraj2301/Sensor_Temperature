public class Location {
  private Integer locationID;
  private String location;

  public Location() {
    this.location = "";
    this.locationID = 0000;
  }

  public Location(Integer locationID, String location) {
    this.locationID = locationID;
    this.location = location;
  }

  public String getlocation() {
    return this.location;
  }

  public Integer getlocationID() {
    return this.locationID;
  }

  public void setlocation(String location) {
    this.location = location;
  }

  public void setlocationID(Integer locationID) {
    this.locationID = locationID;
  }

}