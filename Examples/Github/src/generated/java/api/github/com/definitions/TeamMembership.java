package api.github.com.definitions;

public class TeamMembership {
    public String state;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        TeamMembership othersame = ((TeamMembership) other);
        if ((state!= othersame.state)&&((state == null)||(!state.equals(othersame.state)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((state == null)? 0 :state.hashCode())+((url == null)? 0 :url.hashCode()));
    }
}
