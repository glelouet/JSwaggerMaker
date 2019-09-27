package www.googleapis.com.definitions;

import www.googleapis.com.structures.Type;

public class LiveChatBanSnippet {
    /**
     * The duration of a ban, only filled if the ban has type TEMPORARY.
     */
    public String banDurationSeconds;
    public ChannelProfileDetails bannedUserDetails;
    /**
     * The chat this ban is pertinent to.
     */
    public String liveChatId;
    /**
     * The type of ban.
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
        LiveChatBanSnippet othersame = ((LiveChatBanSnippet) other);
        if ((banDurationSeconds!= othersame.banDurationSeconds)&&((banDurationSeconds == null)||(!banDurationSeconds.equals(othersame.banDurationSeconds)))) {
            return false;
        }
        if ((bannedUserDetails!= othersame.bannedUserDetails)&&((bannedUserDetails == null)||(!bannedUserDetails.equals(othersame.bannedUserDetails)))) {
            return false;
        }
        if ((liveChatId!= othersame.liveChatId)&&((liveChatId == null)||(!liveChatId.equals(othersame.liveChatId)))) {
            return false;
        }
        if ((type!= othersame.type)&&((type == null)||(!type.equals(othersame.type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((banDurationSeconds == null)? 0 :banDurationSeconds.hashCode())+((bannedUserDetails == null)? 0 :bannedUserDetails.hashCode()))+((liveChatId == null)? 0 :liveChatId.hashCode()))+((type == null)? 0 :type.hashCode()));
    }
}
