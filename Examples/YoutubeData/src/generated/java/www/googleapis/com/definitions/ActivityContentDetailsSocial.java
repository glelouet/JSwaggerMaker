package www.googleapis.com.definitions;

import www.googleapis.com.structures.Type;

public class ActivityContentDetailsSocial {
    /**
     * The author of the social network post.
     */
    public String author;
    /**
     * An image of the post's author.
     */
    public String imageUrl;
    /**
     * The URL of the social network post.
     */
    public String referenceUrl;
    /**
     * The resourceId object encapsulates information that identifies the resource associated with a social network post.
     */
    public ResourceId resourceId;
    /**
     * The name of the social network.
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
        ActivityContentDetailsSocial othersame = ((ActivityContentDetailsSocial) other);
        if ((author!= othersame.author)&&((author == null)||(!author.equals(othersame.author)))) {
            return false;
        }
        if ((imageUrl!= othersame.imageUrl)&&((imageUrl == null)||(!imageUrl.equals(othersame.imageUrl)))) {
            return false;
        }
        if ((referenceUrl!= othersame.referenceUrl)&&((referenceUrl == null)||(!referenceUrl.equals(othersame.referenceUrl)))) {
            return false;
        }
        if ((resourceId!= othersame.resourceId)&&((resourceId == null)||(!resourceId.equals(othersame.resourceId)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((author == null)? 0 :author.hashCode())+((imageUrl == null)? 0 :imageUrl.hashCode()))+((referenceUrl == null)? 0 :referenceUrl.hashCode()))+((resourceId == null)? 0 :resourceId.hashCode()))+((type == null)? 0 :type.hashCode()));
    }
}
