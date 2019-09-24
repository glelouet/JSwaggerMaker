package api.github.com.definitions;

import api.github.com.definitions.teamslist.Organization;

public class TeamsList {
    public long id;
    public long members_count;
    public String name;
    public Organization organization;
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
        TeamsList othersame = ((TeamsList) other);
        if (id!= othersame.id) {
            return false;
        }
        if (members_count!= othersame.members_count) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((organization!= othersame.organization)&&((organization == null)||(!organization.equals(othersame.organization)))) {
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
        return ((((((Long.hashCode(id)+ Long.hashCode(members_count))+((name == null)? 0 :name.hashCode()))+((organization == null)? 0 :organization.hashCode()))+((permission == null)? 0 :permission.hashCode()))+ Long.hashCode(repos_count))+((url == null)? 0 :url.hashCode()));
    }
}
