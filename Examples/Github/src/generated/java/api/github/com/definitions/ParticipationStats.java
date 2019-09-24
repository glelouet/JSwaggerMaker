package api.github.com.definitions;

public class ParticipationStats {
    public long[] all;
    public long[] owner;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        ParticipationStats othersame = ((ParticipationStats) other);
        if ((all!= othersame.all)&&((all == null)||(!all.equals(othersame.all)))) {
            return false;
        }
        if ((owner!= othersame.owner)&&((owner == null)||(!owner.equals(othersame.owner)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((all == null)? 0 :all.hashCode())+((owner == null)? 0 :owner.hashCode()));
    }
}
