package esi.evetech.net.responses.getcharacterscharacteridfittings;

import esi.evetech.net.structures.GetCharactersCharacterIdFittingsFlag;

public class GetCharactersCharacterIdFittingsItems {
    /**
     * flag string
     */
    public GetCharactersCharacterIdFittingsFlag flag;
    /**
     * quantity integer
     */
    public int quantity;
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
        GetCharactersCharacterIdFittingsItems othersame = ((GetCharactersCharacterIdFittingsItems) other);
        if ((flag!= othersame.flag)&&((flag == null)||(!flag.equals(othersame.flag)))) {
            return false;
        }
        if (quantity!= othersame.quantity) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((flag == null)? 0 :flag.hashCode())+ quantity)+ type_id);
    }
}
