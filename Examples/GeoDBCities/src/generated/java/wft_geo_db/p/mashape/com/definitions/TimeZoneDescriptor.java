package wft_geo_db.p.mashape.com.definitions;

public class TimeZoneDescriptor {
    /**
     * The time-zone id
     */
    public String id;
    /**
     * The time-zone name
     */
    public String name;
    /**
     * The number of hours this time-zone is offset from UTC
     */
    public int rawUtcOffsetHours;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        TimeZoneDescriptor othersame = ((TimeZoneDescriptor) other);
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (rawUtcOffsetHours!= othersame.rawUtcOffsetHours) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((id == null)? 0 :id.hashCode())+((name == null)? 0 :name.hashCode()))+ rawUtcOffsetHours);
    }
}
