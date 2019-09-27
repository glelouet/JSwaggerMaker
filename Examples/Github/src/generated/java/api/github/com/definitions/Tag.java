package api.github.com.definitions;

import api.github.com.definitions.branch.commit.commit.Author;
import api.github.com.definitions.tag.Object_;

public class Tag {
    /**
     * String of the tag message.
     */
    public String message;
    public Object_ object;
    public String sha;
    /**
     * The tag's name. This is typically a version (e.g., "v0.0.1").
     */
    public String tag;
    public Author tagger;
    public String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Tag othersame = ((Tag) other);
        if ((message!= othersame.message)&&((message == null)||(!message.equals(othersame.message)))) {
            return false;
        }
        if ((object!= othersame.object)&&((object == null)||(!object.equals(othersame.object)))) {
            return false;
        }
        if ((sha!= othersame.sha)&&((sha == null)||(!sha.equals(othersame.sha)))) {
            return false;
        }
        if ((tag!= othersame.tag)&&((tag == null)||(!tag.equals(othersame.tag)))) {
            return false;
        }
        if ((tagger!= othersame.tagger)&&((tagger == null)||(!tagger.equals(othersame.tagger)))) {
            return false;
        }
        if ((url!= othersame.url)&&((url == null)||(!url.equals(othersame.url)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((message == null)? 0 :message.hashCode())+((object == null)? 0 :object.hashCode()))+((sha == null)? 0 :sha.hashCode()))+((tag == null)? 0 :tag.hashCode()))+((tagger == null)? 0 :tagger.hashCode()))+((url == null)? 0 :url.hashCode()));
    }
}
