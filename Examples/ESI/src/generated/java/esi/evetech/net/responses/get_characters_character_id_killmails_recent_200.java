package esi.evetech.net.responses;

public class get_characters_character_id_killmails_recent_200 {
    /**
     * A hash of this killmail
     */
    public String killmail_hash;
    /**
     * ID of this killmail
     */
    public int killmail_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_characters_character_id_killmails_recent_200 othersame = ((get_characters_character_id_killmails_recent_200) other);
        if ((killmail_hash!= othersame.killmail_hash)&&((killmail_hash == null)||(!killmail_hash.equals(othersame.killmail_hash)))) {
            return false;
        }
        if (killmail_id!= othersame.killmail_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((killmail_hash == null)? 0 :killmail_hash.hashCode())+ killmail_id);
    }
}
