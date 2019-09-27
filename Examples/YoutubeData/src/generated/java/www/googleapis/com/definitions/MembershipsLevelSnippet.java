package www.googleapis.com.definitions;

public class MembershipsLevelSnippet {
    /**
     * The id of the channel that's offering channel memberships.
     */
    public String creatorChannelId;
    public LevelDetails levelDetails;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        MembershipsLevelSnippet othersame = ((MembershipsLevelSnippet) other);
        if ((creatorChannelId!= othersame.creatorChannelId)&&((creatorChannelId == null)||(!creatorChannelId.equals(othersame.creatorChannelId)))) {
            return false;
        }
        if ((levelDetails!= othersame.levelDetails)&&((levelDetails == null)||(!levelDetails.equals(othersame.levelDetails)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((creatorChannelId == null)? 0 :creatorChannelId.hashCode())+((levelDetails == null)? 0 :levelDetails.hashCode()));
    }
}
