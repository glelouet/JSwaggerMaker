package api.github.com.definitions;

import api.github.com.structures.Permission;

public class OrgTeamsPost {
    public String name;
    public Permission permission;
    public String[] repo_names;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        OrgTeamsPost othersame = ((OrgTeamsPost) other);
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        if ((permission!= othersame.permission)&&((permission == null)||(!permission.equals(othersame.permission)))) {
            return false;
        }
        if ((repo_names!= othersame.repo_names)&&((repo_names == null)||(!repo_names.equals(othersame.repo_names)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((name == null)? 0 :name.hashCode())+((permission == null)? 0 :permission.hashCode()))+((repo_names == null)? 0 :repo_names.hashCode()));
    }
}
