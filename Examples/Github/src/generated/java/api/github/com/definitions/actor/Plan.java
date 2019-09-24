package api.github.com.definitions.actor;

public class Plan {
    public long collaborators;
    public String name;
    public long private_repos;
    public long space;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Plan othersame = ((Plan) other);
        if (collaborators!= othersame.collaborators) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if (private_repos!= othersame.private_repos) {
            return false;
        }
        if (space!= othersame.space) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(collaborators)+((name == null)? 0 :name.hashCode()))+ Long.hashCode(private_repos))+ Long.hashCode(space));
    }
}
