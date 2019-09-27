package www.googleapis.com.definitions;

public class SponsorSnippet {
    /**
     * The id of the channel being sponsored.
     */
    public String channelId;
    /**
     * The cumulative time a user has been a sponsor in months.
     */
    public int cumulativeDurationMonths;
    /**
     * Details about the sponsor.
     */
    public ChannelProfileDetails sponsorDetails;
    /**
     * The date and time when the user became a sponsor. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
     */
    public String sponsorSince;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        SponsorSnippet othersame = ((SponsorSnippet) other);
        if ((channelId!= othersame.channelId)&&((channelId == null)||(!channelId.equals(othersame.channelId)))) {
            return false;
        }
        if (cumulativeDurationMonths!= othersame.cumulativeDurationMonths) {
            return false;
        }
        if ((sponsorDetails!= othersame.sponsorDetails)&&((sponsorDetails == null)||(!sponsorDetails.equals(othersame.sponsorDetails)))) {
            return false;
        }
        if ((sponsorSince!= othersame.sponsorSince)&&((sponsorSince == null)||(!sponsorSince.equals(othersame.sponsorSince)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((channelId == null)? 0 :channelId.hashCode())+ cumulativeDurationMonths)+((sponsorDetails == null)? 0 :sponsorDetails.hashCode()))+((sponsorSince == null)? 0 :sponsorSince.hashCode()));
    }
}
