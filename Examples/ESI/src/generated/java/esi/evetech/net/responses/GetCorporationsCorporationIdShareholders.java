package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCorporationsCorporationIdShareholdersShareholderType;

public class GetCorporationsCorporationIdShareholders {
    /**
     * share_count integer
     */
    public long share_count;
    /**
     * shareholder_id integer
     */
    public int shareholder_id;
    /**
     * shareholder_type string
     */
    public GetCorporationsCorporationIdShareholdersShareholderType shareholder_type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCorporationsCorporationIdShareholders othersame = ((GetCorporationsCorporationIdShareholders) other);
        if (share_count!= othersame.share_count) {
            return false;
        }
        if (shareholder_id!= othersame.shareholder_id) {
            return false;
        }
        if ((shareholder_type!= othersame.shareholder_type)&&((shareholder_type == null)||(!shareholder_type.equals(othersame.shareholder_type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((Long.hashCode(share_count)+ shareholder_id)+((shareholder_type == null)? 0 :shareholder_type.hashCode()));
    }
}
