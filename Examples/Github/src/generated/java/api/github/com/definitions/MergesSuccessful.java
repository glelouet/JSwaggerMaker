package api.github.com.definitions;

public class MergesSuccessful {
    public User author;
    public String comments_url;
    public api.github.com.definitions.mergessuccessful.Commit commit;
    public User committer;
    public boolean merged;
    public String message;
    public api.github.com.definitions.branches.Commit[] parents;
    public String sha;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        MergesSuccessful othersame = ((MergesSuccessful) other);
        if ((author!= othersame.author)&&((author == null)||(!author.equals(othersame.author)))) {
            return false;
        }
        if ((comments_url!= othersame.comments_url)&&((comments_url == null)||(!comments_url.equals(othersame.comments_url)))) {
            return false;
        }
        if ((commit!= othersame.commit)&&((commit == null)||(!commit.equals(othersame.commit)))) {
            return false;
        }
        if ((committer!= othersame.committer)&&((committer == null)||(!committer.equals(othersame.committer)))) {
            return false;
        }
        if (merged!= othersame.merged) {
            return false;
        }
        if ((message!= othersame.message)&&((message == null)||(!message.equals(othersame.message)))) {
            return false;
        }
        if ((parents!= othersame.parents)&&((parents == null)||(!parents.equals(othersame.parents)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((author == null)? 0 :author.hashCode())+((comments_url == null)? 0 :comments_url.hashCode()))+((commit == null)? 0 :commit.hashCode()))+((committer == null)? 0 :committer.hashCode()))+ Boolean.hashCode(merged))+((message == null)? 0 :message.hashCode()))+((parents == null)? 0 :parents.hashCode()))+((sha == null)? 0 :sha.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
