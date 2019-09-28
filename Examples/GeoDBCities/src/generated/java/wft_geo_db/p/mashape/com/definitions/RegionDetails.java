package wft_geo_db.p.mashape.com.definitions;

public class RegionDetails {
    /**
     * The region's capital city (varies by languageCode)
     */
    public String capital;
    /**
     * An ISO-3166 country code
     */
    public String countryCode;
    /**
     * The FIPS 10-4 region code
     */
    public String fipsCode;
    /**
     * The ISO region code
     */
    public String isoCode;
    /**
     * The region name (varies by languageCode)
     */
    public String name;
    /**
     * The number of cities in this region
     */
    public int numCities;
    /**
     * The region WikiData id
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
        RegionDetails othersame = ((RegionDetails) other);
        if ((capital!= othersame.capital)&&((capital == null)||(!capital.equals(othersame.capital)))) {
            return false;
        }
        if ((countryCode!= othersame.countryCode)&&((countryCode == null)||(!countryCode.equals(othersame.countryCode)))) {
            return false;
        }
        if ((fipsCode!= othersame.fipsCode)&&((fipsCode == null)||(!fipsCode.equals(othersame.fipsCode)))) {
            return false;
        }
        if ((isoCode!= othersame.isoCode)&&((isoCode == null)||(!isoCode.equals(othersame.isoCode)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (numCities!= othersame.numCities) {
            return false;
        }
        if ((wikiDataId!= othersame.wikiDataId)&&((wikiDataId == null)||(!wikiDataId.equals(othersame.wikiDataId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((capital == null)? 0 :capital.hashCode())+((countryCode == null)? 0 :countryCode.hashCode()))+((fipsCode == null)? 0 :fipsCode.hashCode()))+((isoCode == null)? 0 :isoCode.hashCode()))+((name == null)? 0 :name.hashCode()))+ numCities)+((wikiDataId == null)? 0 :wikiDataId.hashCode()));
    }
}
