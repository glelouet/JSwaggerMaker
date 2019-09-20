package www.googleapis.com.definitions;

public class GeoPoint {
    /**
     * Altitude above the reference ellipsoid, in meters.
     */
    public double altitude;
    /**
     * Latitude in degrees.
     */
    public double latitude;
    /**
     * Longitude in degrees.
     */
    public double longitude;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GeoPoint othersame = ((GeoPoint) other);
        if (altitude!= othersame.altitude) {
            return false;
        }
        if (latitude!= othersame.latitude) {
            return false;
        }
        if (longitude!= othersame.longitude) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Double.hashCode(altitude)+ Double.hashCode(latitude))+ Double.hashCode(longitude));
    }
}
