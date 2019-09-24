package api.github.com.definitions;

public class Blobs {
    public String sha;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Blobs othersame = ((Blobs) other);
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((sha == null)? 0 :sha.hashCode());
    }
}
