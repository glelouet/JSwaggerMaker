package api.github.com.definitions;

public class CommitCommentBody {
    public String body;
    /**
     * Deprecated - Use position parameter instead.
     */
    public String line;
    /**
     * Line number in the file to comment on. Defaults to null.
     */
    public String number;
    /**
     * Relative path of the file to comment on.
     */
    public String path;
    /**
     * Line index in the diff to comment on.
     */
    public long position;
    /**
     * SHA of the commit to comment on.
     */
    public String sha;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CommitCommentBody othersame = ((CommitCommentBody) other);
        if ((body!= othersame.body)&&((body == null)||(!body.equals(othersame.body)))) {
            return false;
        }
        if ((line!= othersame.line)&&((line == null)||(!line.equals(othersame.line)))) {
            return false;
        }
        if ((number!= othersame.number)&&((number == null)||(!number.equals(othersame.number)))) {
            return false;
        }
        if ((path!= othersame.path)&&((path == null)||(!path.equals(othersame.path)))) {
            return false;
        }
        if (position!= othersame.position) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((body == null)? 0 :body.hashCode())+((line == null)? 0 :line.hashCode()))+((number == null)? 0 :number.hashCode()))+((path == null)? 0 :path.hashCode()))+ Long.hashCode(position))+((sha == null)? 0 :sha.hashCode()));
    }
}
