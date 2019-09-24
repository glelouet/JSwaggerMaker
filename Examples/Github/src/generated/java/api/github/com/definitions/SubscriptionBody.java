package api.github.com.definitions;

public class SubscriptionBody {
    public boolean ignored;
    public boolean subscribed;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SubscriptionBody othersame = ((SubscriptionBody) other);
        if (ignored!= othersame.ignored) {
            return false;
        }
        if (subscribed!= othersame.subscribed) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(ignored)+ Boolean.hashCode(subscribed));
    }
}
