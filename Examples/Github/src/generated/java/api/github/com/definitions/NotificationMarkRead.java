package api.github.com.definitions;

public class NotificationMarkRead {
    public String last_read_at;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        NotificationMarkRead othersame = ((NotificationMarkRead) other);
        if ((last_read_at!= othersame.last_read_at)&&((last_read_at == null)||(!last_read_at.equals(othersame.last_read_at)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((last_read_at == null)? 0 :last_read_at.hashCode());
    }
}
