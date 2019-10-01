package api.apis.guru.definitions;

import java.util.Map;

public class API {
    /**
     * Timestamp when the API was first added to the directory
     */
    public String added;
    /**
     * Recommended version
     */
    public String preferred;
    /**
     * List of supported versions of the API
     */
    public Map<String, ApiVersion> versions;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        API othersame = ((API) other);
        if ((added!= othersame.added)&&((added == null)||(!added.equals(othersame.added)))) {
            return false;
        }
        if ((preferred!= othersame.preferred)&&((preferred == null)||(!preferred.equals(othersame.preferred)))) {
            return false;
        }
        if ((versions!= othersame.versions)&&((versions == null)||(!versions.equals(othersame.versions)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((added == null)? 0 :added.hashCode())+((preferred == null)? 0 :preferred.hashCode()))+((versions == null)? 0 :versions.hashCode()));
    }
}
