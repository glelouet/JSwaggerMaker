package wft_geo_db.p.mashape.com.definitions;

public class LocaleDescriptor {
    /**
     * The locale code
     */
    public String code;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LocaleDescriptor othersame = ((LocaleDescriptor) other);
        if ((code!= othersame.code)&&((code == null)||(!code.equals(othersame.code)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((code == null)? 0 :code.hashCode());
    }
}
