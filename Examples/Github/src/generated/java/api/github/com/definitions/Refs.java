package api.github.com.definitions;

public class Refs {
    public api.github.com.definitions.refs.Object object;
    public String ref;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Refs othersame = ((Refs) other);
        if ((object!= othersame.object)&&((object == null)||(!object.equals(othersame.object)))) {
            return false;
        }
        if ((ref!= othersame.ref)&&((ref == null)||(!ref.equals(othersame.ref)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((object == null)? 0 :object.hashCode())+((ref == null)? 0 :ref.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
