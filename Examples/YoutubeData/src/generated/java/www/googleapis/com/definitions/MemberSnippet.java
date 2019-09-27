package www.googleapis.com.definitions;

public class MemberSnippet {
    /**
     * The id of the channel that's offering memberships.
     */
    public String creatorChannelId;
    /**
     * Details about the member.
     */
    public ChannelProfileDetails memberDetails;
    /**
     * Details about the user's membership.
     */
    public MembershipsDetails membershipsDetails;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        MemberSnippet othersame = ((MemberSnippet) other);
        if ((creatorChannelId!= othersame.creatorChannelId)&&((creatorChannelId == null)||(!creatorChannelId.equals(othersame.creatorChannelId)))) {
            return false;
        }
        if ((memberDetails!= othersame.memberDetails)&&((memberDetails == null)||(!memberDetails.equals(othersame.memberDetails)))) {
            return false;
        }
        if ((membershipsDetails!= othersame.membershipsDetails)&&((membershipsDetails == null)||(!membershipsDetails.equals(othersame.membershipsDetails)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((creatorChannelId == null)? 0 :creatorChannelId.hashCode())+((memberDetails == null)? 0 :memberDetails.hashCode()))+((membershipsDetails == null)? 0 :membershipsDetails.hashCode()));
    }
}
