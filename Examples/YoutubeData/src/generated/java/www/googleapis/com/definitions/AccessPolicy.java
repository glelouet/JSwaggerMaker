package www.googleapis.com.definitions;

public class AccessPolicy {
    /**
     * The value of allowed indicates whether the access to the policy is allowed or denied by default.
     */
    public boolean allowed;
    /**
     * A list of region codes that identify countries where the default policy do not apply.
     */
    public String[] exception;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        AccessPolicy othersame = ((AccessPolicy) other);
        if (allowed!= othersame.allowed) {
            return false;
        }
        if ((exception!= othersame.exception)&&((exception == null)||(!exception.equals(othersame.exception)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(allowed)+((exception == null)? 0 :exception.hashCode()));
    }
}
