package www.googleapis.com.definitions;

public class Sponsor {
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#sponsor".
     */
    public String kind;
    /**
     * The snippet object contains basic details about the sponsor.
     */
    public SponsorSnippet snippet;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Sponsor othersame = ((Sponsor) other);
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
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
        return ((((etag == null)? 0 :etag.hashCode())+((kind == null)? 0 :kind.hashCode()))+((snippet == null)? 0 :snippet.hashCode()));
    }
}
