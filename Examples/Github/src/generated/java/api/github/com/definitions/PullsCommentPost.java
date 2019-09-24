package api.github.com.definitions;

public class PullsCommentPost {
    public String body;
    public String commit_id;
    public String path;
    public double position;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        PullsCommentPost othersame = ((PullsCommentPost) other);
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if ((commit_id!= othersame.commit_id)&&((commit_id == null)||(!commit_id.equals(othersame.commit_id)))) {
            return false;
        }
        if ((path!= othersame.path)&&((path == null)||(!path.equals(othersame.path)))) {
            return false;
        }
        if (position!= othersame.position) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((body == null)? 0 :body.hashCode())+((commit_id == null)? 0 :commit_id.hashCode()))+((path == null)? 0 :path.hashCode()))+ Double.hashCode(position));
    }
}
