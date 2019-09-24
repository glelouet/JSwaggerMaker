package api.github.com.definitions;

public class Merge {
    public boolean merged;
    public String message;
    public String sha;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Merge othersame = ((Merge) other);
        if (merged!= othersame.merged) {
            return false;
        }
        if ((message!= othersame.message)&&((message == null)||(!message.equals(othersame.message)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Boolean.hashCode(merged)+((message == null)? 0 :message.hashCode()))+((sha == null)? 0 :sha.hashCode()));
    }
}
