package esi.evetech.net.responses.getkillmailskillmailidkillmailhash;

public class GetKillmailsKillmailIdKillmailHashAttackers {
    /**
     * alliance_id integer
     */
    public int alliance_id;
    /**
     * character_id integer
     */
    public int character_id;
    /**
     * corporation_id integer
     */
    public int corporation_id;
    /**
     * damage_done integer
     */
    public int damage_done;
    /**
     * faction_id integer
     */
    public int faction_id;
    /**
     * Was the attacker the one to achieve the final blow
     * 
     */
    public boolean final_blow;
    /**
     * Security status for the attacker
     * 
     */
    public float security_status;
    /**
     * What ship was the attacker flying
     * 
     */
    public int ship_type_id;
    /**
     * What weapon was used by the attacker for the kill
     * 
     */
    public int weapon_type_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetKillmailsKillmailIdKillmailHashAttackers othersame = ((GetKillmailsKillmailIdKillmailHashAttackers) other);
        if (alliance_id!= othersame.alliance_id) {
            return false;
        }
        if (character_id!= othersame.character_id) {
            return false;
        }
        if (corporation_id!= othersame.corporation_id) {
            return false;
        }
        if (damage_done!= othersame.damage_done) {
            return false;
        }
        if (faction_id!= othersame.faction_id) {
            return false;
        }
        if (final_blow!= othersame.final_blow) {
            return false;
        }
        if (security_status!= othersame.security_status) {
            return false;
        }
        if (ship_type_id!= othersame.ship_type_id) {
            return false;
        }
        if (weapon_type_id!= othersame.weapon_type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((alliance_id + character_id)+ corporation_id)+ damage_done)+ faction_id)+ Boolean.hashCode(final_blow))+ Double.hashCode(security_status))+ ship_type_id)+ weapon_type_id);
    }
}
