package api.github.com.definitions.branches;

public class Commit {
    public String sha;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Commit othersame = ((Commit) other);
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((sha == null)? 0 :sha.hashCode())+((url == null)? 0 :url.hashCode()));
    }
}
