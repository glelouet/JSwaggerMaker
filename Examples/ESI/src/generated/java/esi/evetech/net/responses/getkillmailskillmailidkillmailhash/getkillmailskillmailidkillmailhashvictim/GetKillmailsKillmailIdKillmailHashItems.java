package esi.evetech.net.responses.getkillmailskillmailidkillmailhash.getkillmailskillmailidkillmailhashvictim;

import esi.evetech.net.responses.getkillmailskillmailidkillmailhash.getkillmailskillmailidkillmailhashvictim.getkillmailskillmailidkillmailhashitems.GetKillmailsKillmailIdKillmailHashItemItems;

public class GetKillmailsKillmailIdKillmailHashItems {
    /**
     * Flag for the location of the item
     * 
     */
    public int flag;
    /**
     * item_type_id integer
     */
    public int item_type_id;
    /**
     * items array
     */
    public GetKillmailsKillmailIdKillmailHashItemItems[] items;
    /**
     * How many of the item were destroyed if any
     * 
     */
    public long quantity_destroyed;
    /**
     * How many of the item were dropped if any
     * 
     */
    public long quantity_dropped;
    /**
     * singleton integer
     */
    public int singleton;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetKillmailsKillmailIdKillmailHashItems othersame = ((GetKillmailsKillmailIdKillmailHashItems) other);
        if (flag!= othersame.flag) {
            return false;
        }
        if (item_type_id!= othersame.item_type_id) {
            return false;
        }
        if ((items!= othersame.items)&&((items == null)||(!items.equals(othersame.items)))) {
            return false;
        }
        if (quantity_destroyed!= othersame.quantity_destroyed) {
            return false;
        }
        if (quantity_dropped!= othersame.quantity_dropped) {
            return false;
        }
        if (singleton!= othersame.singleton) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((flag + item_type_id)+((items == null)? 0 :items.hashCode()))+ Long.hashCode(quantity_destroyed))+ Long.hashCode(quantity_dropped))+ singleton);
    }
}
