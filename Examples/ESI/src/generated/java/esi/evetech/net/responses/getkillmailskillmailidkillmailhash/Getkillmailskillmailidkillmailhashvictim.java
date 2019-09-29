package esi.evetech.net.responses.getkillmailskillmailidkillmailhash;

import esi.evetech.net.responses.getcorporationscorporationidbookmarks.Getcorporationscorporationidbookmarkscoordinates;
import esi.evetech.net.responses.getkillmailskillmailidkillmailhash.getkillmailskillmailidkillmailhashvictim.Getkillmailskillmailidkillmailhashitems;

public class Getkillmailskillmailidkillmailhashvictim {
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
     * How much total damage was taken by the victim
     * 
     */
    public int damage_taken;
    /**
     * faction_id integer
     */
    public int faction_id;
    /**
     * items array
     */
    public Getkillmailskillmailidkillmailhashitems[] items;
    /**
     * Coordinates of the victim in Cartesian space relative to the Sun
     * 
     */
    public Getcorporationscorporationidbookmarkscoordinates position;
    /**
     * The ship that the victim was piloting and was destroyed
     * 
     */
    public int ship_type_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getkillmailskillmailidkillmailhashvictim othersame = ((Getkillmailskillmailidkillmailhashvictim) other);
        if (alliance_id!= othersame.alliance_id) {
            return false;
        }
        if (character_id!= othersame.character_id) {
            return false;
        }
        if (corporation_id!= othersame.corporation_id) {
            return false;
        }
        if (damage_taken!= othersame.damage_taken) {
            return false;
        }
        if (faction_id!= othersame.faction_id) {
            return false;
        }
        if ((items!= othersame.items)&&((items == null)||(!items.equals(othersame.items)))) {
            return false;
        }
        if ((position!= othersame.position)&&((position == null)||(!position.equals(othersame.position)))) {
            return false;
        }
        if (ship_type_id!= othersame.ship_type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((alliance_id + character_id)+ corporation_id)+ damage_taken)+ faction_id)+((items == null)? 0 :items.hashCode()))+((position == null)? 0 :position.hashCode()))+ ship_type_id);
    }
}
