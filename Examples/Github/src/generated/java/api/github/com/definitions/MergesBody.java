package api.github.com.definitions;

public class MergesBody {
    public String base;
    public String commit_message;
    public String head;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        MergesBody othersame = ((MergesBody) other);
        if ((base!= othersame.base)&&((base == null)||(!base.equals(othersame.base)))) {
            return false;
        }
        if ((commit_message!= othersame.commit_message)&&((commit_message == null)||(!commit_message.equals(othersame.commit_message)))) {
            return false;
        }
        if ((head!= othersame.head)&&((head == null)||(!head.equals(othersame.head)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((base == null)? 0 :base.hashCode())+((commit_message == null)? 0 :commit_message.hashCode()))+((head == null)? 0 :head.hashCode()));
    }
}
