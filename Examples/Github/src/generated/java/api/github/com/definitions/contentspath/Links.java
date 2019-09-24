package api.github.com.definitions.contentspath;

public class Links {
    public String git;
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
        if ((git!= othersame.git)&&((git == null)||(!git.equals(othersame.git)))) {
            return false;
        }
        if ((html!= othersame.html)&&((html == null)||(!html.equals(othersame.html)))) {
            return false;
        }
        if ((self!= othersame.self)&&((self == null)||(!self.equals(othersame.self)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((git == null)? 0 :git.hashCode())+((html == null)? 0 :html.hashCode()))+((self == null)? 0 :self.hashCode()));
    }
}
