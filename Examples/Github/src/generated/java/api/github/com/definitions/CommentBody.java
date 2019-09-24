package api.github.com.definitions;

public class CommentBody {
    public String body;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CommentBody othersame = ((CommentBody) other);
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((body == null)? 0 :body.hashCode());
    }
}
