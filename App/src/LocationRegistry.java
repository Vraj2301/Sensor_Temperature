import java.util.*;

public class LocationRegistry {

  // Private list of location object
  private List<Location> locationlist;

  // Private constructor
  private LocationRegistry() {
    this.locationlist = new ArrayList<Location>();
    // create location objects and add to locationRegistry
    locationlist.add(new Location(0001, "Location1"));
    locationlist.add(new Location(0002, "Location2"));
    locationlist.add(new Location(0003, "Location3"));
    locationlist.add(new Location(0004, "Location4"));
  }

  static LocationRegistry locationRegistry = null;

  // Static getInstance method
  static public LocationRegistry getInstance() {
    if (locationRegistry == null)
      locationRegistry = new LocationRegistry();

    return locationRegistry;
  }

  // Checks if location in Registry or not
  public Boolean isLocationInRegistry(Location locationf) {
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
    if (!this.isLocationInRegistry(location)) {
      this.locationlist.add(location);
    }
  }

  public List<Location> returnLocationList() { 
    return locationlist; 
  }
}
