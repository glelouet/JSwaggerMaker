package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationidstarbasesstarbaseid.GetCorporationsCorporationIdStarbasesStarbaseIdFuels;

public class GetLoyaltyStoresCorporationIdOffers {
    /**
     * Analysis kredit cost
     */
    public int ak_cost;
    /**
     * isk_cost integer
     */
    public long isk_cost;
    /**
     * lp_cost integer
     */
    public int lp_cost;
    /**
     * offer_id integer
     */
    public int offer_id;
    /**
     * quantity integer
     */
    public int quantity;
    /**
     * required_items array
     */
    public GetCorporationsCorporationIdStarbasesStarbaseIdFuels[] required_items;
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
        GetLoyaltyStoresCorporationIdOffers othersame = ((GetLoyaltyStoresCorporationIdOffers) other);
        if (ak_cost!= othersame.ak_cost) {
            return false;
        }
        if (isk_cost!= othersame.isk_cost) {
            return false;
        }
        if (lp_cost!= othersame.lp_cost) {
            return false;
        }
        if (offer_id!= othersame.offer_id) {
            return false;
        }
        if (quantity!= othersame.quantity) {
            return false;
        }
        if ((required_items!= othersame.required_items)&&((required_items == null)||(!required_items.equals(othersame.required_items)))) {
            return false;
        }
        if (type_id!= othersame.type_id) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((ak_cost + Long.hashCode(isk_cost))+ lp_cost)+ offer_id)+ quantity)+((required_items == null)? 0 :required_items.hashCode()))+ type_id);
    }
}
