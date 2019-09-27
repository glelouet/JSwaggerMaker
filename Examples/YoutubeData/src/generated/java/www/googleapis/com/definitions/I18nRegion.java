package www.googleapis.com.definitions;

public class I18nRegion {
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube uses to uniquely identify the i18n region.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#i18nRegion".
     */
    public String kind;
    /**
     * The snippet object contains basic details about the i18n region, such as region code and human-readable name.
     */
    public I18nRegionSnippet snippet;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        I18nRegion othersame = ((I18nRegion) other);
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((etag == null)? 0 :etag.hashCode())+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((snippet == null)? 0 :snippet.hashCode()));
    }
}
