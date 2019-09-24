package api.github.com.definitions;

import api.github.com.definitions.createfilebody.Committer;

public class DeleteFileBody {
    public Committer committer;
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
        DeleteFileBody othersame = ((DeleteFileBody) other);
        if ((committer!= othersame.committer)&&((committer == null)||(!committer.equals(othersame.committer)))) {
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
        return ((((committer == null)? 0 :committer.hashCode())+((message == null)? 0 :message.hashCode()))+((sha == null)? 0 :sha.hashCode()));
    }
}
