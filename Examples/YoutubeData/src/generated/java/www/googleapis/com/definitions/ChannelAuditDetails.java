package www.googleapis.com.definitions;

public class ChannelAuditDetails {
    /**
     * Whether or not the channel respects the community guidelines.
     */
    public boolean communityGuidelinesGoodStanding;
    /**
     * Whether or not the channel has any unresolved claims.
     */
    public boolean contentIdClaimsGoodStanding;
    /**
     * Whether or not the channel has any copyright strikes.
     */
    public boolean copyrightStrikesGoodStanding;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ChannelAuditDetails othersame = ((ChannelAuditDetails) other);
        if (communityGuidelinesGoodStanding!= othersame.communityGuidelinesGoodStanding) {
            return false;
        }
        if (contentIdClaimsGoodStanding!= othersame.contentIdClaimsGoodStanding) {
            return false;
        }
        if (copyrightStrikesGoodStanding!= othersame.copyrightStrikesGoodStanding) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Boolean.hashCode(communityGuidelinesGoodStanding)+ Boolean.hashCode(contentIdClaimsGoodStanding))+ Boolean.hashCode(copyrightStrikesGoodStanding));
    }
}
