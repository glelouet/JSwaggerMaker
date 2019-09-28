package wft_geo_db.p.mashape.com.definitions;

public class RegionSummary {
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
        RegionSummary othersame = ((RegionSummary) other);
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
        if ((wikiDataId!= othersame.wikiDataId)&&((wikiDataId == null)||(!wikiDataId.equals(othersame.wikiDataId)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((countryCode == null)? 0 :countryCode.hashCode())+((fipsCode == null)? 0 :fipsCode.hashCode()))+((isoCode == null)? 0 :isoCode.hashCode()))+((name == null)? 0 :name.hashCode()))+((wikiDataId == null)? 0 :wikiDataId.hashCode()));
    }
}
