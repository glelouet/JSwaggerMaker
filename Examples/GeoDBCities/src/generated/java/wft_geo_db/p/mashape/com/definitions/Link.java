package wft_geo_db.p.mashape.com.definitions;

public class Link {
    public String href;
    public String rel;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Link othersame = ((Link) other);
        if ((href!= othersame.href)&&((href == null)||(!href.equals(othersame.href)))) {
            return false;
        }
        if ((rel!= othersame.rel)&&((rel == null)||(!rel.equals(othersame.rel)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((href == null)? 0 :href.hashCode())+((rel == null)? 0 :rel.hashCode()));
    }
}
