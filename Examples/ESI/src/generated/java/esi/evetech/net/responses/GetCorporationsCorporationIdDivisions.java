package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationiddivisions.GetCorporationsCorporationIdDivisionsHangar;

public class GetCorporationsCorporationIdDivisions {
    /**
     * hangar array
     */
    public GetCorporationsCorporationIdDivisionsHangar[] hangar;
    /**
     * wallet array
     */
    public GetCorporationsCorporationIdDivisionsHangar[] wallet;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCorporationsCorporationIdDivisions othersame = ((GetCorporationsCorporationIdDivisions) other);
        if ((hangar!= othersame.hangar)&&((hangar == null)||(!hangar.equals(othersame.hangar)))) {
            return false;
        }
        if ((wallet!= othersame.wallet)&&((wallet == null)||(!wallet.equals(othersame.wallet)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((hangar == null)? 0 :hangar.hashCode())+((wallet == null)? 0 :wallet.hashCode()));
    }
}
