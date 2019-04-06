package esi.evetech.net.responses;

public class get_fw_leaderboards {
    /**
     * Top 4 rankings of factions by number of kills from yesterday, last week and in total
     */
    public get_fw_leaderboards_kills kills;
    /**
     * Top 4 rankings of factions by victory points from yesterday, last week and in total
     */
    public get_fw_leaderboards_kills victory_points;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_fw_leaderboards othersame = ((get_fw_leaderboards) other);
        if ((kills!= othersame.kills)&&((kills == null)||(!kills.equals(othersame.kills)))) {
            return false;
        }
        if ((victory_points!= othersame.victory_points)&&((victory_points == null)||(!victory_points.equals(othersame.victory_points)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((kills == null)? 0 :kills.hashCode())+((victory_points == null)? 0 :victory_points.hashCode()));
    }
}
