package esi.evetech.net.responses.getcharacterscharacteridstats;

public class GetCharactersCharacterIdStatsInventory {
    /**
     * abandon_loot_quantity integer
     */
    public long abandon_loot_quantity;
    /**
     * trash_item_quantity integer
     */
    public long trash_item_quantity;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCharactersCharacterIdStatsInventory othersame = ((GetCharactersCharacterIdStatsInventory) other);
        if (abandon_loot_quantity!= othersame.abandon_loot_quantity) {
            return false;
        }
        if (trash_item_quantity!= othersame.trash_item_quantity) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(abandon_loot_quantity)+ Long.hashCode(trash_item_quantity));
    }
}
