package api.github.com.definitions;

public class Meta {
    public String[] git;
    public String[] hooks;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Meta othersame = ((Meta) other);
        if ((git!= othersame.git)&&((git == null)||(!git.equals(othersame.git)))) {
            return false;
        }
        if ((hooks!= othersame.hooks)&&((hooks == null)||(!hooks.equals(othersame.hooks)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((git == null)? 0 :git.hashCode())+((hooks == null)? 0 :hooks.hashCode()));
    }
}
