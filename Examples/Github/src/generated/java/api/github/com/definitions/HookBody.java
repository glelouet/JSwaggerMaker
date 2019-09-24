package api.github.com.definitions;

public class HookBody {
    public boolean active;
    public String[] add_events;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        HookBody othersame = ((HookBody) other);
        if (active!= othersame.active) {
            return false;
        }
        if ((add_events!= othersame.add_events)&&((add_events == null)||(!add_events.equals(othersame.add_events)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(active)+((add_events == null)? 0 :add_events.hashCode()));
    }
}
