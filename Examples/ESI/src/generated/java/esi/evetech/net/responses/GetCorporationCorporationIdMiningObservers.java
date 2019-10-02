package esi.evetech.net.responses;

import esi.evetech.net.structures.GetCorporationCorporationIdMiningObserversObserverType;

public class GetCorporationCorporationIdMiningObservers {
    /**
     * last_updated string
     */
    public String last_updated;
    /**
     * The entity that was observing the asteroid field when it was mined.
     * 
     */
    public long observer_id;
    /**
     * The category of the observing entity
     */
    public GetCorporationCorporationIdMiningObserversObserverType observer_type;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other == null)||(other.getClass()!= getClass())) {
            return false;
        }
        GetCorporationCorporationIdMiningObservers othersame = ((GetCorporationCorporationIdMiningObservers) other);
        if ((last_updated!= othersame.last_updated)&&((last_updated == null)||(!last_updated.equals(othersame.last_updated)))) {
            return false;
        }
        if (observer_id!= othersame.observer_id) {
            return false;
        }
        if ((observer_type!= othersame.observer_type)&&((observer_type == null)||(!observer_type.equals(othersame.observer_type)))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((last_updated == null)? 0 :last_updated.hashCode())+ Long.hashCode(observer_id))+((observer_type == null)? 0 :observer_type.hashCode()));
    }
}
