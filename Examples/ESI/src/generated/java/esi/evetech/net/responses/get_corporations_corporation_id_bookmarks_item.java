package esi.evetech.net.responses;

public class get_corporations_corporation_id_bookmarks_item {
    /**
     * item_id integer
     */
    public long item_id;
    /**
     * type_id integer
     */
    public int type_id;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        get_corporations_corporation_id_bookmarks_item othersame = ((get_corporations_corporation_id_bookmarks_item) other);
        if (item_id!= othersame.item_id) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(item_id)+ type_id);
    }
}
