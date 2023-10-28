public class Location {

  // Private attributes
  private Integer locationID;
  private String location;

  // Public constructor
  public Location() {
    this.location = "";
    this.locationID = 0000;
  }

  public Location(Integer locationID, String location) {
    this.locationID = locationID;
    this.location = location;
  }

  // Getter
  public String getlocation() {
    return this.location;
  }

  // Getter
  public Integer getlocationID() {
    return this.locationID;
  }

  // Setter
  public void setlocation(String location) {
    this.location = location;
  }

  // Setter
  public void setlocationID(Integer locationID) {
    this.locationID = locationID;
  }

  // Override equals method of object class
  public Boolean equals(Location l) {
    if (this.location.equals(l.location) || this.locationID == l.locationID) {
      /*
       * System.out.println("Location with name " + this.location + " and locationId "
       * + this.locationID
       * + " exist in location registry.");
       */
      return true;
    }
    return false;
  }

}