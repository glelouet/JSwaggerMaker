package api.github.com.definitions;

public class Team {
    public long id;
    public long members_count;
    public String name;
    public String permission;
    public long repos_count;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Team othersame = ((Team) other);
        if (id!= othersame.id) {
            return false;
        }
        if (members_count!= othersame.members_count) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((permission!= othersame.permission)&&((permission == null)||(!permission.equals(othersame.permission)))) {
            return false;
        }
        if (repos_count!= othersame.repos_count) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Long.hashCode(id)+ Long.hashCode(members_count))+((name == null)? 0 :name.hashCode()))+((permission == null)? 0 :permission.hashCode()))+ Long.hashCode(repos_count))+((url == null)? 0 :url.hashCode()));
    }
}
