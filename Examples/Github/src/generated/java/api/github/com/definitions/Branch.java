package api.github.com.definitions;

import api.github.com.definitions.branch.Commit;
import api.github.com.definitions.branch.Links;

public class Branch {
    public Links _links;
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
        Branch othersame = ((Branch) other);
        if ((_links!= othersame._links)&&((_links == null)||(!_links.equals(othersame._links)))) {
            return false;
        }
        if ((commit!= othersame.commit)&&((commit == null)||(!commit.equals(othersame.commit)))) {
            return false;
        }
        if ((name!= othersame.name)&&((name == null)||(!name.equals(othersame.name)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((_links == null)? 0 :_links.hashCode())+((commit == null)? 0 :commit.hashCode()))+((name == null)? 0 :name.hashCode()));
    }
}
