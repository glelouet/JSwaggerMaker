package esi.evetech.net.responses;

import esi.evetech.net.responses.getcorporationscorporationiddivisions.Getcorporationscorporationiddivisionshangar;

public class Getcorporationscorporationiddivisions {
    /**
     * hangar array
     */
    public Getcorporationscorporationiddivisionshangar[] hangar;
    /**
     * wallet array
     */
    public Getcorporationscorporationiddivisionshangar[] wallet;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        Getcorporationscorporationiddivisions othersame = ((Getcorporationscorporationiddivisions) other);
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
