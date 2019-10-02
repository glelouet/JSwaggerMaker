package esi.evetech.net.responses.getkillmailskillmailidkillmailhash.getkillmailskillmailidkillmailhashvictim.getkillmailskillmailidkillmailhashitems;

public class GetKillmailsKillmailIdKillmailHashItemItems {
    /**
     * flag integer
     */
    public int flag;
    /**
     * item_type_id integer
     */
    public int item_type_id;
    /**
     * quantity_destroyed integer
     */
    public long quantity_destroyed;
    /**
     * quantity_dropped integer
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
        GetKillmailsKillmailIdKillmailHashItemItems othersame = ((GetKillmailsKillmailIdKillmailHashItemItems) other);
        if (flag!= othersame.flag) {
            return false;
        }
        if (item_type_id!= othersame.item_type_id) {
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
        return ((((flag + item_type_id)+ Long.hashCode(quantity_destroyed))+ Long.hashCode(quantity_dropped))+ singleton);
    }
}
