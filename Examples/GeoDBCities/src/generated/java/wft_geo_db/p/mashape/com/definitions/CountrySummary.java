package wft_geo_db.p.mashape.com.definitions;

public class CountrySummary {
    /**
     * The ISO-3166 country code
     */
    public String code;
    /**
     * A list of supported ISO-4217 currency codes
     */
    public String[] currencyCodes;
    /**
     * The country name (varies by languageCode)
     */
    public String name;
    /**
     * The country WikiData id
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
        CountrySummary othersame = ((CountrySummary) other);
        if ((code!= othersame.code)&&((code == null)||(!code.equals(othersame.code)))) {
            return false;
        }
        if ((currencyCodes!= othersame.currencyCodes)&&((currencyCodes == null)||(!currencyCodes.equals(othersame.currencyCodes)))) {
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
        return (((((code == null)? 0 :code.hashCode())+((currencyCodes == null)? 0 :currencyCodes.hashCode()))+((name == null)? 0 :name.hashCode()))+((wikiDataId == null)? 0 :wikiDataId.hashCode()));
    }
}
