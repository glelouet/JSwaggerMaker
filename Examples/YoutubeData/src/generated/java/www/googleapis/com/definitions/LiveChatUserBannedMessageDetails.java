package www.googleapis.com.definitions;

import www.googleapis.com.structures.BanType;

public class LiveChatUserBannedMessageDetails {
    /**
     * The duration of the ban. This property is only present if the banType is temporary.
     */
    public String banDurationSeconds;
    /**
     * The type of ban.
     */
    public BanType banType;
    /**
     * The details of the user that was banned.
     */
    public ChannelProfileDetails bannedUserDetails;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        LiveChatUserBannedMessageDetails othersame = ((LiveChatUserBannedMessageDetails) other);
        if ((banDurationSeconds!= othersame.banDurationSeconds)&&((banDurationSeconds == null)||(!banDurationSeconds.equals(othersame.banDurationSeconds)))) {
            return false;
        }
        if ((banType!= othersame.banType)&&((banType == null)||(!banType.equals(othersame.banType)))) {
            return false;
        }
        if ((bannedUserDetails!= othersame.bannedUserDetails)&&((bannedUserDetails == null)||(!bannedUserDetails.equals(othersame.bannedUserDetails)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((banDurationSeconds == null)? 0 :banDurationSeconds.hashCode())+((banType == null)? 0 :banType.hashCode()))+((bannedUserDetails == null)? 0 :bannedUserDetails.hashCode()));
    }
}
