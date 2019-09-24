package api.github.com.definitions;

public class User {
    public Actor actor;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        User othersame = ((User) other);
        if ((actor!= othersame.actor)&&((actor == null)||(!actor.equals(othersame.actor)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((actor == null)? 0 :actor.hashCode());
    }
}
