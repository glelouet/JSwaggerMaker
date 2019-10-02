package www.googleapis.com.definitions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThumbnailDetails {
    /**
     * The default image for this resource.
     */
    @JsonProperty("default")
    public Thumbnail default_;
    /**
     * The high quality image for this resource.
     */
    public Thumbnail high;
    /**
     * The maximum resolution quality image for this resource.
     */
    public Thumbnail maxres;
    /**
     * The medium quality image for this resource.
     */
    public Thumbnail medium;
    /**
     * The standard quality image for this resource.
     */
    public Thumbnail standard;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ThumbnailDetails othersame = ((ThumbnailDetails) other);
        if ((default_!= othersame.default_)&&((default_ == null)||(!default_.equals(othersame.default_)))) {
            return false;
        }
        if ((high!= othersame.high)&&((high == null)||(!high.equals(othersame.high)))) {
            return false;
        }
        if ((maxres!= othersame.maxres)&&((maxres == null)||(!maxres.equals(othersame.maxres)))) {
            return false;
        }
        if ((medium!= othersame.medium)&&((medium == null)||(!medium.equals(othersame.medium)))) {
            return false;
        }
        if ((standard!= othersame.standard)&&((standard == null)||(!standard.equals(othersame.standard)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((default_ == null)? 0 :default_.hashCode())+((high == null)? 0 :high.hashCode()))+((maxres == null)? 0 :maxres.hashCode()))+((medium == null)? 0 :medium.hashCode()))+((standard == null)? 0 :standard.hashCode()));
    }
}
