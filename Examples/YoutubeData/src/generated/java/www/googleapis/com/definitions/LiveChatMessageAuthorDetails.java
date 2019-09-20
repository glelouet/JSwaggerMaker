package www.googleapis.com.definitions;

public class LiveChatMessageAuthorDetails {
    /**
     * The YouTube channel ID.
     */
    public String channelId;
    /**
     * The channel's URL.
     */
    public String channelUrl;
    /**
     * The channel's display name.
     */
    public String displayName;
    /**
     * Whether the author is a moderator of the live chat.
     */
    public boolean isChatModerator;
    /**
     * Whether the author is the owner of the live chat.
     */
    public boolean isChatOwner;
    /**
     * Whether the author is a sponsor of the live chat.
     */
    public boolean isChatSponsor;
    /**
     * Whether the author's identity has been verified by YouTube.
     */
    public boolean isVerified;
    /**
     * The channels's avatar URL.
     */
    public String profileImageUrl;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatMessageAuthorDetails othersame = ((LiveChatMessageAuthorDetails) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((channelUrl!= othersame.channelUrl)&&((channelUrl == null)||(!channelUrl.equals(othersame.channelUrl)))) {
            return false;
        }
        if ((displayName!= othersame.displayName)&&((displayName == null)||(!displayName.equals(othersame.displayName)))) {
            return false;
        }
        if (isChatModerator!= othersame.isChatModerator) {
            return false;
        }
        if (isChatOwner!= othersame.isChatOwner) {
            return false;
        }
        if (isChatSponsor!= othersame.isChatSponsor) {
            return false;
        }
        if (isVerified!= othersame.isVerified) {
            return false;
        }
        if ((profileImageUrl!= othersame.profileImageUrl)&&((profileImageUrl == null)||(!profileImageUrl.equals(othersame.profileImageUrl)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((channelId == null)? 0 :channelId.hashCode())+((channelUrl == null)? 0 :channelUrl.hashCode()))+((displayName == null)? 0 :displayName.hashCode()))+ Boolean.hashCode(isChatModerator))+ Boolean.hashCode(isChatOwner))+ Boolean.hashCode(isChatSponsor))+ Boolean.hashCode(isVerified))+((profileImageUrl == null)? 0 :profileImageUrl.hashCode()));
    }
}
