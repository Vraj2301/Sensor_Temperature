import java.util.*;

public class LocationRegistry {

  // Private list of location object
  private List<Location> locationlist;

  // Private constructor
  private LocationRegistry() {
    this.locationlist = new ArrayList<Location>();
  }

  // Checks if location in Registry or not
  public Boolean islocationInRegistry(Location locationf) {
    for (Location location : locationlist) {
      if (location.equals(locationf)) {
        return true;
      }
    }
    return false;
  }

  // Remove location from registry
  public void removelocation(Location location) {
    this.locationlist.remove(location);
  }

  // Add location to registry
  public void addlocation(Location location) {
    if (!this.islocationInRegistry(location)) {
      this.locationlist.add(location);
    }
  }

}
