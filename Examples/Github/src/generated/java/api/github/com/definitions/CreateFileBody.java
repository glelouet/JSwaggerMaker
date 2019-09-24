package api.github.com.definitions;

import api.github.com.definitions.createfilebody.Committer;

public class CreateFileBody {
    public Committer committer;
    public String content;
    public String message;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        CreateFileBody othersame = ((CreateFileBody) other);
        if ((committer!= othersame.committer)&&((committer == null)||(!committer.equals(othersame.committer)))) {
            return false;
        }
        if ((content!= othersame.content)&&((content == null)||(!content.equals(othersame.content)))) {
            return false;
        }
        if ((message!= othersame.message)&&((message == null)||(!message.equals(othersame.message)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((committer == null)? 0 :committer.hashCode())+((content == null)? 0 :content.hashCode()))+((message == null)? 0 :message.hashCode()));
    }
}
