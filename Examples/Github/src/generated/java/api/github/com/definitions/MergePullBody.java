package api.github.com.definitions;

public class MergePullBody {
    public String commit_message;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        MergePullBody othersame = ((MergePullBody) other);
        if ((commit_message!= othersame.commit_message)&&((commit_message == null)||(!commit_message.equals(othersame.commit_message)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((commit_message == null)? 0 :commit_message.hashCode());
    }
}
