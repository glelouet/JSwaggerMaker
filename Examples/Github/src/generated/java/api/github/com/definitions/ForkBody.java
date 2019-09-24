package api.github.com.definitions;

public class ForkBody {
    public String organization;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ForkBody othersame = ((ForkBody) other);
        if ((organization!= othersame.organization)&&((organization == null)||(!organization.equals(othersame.organization)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((organization == null)? 0 :organization.hashCode());
    }
}
