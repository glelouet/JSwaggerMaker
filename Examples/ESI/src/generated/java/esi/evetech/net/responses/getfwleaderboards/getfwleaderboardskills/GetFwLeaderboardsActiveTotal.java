package esi.evetech.net.responses.getfwleaderboards.getfwleaderboardskills;

public class GetFwLeaderboardsActiveTotal {
    /**
     * Amount of kills
     */
    public int amount;
    /**
     * faction_id integer
     */
    public int faction_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetFwLeaderboardsActiveTotal othersame = ((GetFwLeaderboardsActiveTotal) other);
        if (amount!= othersame.amount) {
            return false;
        }
        if (faction_id!= othersame.faction_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (amount + faction_id);
    }
}
