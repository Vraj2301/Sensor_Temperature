import java.util.*;

public class LocationRegistry {
  private List<Location> locationlist;

  private LocationRegistry() {
    this.locationlist = new ArrayList<Location>();
  }

  public Boolean islocationInRegistry(Location locationf) {
    for (Location location : locationlist) {
      if (location.equals(locationf)) {
        return true;
      }
    }
    return false;
  }

}
