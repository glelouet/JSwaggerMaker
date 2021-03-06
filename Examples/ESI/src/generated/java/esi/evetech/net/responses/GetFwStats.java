package esi.evetech.net.responses;

import esi.evetech.net.responses.getcharacterscharacteridfwstats.GetCharactersCharacterIdFwStatsKills;

public class GetFwStats {
    /**
     * faction_id integer
     */
    public int faction_id;
    /**
     * Summary of kills against an enemy faction for the given faction
     */
    public GetCharactersCharacterIdFwStatsKills kills;
    /**
     * How many pilots fight for the given faction
     */
    public int pilots;
    /**
     * The number of solar systems controlled by the given faction
     */
    public int systems_controlled;
    /**
     * Summary of victory points gained for the given faction
     */
    public GetCharactersCharacterIdFwStatsKills victory_points;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetFwStats othersame = ((GetFwStats) other);
        if (faction_id!= othersame.faction_id) {
            return false;
        }
        if ((kills!= othersame.kills)&&((kills == null)||(!kills.equals(othersame.kills)))) {
            return false;
        }
        if (pilots!= othersame.pilots) {
            return false;
        }
        if (systems_controlled!= othersame.systems_controlled) {
            return false;
        }
        if ((victory_points!= othersame.victory_points)&&((victory_points == null)||(!victory_points.equals(othersame.victory_points)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((faction_id +((kills == null)? 0 :kills.hashCode()))+ pilots)+ systems_controlled)+((victory_points == null)? 0 :victory_points.hashCode()));
    }
}
