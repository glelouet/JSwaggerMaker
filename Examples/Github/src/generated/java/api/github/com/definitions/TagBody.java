package api.github.com.definitions;

import api.github.com.definitions.branch.commit.commit.Author;
import api.github.com.structures.Type;

public class TagBody {
    /**
     * String of the tag message.
     */
    public String message;
    /**
     * String of the SHA of the git object this is tagging.
     */
    public String object;
    /**
     * The tag's name. This is typically a version (e.g., "v0.0.1").
     */
    public String tag;
    public Author tagger;
    /**
     * String of the type of the object we’re tagging. Normally this is a commit but it can also be a tree or a blob.
     */
    public Type type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        TagBody othersame = ((TagBody) other);
        if ((message!= othersame.message)&&((message == null)||(!message.equals(othersame.message)))) {
            return false;
        }
        if ((object!= othersame.object)&&((object == null)||(!object.equals(othersame.object)))) {
            return false;
        }
        if ((tag!= othersame.tag)&&((tag == null)||(!tag.equals(othersame.tag)))) {
            return false;
        }
        if ((tagger!= othersame.tagger)&&((tagger == null)||(!tagger.equals(othersame.tagger)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((message == null)? 0 :message.hashCode())+((object == null)? 0 :object.hashCode()))+((tag == null)? 0 :tag.hashCode()))+((tagger == null)? 0 :tagger.hashCode()))+((type == null)? 0 :type.hashCode()));
    }
}
