package api.github.com.definitions.feeds.links;

public class Currentuser {
    public String href;
    public String type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Currentuser othersame = ((Currentuser) other);
        if ((href!= othersame.href)&&((href == null)||(!href.equals(othersame.href)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((href == null)? 0 :href.hashCode())+((type == null)? 0 :type.hashCode()));
    }
}
