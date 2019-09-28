package wft_geo_db.p.mashape.com.definitions;

public class DistanceResponse {
    /**
     * The distance in units as set by the distanceUnit param (defaults to miles)
     */
    public double data;
    public WftError[] errors;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        DistanceResponse othersame = ((DistanceResponse) other);
        if (data!= othersame.data) {
            return false;
        }
        if ((errors!= othersame.errors)&&((errors == null)||(!errors.equals(othersame.errors)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(data)+((errors == null)? 0 :errors.hashCode()));
    }
}
