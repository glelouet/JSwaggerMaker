package api.github.com.definitions.gist.history;

public class ChangeStatus {
    public long additions;
    public long deletions;
    public long total;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChangeStatus othersame = ((ChangeStatus) other);
        if (additions!= othersame.additions) {
            return false;
        }
        if (deletions!= othersame.deletions) {
            return false;
        }
        if (total!= othersame.total) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Long.hashCode(additions)+ Long.hashCode(deletions))+ Long.hashCode(total));
    }
}
