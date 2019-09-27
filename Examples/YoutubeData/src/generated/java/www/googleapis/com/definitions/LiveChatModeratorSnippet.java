package www.googleapis.com.definitions;

public class LiveChatModeratorSnippet {
    /**
     * The ID of the live chat this moderator can act on.
     */
    public String liveChatId;
    /**
     * Details about the moderator.
     */
    public ChannelProfileDetails moderatorDetails;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatModeratorSnippet othersame = ((LiveChatModeratorSnippet) other);
        if ((liveChatId!= othersame.liveChatId)&&((liveChatId == null)||(!liveChatId.equals(othersame.liveChatId)))) {
            return false;
        }
        if ((moderatorDetails!= othersame.moderatorDetails)&&((moderatorDetails == null)||(!moderatorDetails.equals(othersame.moderatorDetails)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((liveChatId == null)? 0 :liveChatId.hashCode())+((moderatorDetails == null)? 0 :moderatorDetails.hashCode()));
    }
}
