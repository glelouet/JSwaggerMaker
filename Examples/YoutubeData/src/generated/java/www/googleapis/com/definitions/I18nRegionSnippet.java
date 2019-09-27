package www.googleapis.com.definitions;

public class I18nRegionSnippet {
    /**
     * The region code as a 2-letter ISO country code.
     */
    public String gl;
    /**
     * The human-readable name of the region.
     */
    public String name;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        I18nRegionSnippet othersame = ((I18nRegionSnippet) other);
        if ((gl!= othersame.gl)&&((gl == null)||(!gl.equals(othersame.gl)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((gl == null)? 0 :gl.hashCode())+((name == null)? 0 :name.hashCode()));
    }
}
