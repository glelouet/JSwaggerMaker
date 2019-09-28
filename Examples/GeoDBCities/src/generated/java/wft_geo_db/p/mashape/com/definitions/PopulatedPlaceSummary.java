package wft_geo_db.p.mashape.com.definitions;

public class PopulatedPlaceSummary {
    /**
     * The city name (varies by languageCode)
     */
    public String city;
    /**
     * The country name (varies by languageCode)
     */
    public String country;
    /**
     * The ISO-3166 country code
     */
    public String countryCode;
    /**
     * Included if this is the result of a distance query
     */
    public double distance;
    /**
     * The place GeoDB native id
     */
    public int id;
    /**
     * The place latittude (-90.0 to 90.0)
     */
    public double latitude;
    /**
     * The place longitude (-180.0 to 180.0)
     */
    public double longitude;
    /**
     * The place name (varies by languageCode)
     */
    public String name;
    /**
     * The region name (varies by languageCode)
     */
    public String region;
    /**
     * The ISO or FIPS region code
     */
    public String regionCode;
    /**
     * The place type
     */
    public String type;
    /**
     * The place WikiData id
     */
    public String wikiDataId;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PopulatedPlaceSummary othersame = ((PopulatedPlaceSummary) other);
        if ((city!= othersame.city)&&((city == null)||(!city.equals(othersame.city)))) {
            return false;
        }
        if ((country!= othersame.country)&&((country == null)||(!country.equals(othersame.country)))) {
            return false;
        }
        if ((countryCode!= othersame.countryCode)&&((countryCode == null)||(!countryCode.equals(othersame.countryCode)))) {
            return false;
        }
        if (distance!= othersame.distance) {
            return false;
        }
        if (id!= othersame.id) {
            return false;
        }
        if (latitude!= othersame.latitude) {
            return false;
        }
        if (longitude!= othersame.longitude) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((region!= othersame.region)&&((region == null)||(!region.equals(othersame.region)))) {
            return false;
        }
        if ((regionCode!= othersame.regionCode)&&((regionCode == null)||(!regionCode.equals(othersame.regionCode)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        if ((wikiDataId!= othersame.wikiDataId)&&((wikiDataId == null)||(!wikiDataId.equals(othersame.wikiDataId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((city == null)? 0 :city.hashCode())+((country == null)? 0 :country.hashCode()))+((countryCode == null)? 0 :countryCode.hashCode()))+ Double.hashCode(distance))+ id)+ Double.hashCode(latitude))+ Double.hashCode(longitude))+((name == null)? 0 :name.hashCode()))+((region == null)? 0 :region.hashCode()))+((regionCode == null)? 0 :regionCode.hashCode()))+((type == null)? 0 :type.hashCode()))+((wikiDataId == null)? 0 :wikiDataId.hashCode()));
    }
}
