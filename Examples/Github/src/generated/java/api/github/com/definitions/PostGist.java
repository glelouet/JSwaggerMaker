package api.github.com.definitions;

import api.github.com.definitions.postgist.Files;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostGist {
    public String description;
    public Files files;
    @JsonProperty("public")
    public boolean _public;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PostGist othersame = ((PostGist) other);
        if ((description!= othersame.description)&&((description == null)||(!description.equals(othersame.description)))) {
            return false;
        }
        if ((files!= othersame.files)&&((files == null)||(!files.equals(othersame.files)))) {
            return false;
        }
        if (_public!= othersame._public) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((description == null)? 0 :description.hashCode())+((files == null)? 0 :files.hashCode()))+ Boolean.hashCode(_public));
    }
}
