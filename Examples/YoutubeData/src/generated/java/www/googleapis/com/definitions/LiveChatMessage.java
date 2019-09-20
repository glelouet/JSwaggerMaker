package www.googleapis.com.definitions;

public class LiveChatMessage {
    /**
     * The authorDetails object contains basic details about the user that posted this message.
     */
    public LiveChatMessageAuthorDetails authorDetails;
    /**
     * Etag of this resource.
     */
    public String etag;
    /**
     * The ID that YouTube assigns to uniquely identify the message.
     */
    public String id;
    /**
     * Identifies what kind of resource this is. Value: the fixed string "youtube#liveChatMessage".
     */
    public String kind;
    /**
     * The snippet object contains basic details about the message.
     */
    public LiveChatMessageSnippet snippet;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatMessage othersame = ((LiveChatMessage) other);
        if ((authorDetails!= othersame.authorDetails)&&((authorDetails == null)||(!authorDetails.equals(othersame.authorDetails)))) {
            return false;
        }
        if ((etag!= othersame.etag)&&((etag == null)||(!etag.equals(othersame.etag)))) {
            return false;
        }
        if ((id!= othersame.id)&&((id == null)||(!id.equals(othersame.id)))) {
            return false;
        }
        if ((kind!= othersame.kind)&&((kind == null)||(!kind.equals(othersame.kind)))) {
            return false;
        }
        if ((snippet!= othersame.snippet)&&((snippet == null)||(!snippet.equals(othersame.snippet)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((authorDetails == null)? 0 :authorDetails.hashCode())+((etag == null)? 0 :etag.hashCode()))+((id == null)? 0 :id.hashCode()))+((kind == null)? 0 :kind.hashCode()))+((snippet == null)? 0 :snippet.hashCode()));
    }
}
