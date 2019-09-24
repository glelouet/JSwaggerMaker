package api.github.com.definitions.refs;

public class Object {
    public String sha;
    public String type;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Object othersame = ((Object) other);
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((sha == null)? 0 :sha.hashCode())+((type == null)? 0 :type.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
