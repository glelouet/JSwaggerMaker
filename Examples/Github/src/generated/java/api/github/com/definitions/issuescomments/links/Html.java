package api.github.com.definitions.issuescomments.links;

public class Html {
    public String href;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Html othersame = ((Html) other);
        if ((href!= othersame.href)&&((href == null)||(!href.equals(othersame.href)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((href == null)? 0 :href.hashCode());
    }
}
