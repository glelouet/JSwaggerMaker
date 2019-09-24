package api.github.com.definitions.branch;

public class Links {
    public String html;
    public String self;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Links othersame = ((Links) other);
        if ((html!= othersame.html)&&((html == null)||(!html.equals(othersame.html)))) {
            return false;
        }
        if ((self!= othersame.self)&&((self == null)||(!self.equals(othersame.self)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((html == null)? 0 :html.hashCode())+((self == null)? 0 :self.hashCode()));
    }
}
