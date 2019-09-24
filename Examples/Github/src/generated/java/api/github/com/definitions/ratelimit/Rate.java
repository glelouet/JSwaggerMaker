package api.github.com.definitions.ratelimit;

public class Rate {
    public long limit;
    public long remaining;
    public long reset;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Rate othersame = ((Rate) other);
        if (limit!= othersame.limit) {
            return false;
        }
        if (remaining!= othersame.remaining) {
            return false;
        }
        if (reset!= othersame.reset) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Long.hashCode(limit)+ Long.hashCode(remaining))+ Long.hashCode(reset));
    }
}
