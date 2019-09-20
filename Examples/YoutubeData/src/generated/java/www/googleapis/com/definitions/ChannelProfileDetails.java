package www.googleapis.com.definitions;

public class ChannelProfileDetails {
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
        ChannelProfileDetails othersame = ((ChannelProfileDetails) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if ((channelUrl!= othersame.channelUrl)&&((channelUrl == null)||(!channelUrl.equals(othersame.channelUrl)))) {
            return false;
        }
        if ((displayName!= othersame.displayName)&&((displayName == null)||(!displayName.equals(othersame.displayName)))) {
            return false;
        }
        if ((profileImageUrl!= othersame.profileImageUrl)&&((profileImageUrl == null)||(!profileImageUrl.equals(othersame.profileImageUrl)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((channelId == null)? 0 :channelId.hashCode())+((channelUrl == null)? 0 :channelUrl.hashCode()))+((displayName == null)? 0 :displayName.hashCode()))+((profileImageUrl == null)? 0 :profileImageUrl.hashCode()));
    }
}
