package esi.evetech.net.responses.getsovereigntycampaigns;

public class GetSovereigntyCampaignsParticipants {
    /**
     * alliance_id integer
     */
    public int alliance_id;
    /**
     * score number
     */
    public float score;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetSovereigntyCampaignsParticipants othersame = ((GetSovereigntyCampaignsParticipants) other);
        if (alliance_id!= othersame.alliance_id) {
            return false;
        }
        if (score!= othersame.score) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (alliance_id + Double.hashCode(score));
    }
}
