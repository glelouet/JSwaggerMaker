package wft_geo_db.p.mashape.com.definitions;

public class CurrencyDescriptor {
    /**
     * A ISO-4217 currency code
     */
    public String code;
    /**
     * A list of ISO-3166 country codes
     */
    public String[] countryCodes;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CurrencyDescriptor othersame = ((CurrencyDescriptor) other);
        if ((code!= othersame.code)&&((code == null)||(!code.equals(othersame.code)))) {
            return false;
        }
        if ((countryCodes!= othersame.countryCodes)&&((countryCodes == null)||(!countryCodes.equals(othersame.countryCodes)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((code == null)? 0 :code.hashCode())+((countryCodes == null)? 0 :countryCodes.hashCode()));
    }
}
