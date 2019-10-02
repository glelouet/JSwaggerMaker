package esi.evetech.net.responses.getcorporationscorporationidstarbasesstarbaseid;

public class GetCorporationsCorporationIdStarbasesStarbaseIdFuels {
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
        GetCorporationsCorporationIdStarbasesStarbaseIdFuels othersame = ((GetCorporationsCorporationIdStarbasesStarbaseIdFuels) other);
        if (quantity!= othersame.quantity) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (quantity + type_id);
    }
}
