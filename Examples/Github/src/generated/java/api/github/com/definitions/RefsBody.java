package api.github.com.definitions;

public class RefsBody {
    public String ref;
    public String sha;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        RefsBody othersame = ((RefsBody) other);
        if ((ref!= othersame.ref)&&((ref == null)||(!ref.equals(othersame.ref)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((ref == null)? 0 :ref.hashCode())+((sha == null)? 0 :sha.hashCode()));
    }
}
