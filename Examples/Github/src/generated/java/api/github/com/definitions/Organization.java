package api.github.com.definitions;

public class Organization {
    public Actor actor;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Organization othersame = ((Organization) other);
        if ((actor!= othersame.actor)&&((actor == null)||(!actor.equals(othersame.actor)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((actor == null)? 0 :actor.hashCode());
    }
}
