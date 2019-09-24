package api.github.com.definitions;

import api.github.com.definitions.branches.Commit;

public class Branches {
    public Commit commit;
    public String name;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Branches othersame = ((Branches) other);
        if ((commit!= othersame.commit)&&((commit == null)||(!commit.equals(othersame.commit)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((commit == null)? 0 :commit.hashCode())+((name == null)? 0 :name.hashCode()));
    }
}
